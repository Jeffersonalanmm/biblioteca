import java.util.Scanner;


public class Biblioteca {
    static Scanner scanner = new Scanner(System.in);
    static int[] livroAnoPublicacao = new int[30];
    static String[] livrosEmprestados,livroTitulo,livroAutor,usuarioNome = new String[30];
    int contadorIndice = 0;

    public static void main(String[] args) {
        int op;

        do {
            System.out.println("1- Adicionar livro:" +
                    "2 - Remover livro:" +
                    "3 - Listar livros:" +
                    "4 - Buscar livro:" +
                    "5 - Emprestar livro: " +
                    "6 - Devolver livro: " +
                    "7 - Adicionar usuário: " +
                    "8 - Listar usuários: " +
                    "0 - Sair: ");
            op = Integer.parseInt(scanner.nextLine());

            switch (op){
                case 1:
                    cadastrarLivro();
                break;
                case 2:

                break;
                case 3:
                   listarLivro();
                break;
                case 4:

                break;
                case 5:
                    System.out.println("Saindo...");
                break;
                default:
                    System.out.println("opção inválida!");
            }
        }while (op!= 0);

    }

    public static void cadastrarLivro(){
        System.out.println("Nome do Livro:");
        String nomeLivro = scanner.nextLine();
        livroTitulo[contadorIndice] = nomeLivro;
        System.out.println("Autor do Livro:");
        String livroAutor = scanner.nextLine();
        livroAutor[contadorIndice] = livroAutor;
        System.out.println("Ano de publicação");
        int anoPublicacao = scanner.nextInt();
        livroAnoPublicacao[contadorIndice] = anoPublicacao;
        contadorIndice+=1;
    }

    public static void buscarLivro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        titulo = titulo.toLowerCase();

        for (String livro : livroTitulo) {
            if (livro != null && livro.equals(titulo)) {
                System.out.println("Livro encontrado: " + titulo);
            }
        }
    }


    public static void removerLivro(){
        scanner.nextLine();
        System.out.println("Digite o título do livro que deseja remover: ");
        String titulo = scanner.nextLine();

        for(int i = 0; i<livroTitulo.length;i++){
            if(livroTitulo[i].equalsIgnoreCase(titulo)){
                
            }
        }

    }


    public static void listarLivro(){
        if (contadorIndice > 0){
            System.out.println("--- Lista de Livros ---");
            for (int i = 0; i < contadorIndice; i++){
                System.out.println(livros[i]);
            }
        }else{
            System.out.println("Nenhum livro encontrado!");
        }
    }

    public static void listarUsuario(){
        if (totalUsuarios > 0){
            System.out.println("--- Lista de Usuários ---");
            for (int i = 0; i < totalUsuarios; i++){
                System.out.println(usuarios[i]);
            }
        }else{
            System.out.println("Nenhum Usuário encontrado!");
        }
    }

    public static void cadastrarUsuario(){
        System.out.println("Nome do Usuário:");
        String nomeUsuario = scanner.nextLine();
        livroTitulo[contadorIndice] = nomeLivro;
        System.out.println("ID do usuário:");
        int id = scanner.nextInt();
        livroAutor[contadorIndice] = livroAutor;
        System.out.println("Livros emprestados");
        int anoPublicacao = scanner.nextInt();
        livroAnoPublicacao[contadorIndice] = anoPublicacao;
        contadorIndice+=1;
    }

}
