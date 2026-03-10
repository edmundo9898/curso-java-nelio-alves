import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numFuncionario, horasTrabalhadas;
        double valorPorHoras, salary;



        numFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorPorHoras = sc.nextDouble();

        salary = valorPorHoras * horasTrabalhadas;

        System.out.printf("Numero do trabalhador: %d%n", numFuncionario);
        System.out.printf("Salário do trabalhador:$%.2f%n", salary);





        sc.close();
    }
}
