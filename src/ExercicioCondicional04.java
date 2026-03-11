import java.util.Scanner;

public class ExercicioCondicional04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;


        if (horaFinal > horaInicial ) {
             duracao = horaFinal - horaInicial;
            System.out.println("o jogo durou:" + duracao);
        }else{
            duracao = 24 - horaInicial + horaFinal;
            System.out.println("o jogo durou:" + duracao);

        }
        // // O println fica fora do if/else pois a mensagem é igual nos dois casos,
        // apenas o valor de duracao muda. Evita repetição de código.
        //System.out.println("O JOGO DUROU " + duracao + " HORA(S)");


        }




    }

