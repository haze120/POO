package com.controleponto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {

        Gerente gerente =new Gerente();
        gerente.setIdFuncionario(1);
        gerente.setNome("Lucas Borges");
        gerente.setEmail("Lucas.borges@gmail.com");
        gerente.setDocumento("5465468784");
        gerente.setLogin("gerente123");
        gerente.setSenha("senha123");

        Operador operador = new Operador();
        operador.setIdFuncionario(2);
        operador.setNome("Kaique Otakera");
        operador.setEmail("otaku2000@hotmail.com");
        operador.setDocumento("65468765465");
        operador.setValorHora(2.5);

        Secretaria secretaria = new Secretaria();
        secretaria.setIdFuncionario(3);
        secretaria.setNome("Daeneris Targarian");
        secretaria.setEmail("khalesse@got.com");
        secretaria.setDocumento("12313456");
        secretaria.setRamal("036");
        secretaria.setTelefone("3846-6621");

        RegistroPonto r1 = new RegistroPonto();
        RegistroPonto r2 = new RegistroPonto();
        RegistroPonto r3 = new RegistroPonto();


        r1.setIdRegPonto(1234);
        r1.setFunc(gerente);
        r1.setDataReg(LocalDate.now());
        r1.setHoraEntrada(LocalDateTime.now());
        Thread.sleep(1000);
        r1.setHoraSaida(LocalDateTime.now());

        r2.setIdRegPonto(2234);
        r2.setFunc(gerente);
        r2.setDataReg(LocalDate.now());
        r2.setHoraEntrada(LocalDateTime.now());
        Thread.sleep(1000);
        r2.setHoraSaida(LocalDateTime.now());

        r3.setIdRegPonto(3234);
        r3.setFunc(gerente);
        r3.setDataReg(LocalDate.now());
        r3.setHoraEntrada(LocalDateTime.now());
        Thread.sleep(1000);
        r3.setHoraSaida(LocalDateTime.now());

        r1.apresentarRegistroPonto();
        r2.apresentarRegistroPonto();
        r3.apresentarRegistroPonto();

    }
}
