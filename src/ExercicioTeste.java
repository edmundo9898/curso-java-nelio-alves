import java.util.Locale;
import java.util.Scanner;

public class ExercicioTeste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double hora = sc.nextDouble();
        double preco = 0;

        if ( hora <= 1 ){
            preco = 5;

        }
        else if (hora <= 3){
            preco = 5 + ( hora - 1) * 3;
        }
        else if (hora <= 5) {
            preco = 5 + 2 * 3 + (hora - 3) * 2;
        }
        else if (hora > 5) {
            preco = 5 + 2 * 3 + 2 * 2 + (hora - 5) * 7;
        }
        System.out.println("Valor a pagar: " + preco);
    }
}
