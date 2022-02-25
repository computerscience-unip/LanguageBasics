package Java.BasicsConcepts.src.Examples;

// Nessa classe iremos revisar quais são as conversões dados
// que são divididas em implícita e explícita
public class Convert {

    // O primeiro tipo de conversão é a conversão implícita
    // A conversão entre tipos que pode ser realizada automaticamente é conhecida como Implícita
    // Aqui neste exemplo, não precisamos especificar o tipo de dados para o tipo de destino;
    // internamente, ele converterá o que está implícito
    // Isso ocorre porque o tipo de dado é compatível e o que diferencia é o seu tamanho onde não
    // altera o seu valor, ou seja, se um valor menor para o maior.. Caso ocorre o inverso um tipo
    // maior para o menor ele não seria implícita como veremos
    byte tipoByte = 127;
    short tipoShort = tipoByte ;
    int tipoInt = tipoShort;
    long tipoLong = tipoInt;
    short tipoShort2 = 32000;
    long tipoLong2 = tipoShort2;

    // O segundo de tipo de conversão é a conversão explícita
    // A conversão entre tipos que pode ser feita manualmente, em vez de automaticamente
    // podemos ver que valor é um tipo de dados long, para converter para o tipo int temos
    // que atribuir explicitamente o int indicando para qual tipo de dados temos que converter.
    // temos duas formas de fazer essa conversão que é por cast e por parse
    // cast == (tipo de dado)
    // tipodedado.Parse() == esse caso é para converter String para um tipo primitivo
    // CAST
    long tipoLong3 = 43560294;
    int tipoInt2 = (int) tipoLong3;
    short tipoShort3 = (short) tipoInt2;
    byte tipoByte2 = (byte) tipoShort3;

    // PARSE
    String tipoString = "123";
    byte tipoByte3 = Byte.parseByte(tipoString);
    short tipoShort4 = Short.parseShort(tipoString);
    int tipoInt3 = Integer.parseInt(tipoString);
    long tipoLong4 = Long.parseLong(tipoString);


    public void MostrarConversoes(){
        System.out.println("                                                   ");
        System.out.println("            CONVERSOES DE DADOS                    ");
        System.out.println("---------------------------------------------------");
        System.out.println("Conversão Implícita                                ");
        System.out.println("---------------------------------------------------");
        System.out.println("                                                   ");
        System.out.println("O valor da variável tipoByte é " + tipoByte         );
        System.out.println("O valor da variável tipoShort é " + tipoShort       );
        System.out.println("O valor da variável tipoInt é " + tipoInt           );
        System.out.println("O valor da variável tipoLong é " + tipoLong         );
        System.out.println("O valor da variável tipoShort2 é " + tipoShort2     );
        System.out.println("O valor da variável tipoLong2 é " + tipoLong2       );
        System.out.println("---------------------------------------------------");
        System.out.println("                                                   ");
        System.out.println("Conversão Explícita                                ");
        System.out.println("---------------------------------------------------");
        System.out.println("                                                   ");
        System.out.println("CAST                                               ");
        System.out.println("O valor da variável tipoLong3 é " + tipoLong3       );
        System.out.println("O valor da variável tipoInt2 é " + tipoInt2         );
        System.out.println("O valor da variável tipoShort3 é " + tipoShort3     );
        System.out.println("O valor da variável tipoByte2 é " + tipoByte2       );
        System.out.println("                                                   ");
        System.out.println("PARSE                                              ");
        System.out.println("O valor da variável tipoString é " + tipoString     );
        System.out.println("O valor da variável tipoByte3 é " + tipoByte3       );
        System.out.println("O valor da variável tipoShort4 é " + tipoShort4     );
        System.out.println("O valor da variável tipoInt3 é " + tipoInt3         );
        System.out.println("O valor da variável tipoLong4 é " + tipoLong4       );
        System.out.println("---------------------------------------------------");
    }
}