import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicional05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cod, qtd;
        double preco,total = 0;

        cod = sc.nextInt();
        qtd = sc.nextInt();

        if (cod == 1){
            preco = 4.0;
            total = preco * qtd;
        }else if(cod == 2){
            preco = 4.50;
            total = preco * qtd;
        }else if(cod == 3){
            preco = 5.0;
            total = preco * qtd;
        }else if(cod == 4){
            preco = 2.0;
            total = preco * qtd;
        }else if(cod == 5){
            preco = 1.5;
            total = preco * qtd;
        }else {
            System.out.println("Código Incorreto");
        }
        System.out.printf("O valor da conta é: R$ %.2f%n  ", total);
        sc.close();

        /*  CORREÇÃO
        int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);





         */

    }
}
