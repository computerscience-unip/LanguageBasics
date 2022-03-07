using System.Collections.Generic;
using System.Linq;
using System;

namespace BasicsConcepts.Examples
{
    // Nessa classe iremos revisar quais são os desvios condicionais
    // que são divididos em desvio simples, composto e aninhado/encadeado
    public class Conditionals {

        // A estrutura de decisão que contém apenas um bloco permite que executemos ou não
        // um bloco de instrução conforme valor de uma condição seja ela verdadeira ou falsa.
        public void desvioCondicionalSimples(){
            string nome = "Pedro";

            // Desvio Condicional Simples
            if(nome != null && nome != string.Empty){
                Console.WriteLine(@"Olá, {0}", nome);
            }

        }

        // A estrutura de decisão que contém mais de um bloco permite que execute dois blocos de instrução
        // dependendo a decisão obtida.
        public bool desvioCondicionalComposto(){
            string nome = "Pedro";

            // Desvio Composto
            if(nome != null && nome != string.Empty){
                return true;
            }
            else{
                return false;
            }
        }

        // O Desvio Condicional Aninhado, nada mais é do que o encadeamento de estruturas de decisão compostas
        // em um algoritmo. Também chamamos a esse tipo de estrutura de Desvio Condicional Encadeado.
        public bool desvioCondicionalAninhadoOuEncadeado(){
            string[] mamiferos = new string[]{"baleia", "cachorro", "macaco", "canguru", "camelo"};
            string animal = "canguru";

            // Desvio Condicional Aninhado ou Encadeado
            if(animal != null && animal != string.Empty){
                if(mamiferos.Contains(animal)){
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
        public string switchCase(){
            string fruta = "mamão";

            // Switch Case
            switch (fruta) {
                case "laranja":
                    return "O preço da laranja é R$2.59 o kilo.";
                case "mangas":
                    return "O preço da mana é R$6.99 o kilo";
                case "mamão":
                    return "O preço do mamão é R$9.99 o kilo";
                default:
                    return string.Empty;
            }
        }

    }
}

