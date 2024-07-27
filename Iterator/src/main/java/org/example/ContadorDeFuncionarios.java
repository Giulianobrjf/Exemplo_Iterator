package org.example;

import java.util.Iterator;

public class ContadorDeFuncionarios {
    public static Integer contarFuncionariosAtivos(Empresa empresa) {
        int quantidade = 0;
        for (Funcionario funcionario : empresa) {
            if (funcionario.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalFuncionarios(Empresa empresa) {
        int quantidade = 0;
        for (Iterator<Funcionario> it = empresa.iterator(); it.hasNext(); ) {
            quantidade++;
            it.next();
        }
        return quantidade;
    }
}
