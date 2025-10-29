public class principal {
    public static void main(String[] args) {
        contaBancaria minhaConta = new contaBancaria();
        minhaConta.setNumeroConta(1234567);
        minhaConta.setTitular("Chapolin");
        minhaConta.setSaldo(5000.00);

        minhaConta.exibeConta();

        minhaConta.setSaldo(2000.00);
        System.out.println("Novo saldo: " + minhaConta.getSaldo());

        idadePessoa newPessoa = new idadePessoa();
        newPessoa.setNome("Chaves");
        newPessoa.setIdade(7);

        idadePessoa newPessoa2 = new idadePessoa();
        newPessoa2.setNome("Florinda");
        newPessoa2.setIdade(45);

        System.out.println(newPessoa.getNome() + " tem " + newPessoa.getIdade() + " anos.");
        newPessoa.verificaIdade();

        System.out.println(newPessoa2.getNome() + " tem " + newPessoa2.getIdade() + " anos.");
        newPessoa2.verificaIdade();

        Produto produto1 = new Produto("Celular", 2000.00);
        System.out.println("Nome do Produto: " + produto1.getNomeProduto());
        System.out.println("Preço: " + produto1.getPreco());
        produto1.aplicaDesconto(10);
        System.out.println("Novo preço após o desconto: " + produto1.getPreco());

       aluno aluno1 = new aluno("Kiko", 5, 6.5, 5.5, 5);

       System.out.println("A média do aluno " + aluno1.getNomeAluno() + " é: " + aluno1.calculaMedia());

       livro livro1 = new livro("O Senhor dos Aneis", "Tolkien"){
       };
       livro1.exibirDetalhes();


    }

}
