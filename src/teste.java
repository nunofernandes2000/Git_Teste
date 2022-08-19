import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        Scanner sc = new Scanner(System.in);
        String name;
        int idade;

        System.out.println("Bme vindo, qual é o teu nome?");
        name = sc.next();

        System.out.println("Bme vindo, qual é a tua idade?");
        idade = sc.nextInt();
    }
}
