import org.example.ContadorDeFuncionarios;
import org.example.Empresa;
import org.example.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContadorDeFuncionariosTest {

    @Test
    public void deveContarFuncionariosAtivos() {
        Empresa empresa = new Empresa(
                new Funcionario("Funcionario 1", true),
                new Funcionario("Funcionario 2", false),
                new Funcionario("Funcionario 3", true)
        );
        assertEquals(2, ContadorDeFuncionarios.contarFuncionariosAtivos(empresa));
    }

    @Test
    public void deveContarTotalDeFuncionarios() {
        Empresa empresa = new Empresa(
                new Funcionario("Funcionario 1", true),
                new Funcionario("Funcionario 2", false),
                new Funcionario("Funcionario 3", true)
        );
        assertEquals(3, ContadorDeFuncionarios.contarTotalFuncionarios(empresa));
    }
}
