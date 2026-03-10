import java.util.Scanner;
import java.util.Locale;
 class Exercicio05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPieces, codPieces2, numPieces, numPieces2;
        double valuePieces, valuePieces2, totalPieces1, totalPieces2, totalSum;

        codPieces = sc.nextInt();
        numPieces = sc.nextInt();
        valuePieces = sc.nextDouble();
        codPieces2 = sc.nextInt();
        numPieces2 = sc.nextInt();
        valuePieces2 = sc.nextDouble();

        totalPieces1 =  numPieces * valuePieces;
        totalPieces2 =  numPieces2 * valuePieces2;

        totalSum = totalPieces1 + totalPieces2;

        System.out.printf("Valor %.2f%n", totalSum);



        sc.close();


    }
}
