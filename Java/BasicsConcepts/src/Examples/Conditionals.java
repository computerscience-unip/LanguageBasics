package Java.BasicsConcepts.src.Examples;

import java.util.Arrays;

// Nessa classe iremos revisar quais são os desvios condicionais
// que são divididos em desvio simples, composto e aninhado/encadeado
public class Conditionals {

    // A estrutura de decisão que contém apenas um bloco permite que executemos ou não
    // um bloco de instrução conforme valor de uma condição seja ela verdadeira ou falsa.
    public void desvioCondicionalSimples(){
        String nome = "Pedro";

        // Desvio Condicional Simples
        if(!nome.isBlank()){
            System.out.println("Olá, " + nome);
        }

    }

    // A estrutura de decisão que contém mais de um bloco permite que execute dois blocos de instrução
    // dependendo a decisão obtida.
    public boolean desvioCondicionalComposto(){
        String nome = "Pedro";

        // Desvio Composto
        if(nome.isBlank()){
            return true;
        }
        else{
            return false;
        }
    }

    // O Desvio Condicional Aninhado, nada mais é do que o encadeamento de estruturas de decisão compostas
    // em um algoritmo. Também chamamos a esse tipo de estrutura de Desvio Condicional Encadeado.
    public boolean desvioCondicionalAninhadoOuEncadeado(){
        String[] mamiferos = new String[]{"baleia", "cachorro", "macaco", "canguru", "camelo"};
        String animal = "canguru";

        // Desvio Condicional Aninhado ou Encadeado
        if(!animal.isBlank()){
            if(Arrays.asList(mamiferos).contains(animal)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    // Outro tipo de desvio é o Switch/case que é uma estrutura de condição que define
    // o código a ser executado com base em uma comparação de valores.
    public String switchCase(){
        String fruta = "mamão";

        // Switch Case
        switch (fruta) {
            case "laranja":
                return "O preço da laranja é R$2.59 o kilo.";
            case "mangas":
                return "O preço da mana é R$6.99 o kilo";
            case "mamão":
                return "O preço do mamão é R$9.99 o kilo";
            default:
                return null;
        }
    }

}