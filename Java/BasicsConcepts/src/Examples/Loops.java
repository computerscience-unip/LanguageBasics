package Java.BasicsConcepts.src.Examples;

// Nessa classe iremos revisar quais são os laços de repetições
// que são divididos em while, do-while, for, foreach
public class Loops {

    // As estruturas de repetição também são conhecidas como laços (loops)
    // e são utilizados para executar, repetidamente, uma instrução ou bloco
    // de instrução enquanto determinada condição estiver sendo satisfeita.

    // O termo while pode ser traduzido para o português como “enquanto”. Este
    // termo é utilizado para construir uma estrutura de repetição que executa,
    // repetidamente, uma única instrução ou um bloco delas “enquanto” uma expressão
    // booleana for verdadeira.
    public int lacoRepeticoaWhile(){
        int numero = 1;
        int soma = 0;

        while(numero <= 25){
            soma += numero;
            numero++;
        }

        return soma;
    }

    // A estrutura de repetição do-while é uma variação da estrutura while. Existe
    // uma diferença sutil, porém importante, entre elas. Em um laço while, a condição
    // é testada antes da primeira execução das instruções que compõem seu corpo. Desse
    // modo, se a condição for falsa na primeira vez em que for avaliada, as instrução desse
    // laço não serão executadas nenhuma vez
    public int lacoRepeticaoDoWhile(){
        int numero = 1;
        int soma = 0;
        do{
            soma += numero;
            numero++;
        }while(numero <= 25);

        return soma;
    }

    // O laço for é uma estrutura de repetição compacta. Seus elementos de inicialização,
    // condição e iteração são reunidos na forma de um cabeçalho e o corpo é disposto em seguida
    // O laço for e o laço while são apenas formas diferentes de uma mesma estrutura básica de
    // repetição. Qualquer laço for pode ser transcrito em termos de um laço while e vice-versa
    public int lacoRepeticaoFor(){
        int soma = 0;

        for(int numero = 1; numero <= 25; numero++){
            soma += numero;
        }

        return soma;

    }

    // Foreach é utilizado para realizar as varreduras em collections. Para cada iteração do for,
    // o elemento da iteração é atribuído à variável. Utilizando o enhanced-for, você é obrigado
    // a percorrer um array por exemplo
    public void lacoRepeticaoForeach(){
        int[] vetor = {1,2,3,4,5,6,7,8,9};

        for(int i : vetor){
            System.out.println(i);
        }

    }

    // Há situações em que é preciso interromper um laço antes que sua condição se torne falsa. É para isso que serve o break

}