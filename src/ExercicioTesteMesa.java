import java.util.Scanner;

public class ExercicioTesteMesa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 5;
        int y = 0;

        x = sc.nextInt();
        y = sc.nextInt();

        while(x > 2){
            System.out.print(x);
            y = y + x;
            x = x - 1;
        }


        sc.close();
    }
}
