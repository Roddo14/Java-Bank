package com.bank.study.statictest;

public class Cliente {
    public String nome;
    public static String pais;


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        Cliente.pais = pais;
    }
}
