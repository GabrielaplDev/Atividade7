import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, cpf;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine().trim();

        while (nome.isEmpty()) {
            System.out.println("Nome não pode ser vazio. Digite novamente: ");
            nome = scanner.nextLine().trim();
        }

        System.out.println("Digite seu CPF: ");
        cpf = scanner.nextLine().trim();

        while (cpf.length() != 11) {
            System.out.println("CPF inválido. Digite novamente: ");
            cpf = scanner.nextLine().trim();
        }

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        while (idade < 0 || idade > 120) {
            System.out.println("Idade inválida. Digite novamente: ");
            idade = scanner.nextInt();
        }

        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
}
