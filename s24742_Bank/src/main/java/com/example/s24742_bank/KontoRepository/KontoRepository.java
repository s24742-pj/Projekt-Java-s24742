package com.example.s24742_bank.KontoRepository;

import com.example.s24742_bank.Konto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface KontoRepository extends JpaRepository<Konto, Long> {

    Konto findByPesel(String pesel);

    List<Konto> findBySaldoGreaterThan(BigDecimal amount);
    }



