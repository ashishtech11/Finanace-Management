package com.example.financemanagement.Repository;

import com.example.financemanagement.Models.Finances;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanceRepository extends JpaRepository<Finances,Long> {
}
