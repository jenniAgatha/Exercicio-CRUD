import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static ArrayList<String> usuarios = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao=0;

        while (opcao !=5){


            System.out.println(" Adicionar Usuários -->      Digite 1");
            System.out.println("Listar Usuários -->          Digite 2");
            System.out.println("Para Atualizar  -->          Digite 3");
            System.out.println("Para remover Usuário-->      Digite 4");
            System.out.println("Sair do sistema -->          Digite 5");


            System.out.println("Escolha uma opção:");
            opcao=sc.nextInt();
            sc.nextLine();



            if (opcao == 1) {
                System.out.println("Nome do usuário:");
                sc.nextLine();
                String nome = sc.nextLine();
                usuarios.add(nome);
                System.out.println("Usuário adicionado com sucesso!");
                System.out.println(usuarios);

            }
            if (opcao == 2) {
                System.out.println("Lista de usuários:");
                System.out.println(usuarios);
            }

        }
    }
}