import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static ArrayList<String> usuarios = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {


            System.out.println(" Adicionar Usuários -->      Digite 1");
            System.out.println("Listar Usuários -->          Digite 2");
            System.out.println("Para Atualizar  -->          Digite 3");
            System.out.println("Para remover Usuário-->      Digite 4");
            System.out.println("Sair do sistema -->          Digite 5");


            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();
            sc.nextLine();


            if (opcao == 1) {
                System.out.println("Nome do usuário:");
//                sc.nextLine();
                String nome = sc.nextLine();
                usuarios.add(nome);
                System.out.println("Usuário adicionado com sucesso!");
                System.out.println(usuarios);

            } else if (opcao == 2) {
                System.out.println("Lista de usuários:");
                System.out.println(usuarios);

            } else if (opcao == 3) {

                if (usuarios.isEmpty()) {
                    System.out.println("Nenhum usuário para atualizar.");
                } else {


                    System.out.println("Lista de usuários:");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println("ID " + i + ": " + usuarios.get(i));
                    }


                    System.out.print("Digite o ID do usuário que deseja atualizar: ");
                    int indice = sc.nextInt();
                    sc.nextLine();


                    if (indice >= 0 && indice < usuarios.size()) {
                        System.out.print("Digite o novo nome do usuário: ");
                        String novoNome = sc.nextLine();

                        usuarios.set(indice, novoNome);
                        System.out.println("Usuário atualizado com sucesso!");
                    } else {
                        System.out.println("ID inválido!");
                    }
                }
            }



             else if (opcao == 4) {
                if (usuarios.isEmpty()) {
                    System.out.println("Nenhum usuário para deletar.");
                }

                else {
                    System.out.println("Digite o ID que deseja deletar");
                    int indice = Integer.parseInt(sc.nextLine());


                    if (usuarios.get(indice)==null)
                    {
                        System.out.println("índice inválido!");
                    }
                    else {
                        usuarios.remove(indice);
                    }
                }
            }
            else if (opcao==5)
            {
                System.out.println("Saindo...");

            }

        }
    }
}
