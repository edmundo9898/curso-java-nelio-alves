import java.util.Scanner;

public class ExercicioCondicional02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Número Pár");
        }else {
            System.out.println("Número Impár");
        }


        sc.close();
    }
}
