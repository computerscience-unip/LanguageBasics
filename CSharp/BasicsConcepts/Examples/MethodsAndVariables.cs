using System;
namespace BasicsConcepts.Examples
{
    public class MethodsAndVariables
    {
        public MethodsAndVariables(string nome, string sobrenome) 
        {
            this.Nome = nome;
            this.Sobrenome = sobrenome;
        }
        // As variáveis são posições na memória do computador que
        // podem armazenar dados. As variáveis são formadas por
        // quatro elementos: nome, tipo, tamanho e valor.
        // A variáveis também são conhecidas como propriedades ou
        // atributo de uma classe
        public string Telefone;

        // Public - Modificador de acesso mais permissivo que existe.
        // Atributos, métodos e classes declarados como public são
        // acessíveis por qualquer classe do Java.
        // Em UML, é definido pelo símbolo “+”.
        // Todos os métodos e atributos declarados como public são
        // herdados pelas subclasses.
        //Métodos e atributos declarados como public devem se manter
        // public em todas as subclasses.
        public String Nome;

        // Protected - É um modificador de acesso um pouco mais
        // permissivo que o private. Atributos e métodos declarados
        // como protected são acessíveis pela classe que os declara,
        // suas subclasses em outros pacotes e outras classes dentro
        // do mesmo pacote.
        // Em UML, é definido pelo símbolo “#”.
        // Métodos e atributos declarados com o modificador protected
        // numa superclasse devem ser definidos como protected ou public
        // em suas subclasses e nunca private.
        protected String Codigo = "1";

        // Private - É o modificador de acesso mais restritivo que existe.
        // Atributos e métodos declarados como private são acessíveis somente
        // pela classe que os declara.
        // Em UML, é definido pelo símbolo “-”.
        // Métodos e atributos com o modificador private não são herdados.
        private String Cpf;

        // Defaul - Modificador de acesso padrão, usado quando nenhum for
        // definido. Neste caso os atributos, métodos e classes são visíveis
        // por todas as classes dentro do mesmo pacote.
        // Em UML, é definido pelo símbolo “~”
        String TipoCliente;

        public String Sobrenome;

        // As variáveis podem serem static sendo assim ela ficará armazenada
        // na memória stack da aplicação, ou seja, em termos mas simples podemos
        // utilizar a variavel sem declarar a mesma
        public static bool Logado;

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
            System.Console.WriteLine(@"O cliente chama-se {0} {1}", this.Nome, this.Sobrenome);
        }

        // Os metódos tem o seu tipo de retorno que pode ser do tipo
        // void, ou algum tipo de dados como byte, short, int, long,
        // float, double, char, boolean, String, Array, Object
        // quando o tipo de retorno for void quer dizer que o método
        // não tem retorno caso seja ou contrário de void é obrigatório
        // dentro do escopo conter a palavra reservada return com o tipo
        // de retorno declarado
        public int RetornarCodigoComoInteiro(){
            return System.Convert.ToInt32(this.Codigo);
        }

        // Os métodos static ou métodos da classe são funções que não
        // dependem de nenhuma variável de instância, quando invocados
        // executam uma função sem a dependência do conteúdo de um objeto
        // ou a execução da instância de uma classe, conseguindo chamar
        // direto qualquer método da classe e também manipulando alguns
        // campos da classe.
        public static void MostrarMesagemStatus(){
            if(Logado) {
                string status = "logado";
                System.Console.WriteLine(@"Sr° está {0}, obrigado por escolher nossos serviços", status);
            }
            else{
                String status = "deslogado";
                System.Console.WriteLine("Sr° está {0}, obrigado por escolher nossos serviços", status);
            }
        }

        // Os métodos static tem um relacionamento com uma classe como um todo,
        // enquanto os métodos que não são static são associados a uma instância
        // de classe específica (objeto) e podem manipular as variáveis de instância
        // do objeto, como pode ser visto nos exemplos de declarações de métodos.
        public void MostrarDados(){
            System.Console.WriteLine("Os dados do cliente são: \nCódigo: {0} \nNome: {1} \nSobrenome: {2} \nCPF: {3} \nTelefone: {4}", 
                                     this.Codigo, this.Nome, this.Sobrenome, this.Cpf, this.Telefone);
        }

        // Os metódos podem ou não ter paramêtros
        // Os parametros sempre temos que informa-los com o tipo de dados do mesmo
        // Os parametros fica entre os parentêses do metódo
        // Os parametros eles são acessiveis apenas dentro do escopo do metódo
        // Quando o metódo tem parametros devemos quando chamar o mesmo passar os
        // parametros para o metódo, vale ressaltar que parametros são variáveis
        // e são atribuídos valores aos mesmo quando chamamos o metódo e passos os
        // valores para os mesmo
        public bool CompararNome(String nomeParametro){
            return this.Nome == nomeParametro;
        }

    }
}