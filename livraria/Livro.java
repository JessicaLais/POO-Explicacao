package livraria;

public class Livro {
    int id;
    String titulo;
    String anoDePublicacao;
    String editora;
    int qtdPaginas;

    Livro(int id, String titulo, String ano, String editora, int qtdPag){//metodo construtor//
        this.id = id;
        this.titulo = titulo;
        this.anoDePublicacao = ano;
        this.editora = editora;
        this.qtdPaginas = qtdPag;
    }



    String detalhar(){
        String detalhe = "";

        detalhe+= "\nID: "+ this.id;
        detalhe+= "\nTitulo: "+ this.titulo;
        detalhe+= "\nAno de Publicação: "+ this.anoDePublicacao;
        detalhe+= "\nEditora: "+ this.editora;
        detalhe+= "\nQuantidade de Paginas: "+ this.qtdPaginas;

        return detalhe;
    }
}
