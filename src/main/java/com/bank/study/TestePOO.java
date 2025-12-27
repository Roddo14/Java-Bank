package com.bank.study;

public class TestePOO {
    public static void main(String[] args) {
        PessoaStudy p1 = new PessoaStudy();
        //primitivo
        int idade = 30;
        //nao primitivo
        String nome = "Teste";

        if(30 == idade){

        }

        if(nome.equals("Rodrigo")){

        }

        p1.nome = "Antonio";
        p1.setNomePrivate("Serra");
        System.out.println(p1.getNomePrivate());
        p1.nif = "123456789";
        p1.morada = "Lisboa";

        System.out.println(p1.nome);
        System.out.println(p1.morada);

        PessoaStudy p2 = new PessoaStudy();
        p2.nome = "Rodrigo";
        p2.nif = "123456789";
        p2.morada = "Lisboa";

        System.out.println(p2.nome);
        System.out.println(p2.morada);
    }
}
