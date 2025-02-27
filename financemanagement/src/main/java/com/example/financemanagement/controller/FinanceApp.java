package com.example.financemanagement.controller;

import com.example.financemanagement.Models.Finances;
import com.example.financemanagement.Repository.FinanceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FinanceApp {
    @Autowired
    private FinanceRepository financeRepository;
    @Transactional
    @PostMapping("/financeEntry")
    public ResponseEntity<Map<String,String>> financeEntry(@RequestBody Finances finance){
        Finances finObj = financeRepository.save(finance);
        Map<String ,String> response = new HashMap<>();
        response.put("Status","Finance Added");
        return ResponseEntity.ok(response);
    }
    @GetMapping("/viewFinance")
    public ResponseEntity<List<Finances>>financeList(){
        List<Finances> finances = financeRepository.findAll();
        return ResponseEntity.ok(finances);
    }
}
