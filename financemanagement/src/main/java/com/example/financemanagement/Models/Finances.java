package com.example.financemanagement.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Finances {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @JsonProperty("userid")
    private  String userid;

    @JsonProperty("transactiontype")
    private String transactiontype;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("category")
    private String category;

    @JsonProperty("date")
    private String date;

    @JsonProperty("notes")
    private String notes;

    public Finances() {
    }

    public Long getId() {
        return Id;
    }

    public String getUserid() {
        return userid;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public String getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getNotes() {
        return notes;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

