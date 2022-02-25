package Java.BasicsConcepts.src;

import Java.BasicsConcepts.src.Examples.Convert;
import Java.BasicsConcepts.src.Examples.Operators;
import Java.BasicsConcepts.src.Examples.Datatypes;
import Java.BasicsConcepts.src.Examples.MethodsAndVariables;
import Java.BasicsConcepts.src.Examples.Loops;
import Java.BasicsConcepts.src.Examples.Conditionals;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancia de Tipos de dados para mostrar no terminal
        //Datatypes tiposDeDados = new Datatypes();
        //tiposDeDados.MostrarTipos();

        // Instancia de Conversor de dados para mostrar no terminal
        //Convert conversaoDeDados = new Convert();
        //conversaoDeDados.MostrarConversoes();

        // Instancia de Operadores paa mostrar no terminal
        //Operators operadores = new Operators();
        //operadores.mostrarOperadores();

        MethodsAndVariables variaveisMetodos = new MethodsAndVariables();
        variaveisMetodos.nome = "Maria";
        variaveisMetodos.sobrenome = "Nazaré";
        variaveisMetodos.telefone = "1299999-8888";
        variaveisMetodos.MostrarDados();
        variaveisMetodos.CompararNome("José");
        variaveisMetodos.MostrarNomeComSobrenome();
        int codigoCliente = variaveisMetodos.retornarCodigoComoInteiro(); // o metódo retorna um valor por isso temos que atribui-lo a um variável
    }
}
