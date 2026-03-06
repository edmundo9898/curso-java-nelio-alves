import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args){
        //Entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int a;
        double b;


        // Digitar uma palavra String
        x = sc.next();
        // Digitar um número inteiro
         a = sc.nextInt();
        // Digitar número flutuante
        b = sc.nextDouble();


        // sysout macete para system.out.println
        System.out.println("Dados digitados:");
        System.out.println("Você digitou uma String: " + x);
        System.out.println("Você digitou um numero: " + a);
        System.out.printf("Você digitou um numero: %.2f%n ",b);



        sc.close();

    }
}
