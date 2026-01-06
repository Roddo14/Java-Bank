package com.bank.study.statictest;

public class Test {

    public static void main(String[] args) {
        Cliente.pais = "Portugal";

        Cliente c1 = new Cliente();
        c1.nome = "Antonio";

        Cliente c2 = new Cliente();
        c2.nome = "Rodrigo";

        Cliente c3 = new Cliente();
        c3.nome = "Ribeiro";

        Cliente.pais = "Brasil";


        System.out.println(c1.nome);
        System.out.println(c1.getPais());
        System.out.println(c2.nome);
        System.out.println(c2.getPais());
        System.out.println(c3.nome);
        System.out.println(c3.getPais());
    }
}
