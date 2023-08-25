package livraria;

import java.util.Scanner;

public class sistema {

    public static void main(String[] args) {
     
    int opcao = 0;
    Scanner scanner = new Scanner(System.in);
    Livraria livraria = new Livraria();

     while(opcao!=4){
        System.out.println("1-Adicoinar Livros");   
        System.out.println("2-Lsitar Livros");   
        System.out.println("3-Detalhar Livros");   
        System.out.println("4-SAIR ");   
    opcao = scanner.nextInt();
    executaropcao(opcao);
     }
     System.out.println("Sistema Encerrado");   
     scanner.close();
    }
    public static void executaropcao(int op, Scanner scanner){
    
    switch(op){
    case 1:
    System.out.println("Adicionando Livro...");
    System.out.println("Digite o ID:");
    int id =  scanner.Nextint();
    System.out.println("Digite o titulo:");
    String tit =  scanner.Nextint();
    System.out.println("Digite o ano:");
    String ano =  scanner.Nextint();
    System.out.println("Digite a editora:");
    String ed =  scanner.Nextint();
    System.out.println("Digite a quantidade de Paginas:");
    int qtdPag =  scanner.Nextint();

    Livro 1 = new Livro(id,tit,ano,ed,qtdPag);
    livraria.adicionarLivro(1);

    break;
    case 2: 
    System.out.println("Adicionando Livro...");
    break;
    case 3: 
    System.out.println("Detalhando Livro...");
    break;
    
}
    }
}
