package com.bank.study;

public class PessoaStudy {
    String nif;
    public String nome;
    private String nomePrivate;
    protected String nomeProtected;
    String morada;

    public void run(){
        System.out.println("correndo");
    }

    public String getNomePrivate(){
        return this.nomePrivate;
    }

    public void setNomePrivate(String nomePrivate){
        this.nomePrivate = nomePrivate;
    }

}
