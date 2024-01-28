package com.example.s24742_bank;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Currency;

@Entity
@Table(name = "konta")
public class Konto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "pesel", nullable = false)
    private String pesel;
    @Column(name = "saldo", nullable = false)
    private BigDecimal saldo;

    @Column(name = "waluta", nullable = false)
    private Currency waluta;

    @Column(name = "Imie", nullable = false)
    private String imie;

    @Column(name = "Nazwisko", nullable = false)
    private String nazwisko;

    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getPesel() {
        return pesel;
    }
    public void setPesel(String pesel){
        this.pesel = pesel;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

    public Currency getWaluta() {
        return waluta;
    }
    public void setWaluta(Currency waluta){
        this.waluta = waluta;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie){
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }


}

