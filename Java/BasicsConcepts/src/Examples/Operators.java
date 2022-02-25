package Java.BasicsConcepts.src.Examples;

// Nessa classe iremos revisar o que são operadores
// existindo os operadores aritméricos, relacionais,
// atribuição, incremento e decremento, igualdade e
// precedencia de operadores
// para as variáveis
public class Operators {
    // Operadores de Atribuição
    // O operador de atribuição é utilizado para definir
    // o valor inicial ou sobrescrever o valor de uma variável.
    // Em seu uso, o operando à esquerda representa a variável
    // para a qual desejamos atribuir o valor informado à direita.
    // aqui podemos ver o operador de atribuição
    String atribuicao = " = ";
    int numero1 = 6;
    int numero2 = 3;

    // Operadores Aritméticos
    // Os operadores aritméticos realizam as operações fundamentais
    // da matemática entre duas variáveis e retornam o resultado.
    int soma = numero1 + numero2; // para somar duas variaveis
    int subrtracao = numero1 - numero2; // para subtrair duas variáveis
    int multiplicacao = numero1 * numero2; // para multiplicar duas variáveis
    double divisao = numero1 / numero2; // para dividir duas variáveis
    double restoDivisao = numero1 % numero2; // para obter o resto da divisão

    // Operadores de Incremento e Decremento
    // Os operadores de incremento e decremento também são bastante
    // utilizados. Basicamente temos dois deles:++ e --, os quais podem
    // ser declarados antes ou depois da variável e incrementam ou
    // decrementam em 1 o valor da variável.
    // Esse modo ele pode vir antes ou depois da variável sendo um modo de
    // atribuição
    int numero1Incrementado = numero1++; // incremento
    int numero1Decrementado = numero1--; // decremento
    int exemplo = numero1 * numero2++; // aqui ele multiplica depois incrementa
    int exemplo2 = numero1 * ++numero2; // aquie ele incrementa depois multiplica

    // Operadores de Igualdade
    // Os operadores de igualdade verificam se o valor ou o resultado da
    // expressão lógica à esquerda é igual (“==”) ou diferente (“!=”) ao
    // da direita, retornando um valor booleano.
    String operadorIgual = " == "; // igual
    String operadorDiferente = " != "; // diferente
    boolean eIgual = numero1 == numero2; // retorna um valor lógico
    boolean eDiferente = numero1 != numero2; // retorna um valor lógico

    // Operadores Relacionais
    // Os operadores relacionais, assim como os de igualdade, avaliam dois
    // operandos. Neste caso, mais precisamente, definem se o operando à
    // esquerda é menor, menor ou igual, maior ou maior ou igual ao da direita,
    // retornando um valor booleano.
    String operadorMaior = " > "; // maior
    String operadorMenor = " < "; // menor
    String operadorMaiorOuIgual = " >= "; // maior ou igual
    String operadorManorOuIgual = " <= "; // menor ou igual
    boolean eMaior = numero1 > numero2;
    boolean eMenor = numero1 < numero2;
    boolean eMaiorOuIgual = numero1 >= numero2;
    boolean eManorOuIgual = numero1 <= numero2;

    // Operadore Lógicos
    // Os operadores lógicos representam o recurso que nos permite criar expressões
    // lógicas maiores a partir da junção de duas ou mais expressões. Para isso,
    // aplicamos as operações lógicas E (representado por “&&”) e OU (representado
    // por “||”).
    String operadorAnd = " && "; // And (e)
    String operadorOr = " || "; // Or (ou)
    String operadorNot = " ! "; // Not (negação)
    boolean exemploAnd = numero1 > numero1Decrementado && numero1 > numero1Incrementado;
    boolean exemploOr = numero1 > numero1Decrementado || numero1 > numero1Incrementado;
    boolean exemploNot = numero1 > numero1Decrementado && !(numero1 > numero1Incrementado);

    public void mostrarOperadores(){
        System.out.println("                                               ");
        System.out.println("-----------------------------------------------");
        System.out.println("                   OPERADORES                  ");
        System.out.println("-----------------------------------------------");
        System.out.println("                                               ");
        System.out.println("Operador de Atribuição                         ");
        System.out.println("-----------------------------------------------");
        System.out.println("Tipo = " + atribuicao);
        System.out.println("Exemplo: " + numero1);
        System.out.println("Exemplo: " + numero2);
        System.out.println("-----------------------------------------------");
        System.out.println("                                               ");
        System.out.println("Operador de Aritméticos                        ");
        System.out.println("-----------------------------------------------");
        System.out.println("Tipos = [ + ; - ; * ; / ; % ]");
        System.out.println("Exemplo soma [ + ]: " + soma);
        System.out.println("Exemplo subtração [ - ]: " + subrtracao);
        System.out.println("Exemplo multiplicação [ * ]: " + multiplicacao);
        System.out.println("Exemplo divisão [ / ]: " + divisao);
        System.out.println("Exemplo resto da divisão [ % ]: " + restoDivisao);
        System.out.println("-----------------------------------------------");
        System.out.println("                                               ");
        System.out.println("Operador de Incremento e Decremento            ");
        System.out.println("-----------------------------------------------");
        System.out.println("Tipos = [ ++ ; --]");
        System.out.println("Exempo incremento [ ++ ]: " + numero1Incrementado);
        System.out.println("Exempo decremento [ -- ]: " + numero1Decrementado);
        System.out.println("Exempo incremento após um operação [ ++ ]: " + exemplo);
        System.out.println("Exempo incremento antes um operação[ ++ ]: " + exemplo2);
        System.out.println("-----------------------------------------------");
        System.out.println("                                               ");
        System.out.println("Operador de Igualdade                          ");
        System.out.println("-----------------------------------------------");
        System.out.println("Tipo = [ " + operadorIgual + " ; " + operadorDiferente +" ]");
        System.out.println("Exemplo igualdade [ == ]: " + eIgual);
        System.out.println("Exemplo diferente [ != ]: " + eDiferente);
        System.out.println("-----------------------------------------------");
        System.out.println("                                               ");
        System.out.println("Operador de Relacionais                        ");
        System.out.println("-----------------------------------------------");
        System.out.println("Tipo = [ " + operadorMaior + " ; " + operadorMenor + " ; " + operadorMaiorOuIgual + " ; " + operadorManorOuIgual + "]");
        System.out.println("Exemplo maior [ > ]:" + eMaior);
        System.out.println("Exemplo maior [ < ]:" + eMenor);
        System.out.println("Exemplo maior [ >= ]:" + eMaiorOuIgual);
        System.out.println("Exemplo maior [ <= ]:" + eManorOuIgual);
        System.out.println("-----------------------------------------------");
        System.out.println("                                               ");
        System.out.println("Operador de Lógicos                            ");
        System.out.println("-----------------------------------------------");
        System.out.println("Tipo = [" + operadorAnd + " ; " + operadorOr + " " + operadorNot + " ]");
        System.out.println("Exemplo and [ && ]: " + exemploAnd);
        System.out.println("Exemplo and [ || ]: " + exemploOr);
        System.out.println("Exemplo and [ ! ]: " + exemploNot);
        System.out.println("-----------------------------------------------");
    }

}