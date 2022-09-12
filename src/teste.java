import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        Scanner sc = new Scanner(System.in);
        String name;
        int idade;
        int DtNascimento;

        System.out.println("Beme vindo, qual é o teu nome?");
        name = sc.next();

        System.out.println("Beme vindo, qual é a tua idade?");
        idade = sc.nextInt();

        System.out.println("Beme vindo, qual é a tua data de nascimento");
        DtNascimento = sc.nextInt();
    }
}
