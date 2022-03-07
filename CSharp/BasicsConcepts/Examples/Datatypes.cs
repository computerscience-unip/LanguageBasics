namespace BasicsConcepts.Examples
{
    // Nessa classe iremos revisar o que são tipos de dados primitivos
    // e por referência só que apensa a entidade String
    // e quais são os tipos de variavéis
    public class Datatypes
    {
        // Os tipos primitivos são tipos de dados especiais internos à linguagem,
        // não sendo objetos criados a partir de uma classe

        // O podemos dividir em grupos os tipos primitivos
        // Tipos primitivos números inteiros

        // o primeiro tipo é o byte que tem o tamanho de 8bits e uma faixa entre
        // -128 a 127 e o seu valor padrão é 0
        byte tipoByte;

        // o segundo tipo é o short que tem o tamanho de 16bits e uma faixa entre
        // -32.768 a 32.767 e o seu valor padrão é 0
        short tipoShort;

        // o terceiro tipo é o int que tem o tamanho de 32bits e uma faixa entre
        // -2^31 a 2^31-1 e o seu valor padrão é 0
        int tipoInt;

        // o quarto tipo é o long que tem o tamanho de 64bits e uma faixa entre
        // -2^63 a 2^63-1 e o seu valor padrão é 0L
        long tipoLong;

        // Tipos primitivos números de ponto flutuante
        // o quito tipo é o float que tem o tamanho de 32bits e uma faixa entre
        // IEEE 754 ±1,40129846432481707e-45 a 3,40282346638528860e+38
        // e o seu valor padrão é 0f
        float tipoFloat;

        // o sexto tipo é o double que tem o tamanho de 64bits e uma faixa entre
        // IEEE 754 ±4,94065645841246544e-324 a 1,79769313486231570e+308
        // e o seu valor padrão é 0
        double tipoDouble;

        // Tipos primitivos de caracteres - char
        // o sétimo tipo é o char que tem o tamanho de 16bits e uma faixa entre
        // '\u0000' a '\uffff' e o seu valor padrão é 'u0000'
        char tipoChar;

        // Tipos primitivos lógicos - boolean
        // o oitavo tipo é o boolean que tem o tamanho de 1bit podendo ser
        // true o false e o seu valor padrão é false
        bool tipoBooleano;

        // variáveis de tipos por referência para armazenar as localizações
        // de objetos na memória do computador. Esses objetos que são referenciados
        // podem conter várias variáveis de instância e métodos dentro do objeto apontado.

        // os tipos por referência são Strings, Arrays Primitivos e Objetos
        // o primeiro tipo é a String é uma cadeia de caracteres(char) o valor padrão
        // desse tipo é null assim como todos os tipos por referêcia
        string tipoString = "exemplo";

        // Método para apresentar os tipos dedos declarados na classe
        public void MostrarTipos(){
            Console.WriteLine("                                                                                                                     ");
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("                                                    TIPOS DE DADOS                                                   ");
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("                                                                                                                     ");
            Console.WriteLine("Tipos Primitivos                                                                                                     ");
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("Tipos Primitivos com números inteiros                                                                                ");
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("O primeiro tipo primitivo é o byte, sua variável chama tipoByte o seu valor padrão é " + tipoByte                     );
            Console.WriteLine("O valor mínimo para esse tipo é " + byte.MinValue + " e o valor máximo para esse tipo é " + byte.MaxValue           );
            Console.WriteLine("                                                                                                                     ");
            Console.WriteLine("O segundo tipo primitivo é o short, sua variável chama tipoShort com valor de " + tipoShort                           );
            Console.WriteLine("O valor mínimo para esse tipo é " + short.MinValue + " e o valor máximo para esse tipo é " + short.MaxValue         );
            Console.WriteLine("                                                                                                                     ");
            Console.WriteLine("O tercero tipo primitivo é o int, sua variável chama tipoInt com valor de " + tipoInt                                 );
            Console.WriteLine("O valor mínimo para esse tipo é " + int.MinValue + " e o valor máximo para esse tipo é " + int.MaxValue     );
            Console.WriteLine("                                                                                                                     ");
            Console.WriteLine("O quarto tipo primitivo é o long, sua variável chama tipoLong com valor de " + tipoLong                               );
            Console.WriteLine("O valor mínimo para esse tipo é " + long.MinValue + " e o valor máximo para esse tipo é " + long.MaxValue           );
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("                                                                                                                     ");
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("Tipos Primitivos com números de ponto flutuante                                                                      ");
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("O quinto tipo primitivo é o float, sua variável chama tipoFloat o seu valor padrão é " + tipoFloat                    );
            Console.WriteLine("O valor mínimo para esse tipo é " + float.MinValue + " e o valor máximo para esse tipo é " + float.MaxValue         );
            Console.WriteLine("                                                                                                                     ");
            Console.WriteLine("O sexto tipo primitivo é o double, sua variável chama tipoDouble o seu valor padrão é " + tipoDouble                  );
            Console.WriteLine("O valor mínimo para esse tipo é " + double.MinValue + " e o valor máximo para esse tipo é " + double.MaxValue       );
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("                                                                                                                     ");
            Console.WriteLine("Tipos Primitivos com caracteres                                                                                      ");
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("O sétimo tipo primitivo é o char, sua variável chama tipoChar o seu valor padrão é " + tipoChar                       );
            Console.WriteLine("O valor mínimo para esse tipo é " + char.MinValue + " e o valor máximo para esse tipo é " + char.MaxValue);
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("                                                                                                                     ");
            Console.WriteLine("Tipos Primitivos lógicos                                                                                             ");
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("O sétimo tipo primitivo é o char, sua variável chama tipoChar o seu valor padrão é " + tipoChar                       );
            Console.WriteLine("O valor mínimo para esse tipo é " + char.MinValue + " e o valor máximo para esse tipo é " + char.MaxValue );
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("                                                                                                                     ");
            Console.WriteLine("Tipos por Referência String                                                                                          ");
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine("O primeiro tipo por referência é o String, sua variável chama tipoString esse tipo não tem um valor padrão, ou seja, " +
                            "\né necessário declarar um valor inicial para a variável o valor atribuído foi " +tipoChar                            );
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------");

        }
    }
}