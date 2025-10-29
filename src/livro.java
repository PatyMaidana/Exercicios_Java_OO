public class livro {
    private String tituloLivro;
    private String autor;

    public livro(String tituloLivro, String autor){
        this.tituloLivro = tituloLivro;
        this.autor = autor;
     }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
     public void exibirDetalhes (){
        System.out.println("O livro " + getTituloLivro() + " é da autorida de " + getAutor());
     }

}
