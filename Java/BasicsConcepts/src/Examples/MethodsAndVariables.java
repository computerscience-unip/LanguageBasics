package Java.BasicsConcepts.src.Examples;

// Essa classe tem o objetivo de mostrar o que são variáveis e
// o que são metodos e suas particularidades
public class MethodsAndVariables {

    // As variáveis são posições na memória do computador que
    // podem armazenar dados. As variáveis são formadas por
    // quatro elementos: nome, tipo, tamanho e valor.
    // A variáveis também são conhecidas como propriedades ou
    // atributo de uma classe
    public String telefone;

    // Public - Modificador de acesso mais permissivo que existe.
    // Atributos, métodos e classes declarados como public são
    // acessíveis por qualquer classe do Java.
    // Em UML, é definido pelo símbolo “+”.
    // Todos os métodos e atributos declarados como public são
    // herdados pelas subclasses.
    //Métodos e atributos declarados como public devem se manter
    // public em todas as subclasses.
    public String nome;

    // Protected - É um modificador de acesso um pouco mais
    // permissivo que o private. Atributos e métodos declarados
    // como protected são acessíveis pela classe que os declara,
    // suas subclasses em outros pacotes e outras classes dentro
    // do mesmo pacote.
    // Em UML, é definido pelo símbolo “#”.
    // Métodos e atributos declarados com o modificador protected
    // numa superclasse devem ser definidos como protected ou public
    // em suas subclasses e nunca private.
    protected String codigo = "1";

    // Private - É o modificador de acesso mais restritivo que existe.
    // Atributos e métodos declarados como private são acessíveis somente
    // pela classe que os declara.
    // Em UML, é definido pelo símbolo “-”.
    // Métodos e atributos com o modificador private não são herdados.
    private String cpf;

    // Defaul - Modificador de acesso padrão, usado quando nenhum for
    // definido. Neste caso os atributos, métodos e classes são visíveis
    // por todas as classes dentro do mesmo pacote.
    // Em UML, é definido pelo símbolo “~”
    String tipoCliente;

    public String sobrenome;

    // As variáveis podem serem static sendo assim ela ficará armazenada
    // na memória stack da aplicação, ou seja, em termos mas simples podemos
    // utilizar a variavel sem declarar a mesma
    public static boolean logado;

    // Os métodos são conhecidos como funções, ações de execuções
    // ou procedimentos, sendo responsáveis por ajudar no design
    // do sistema (separação por blocos), e na reutilização de
    // software, podendo ser aproveitados métodos já existentes
    // para a construção de novos sistemas.
    // As classes que armazenam esses métodos são conhecidas como
    // projetos de objetos, onde são definidos os atributos que o
    // objeto terá e os métodos projetados para realizar as tarefas
    // da classe.
    public void MostrarNomeComSobrenome(){
        System.out.println("O cliente chama-se " + this.nome + " " + this.sobrenome);
    }

    // Os metódos tem o seu tipo de retorno que pode ser do tipo
    // void, ou algum tipo de dados como byte, short, int, long,
    // float, double, char, boolean, String, Array, Object
    // quando o tipo de retorno for void quer dizer que o método
    // não tem retorno caso seja ou contrário de void é obrigatório
    // dentro do escopo conter a palavra reservada return com o tipo
    // de retorno declarado
    public int retornarCodigoComoInteiro(){
        return Integer.parseInt(this.codigo); // a palavra this se refere ao atributo ou método que está dentro da classe
    }

    // Os métodos static ou métodos da classe são funções que não
    // dependem de nenhuma variável de instância, quando invocados
    // executam uma função sem a dependência do conteúdo de um objeto
    // ou a execução da instância de uma classe, conseguindo chamar
    // direto qualquer método da classe e também manipulando alguns
    // campos da classe.
    public static void MostrarMesagemStatus(){
        if(logado) {
            String status = "logado";
            System.out.println("Sr° está " + status + ", obrigado por escolher nossos serviços");
        }
        else{
            String status = "deslogado";
            System.out.println("Sr° está " + status + ", obrigado por escolher nossos serviços");
        }
    }

    // Os métodos static tem um relacionamento com uma classe como um todo,
    // enquanto os métodos que não são static são associados a uma instância
    // de classe específica (objeto) e podem manipular as variáveis de instância
    // do objeto, como pode ser visto nos exemplos de declarações de métodos.
    public void MostrarDados(){
        System.out.println("Os dados do cliente são: \nCódigo: " + this.codigo +
                            " Nome: " + this.nome +
                            " Sobrenome: " + this.sobrenome +
                            " CPF: " + this.cpf +
                            " Telefone: " + this.telefone );
    }

    // Os metódos podem ou não ter paramêtros
    // Os parametros sempre temos que informa-los com o tipo de dados do mesmo
    // Os parametros fica entre os parentêses do metódo
    // Os parametros eles são acessiveis apenas dentro do escopo do metódo
    // Quando o metódo tem parametros devemos quando chamar o mesmo passar os
    // parametros para o metódo, vale ressaltar que parametros são variáveis
    // e são atribuídos valores aos mesmo quando chamamos o metódo e passos os
    // valores para os mesmo
    public boolean CompararNome(String nomeParametro){
        return this.nome == nomeParametro;
    }

}