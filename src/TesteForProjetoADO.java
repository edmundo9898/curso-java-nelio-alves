import java.util.Scanner;

public class TesteForProjetoADO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] aves = new String[5];

        for (int i = 0; i < 5; i++) {
             System.out.println("Digite o nome da ave");
             String nome = sc.nextLine();
             aves[i] = nome;
             System.out.println("Ave cadastrada: " + nome);
        }
        System.out.println("\nLista de aves cadastradas");
        for (int i = 0; i < aves.length; i++){
            System.out.println("Ave " + (i+1) + ": " + aves[i]);
        }
        System.out.println("Total de aves cadastradas " + aves.length);


        String resposta = "s";
        while( resposta.equalsIgnoreCase("S")){
            System.out.println("Digite o nome da ave");
            String nomeExtra = sc.nextLine();
            System.out.println("Ave cadastrada: " + nomeExtra);

            System.out.println("Deseja Cadastrar mais aves ? s/n");
            resposta = sc.nextLine();


        }

        sc.close();
    }
}
