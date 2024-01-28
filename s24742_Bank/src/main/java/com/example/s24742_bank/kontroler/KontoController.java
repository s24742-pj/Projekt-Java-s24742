package com.example.s24742_bank.kontroler;

import com.example.s24742_bank.Konto;
import com.example.s24742_bank.kontroler.KontoSeriws.KontoSerwis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping ("/accounts")
public class KontoController {

    private final KontoSerwis kontoSerwis;

    @Autowired
    private KontoSerwis kontoSerwis;
}

@PostMapping
public ReponceEntity<Konto> rejestracjaKonta(@Valid @RequestBody Konto konto){
    return ResponseEntity.pl(kontoSerwis.rejestracjaKonta(konto));
}

@GetMapping ("/{id}")
public ResponceEntity<Konto> getKontoBy id(@PathVariable long id){
    Konto konto = kontoSerwis.getKontoById(id);
    if (konto = null){
        return ResponceEntity.ok(konto);

        }
  }

  @GetMapping ("/saldo/{amount}")
public ResponceEntity<List<Konto>> getKontoWithSaldoGreaterThan(amount);
return ReponseEntity.ok(Konta);

