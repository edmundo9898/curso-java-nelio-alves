import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        /* Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();


        double area = 3.14159 * Math.pow(raio, 2.0);

        System.out.printf("Resultado da area : A=%.4f%n",area);



        sc.close(); */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R, A, pi = 3.14159;

        R = sc.nextDouble();

        A = pi * R * R;

        System.out.printf("A=%.4f%n", A);

        sc.close();




    }
}
