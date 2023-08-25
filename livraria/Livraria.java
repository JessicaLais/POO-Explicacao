package livraria;

import java.util.ArrayList;

public class Livraria {
    ArrayList<Livro> livros;//declaração dos atributos livros,
    
    Livraria(){
        this.livros = new ArrayList<Livro>();
    }
    public void adicionarLivro(Livro lv){
        this.livros.add(lv);
    }
    public String listarLivros(){
        String folha = "";//acessa o array de forma individual e verifica. Comando:foreach//
        for (Livro livro : this.livros) {
            folha += "\n" + livro.id  + " - " + livro.titulo;
        }
        return folha;
    }
}
