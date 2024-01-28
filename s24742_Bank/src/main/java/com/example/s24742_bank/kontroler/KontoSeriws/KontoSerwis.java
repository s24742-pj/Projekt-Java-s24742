package com.example.s24742_bank.kontroler.KontoSeriws;


import com.example.s24742_bank.Konto;
import com.example.s24742_bank.KontoRepository.KontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.validation.Valid;

import java.math.BigDecimal;
import java.util.List;

@Service
public class KontoSerwis {


    @Autowired
    private KontoRepository kontoRepository;

    public Konto rejestracjaKonta (@Valid Konto konto) {
        if (konto.getSaldo().compareTo(BigDecimal.ZERO) < 0 ){
            throw new IllegalArgumentException("Saldo musi byc dodatnie");
        }
        return kontoRepository.save(konto);

    }

    public Konto getKontoById(Long id) {
        return kontoRepository.findById(id).orElse(null);
    }

    public List<Konto> getKontoaWithSaldoGreaterThan(BigDecimal amout){
        return kontoRepository.findBySaldoGreaterThan(amout);
    }
}
