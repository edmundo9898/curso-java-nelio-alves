import java.util.Locale;

public class Program {
    public static void main(String[] args) {
       /*   int y = 28;
        double x = 10.35784;

        String nome = "Edmundo";
        int idade = 28;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);

        System.out.println(y);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);
        Locale.setDefault(Locale.US); // Localizou o formado USA por isso a saída foi 10.35
        System.out.printf("%.4f%n",x);


        System.out.println("Resultado do jogo: " + x + " METROS");
        System.out.printf("Resultado = %.2f Mestros%n ", x ); */

       // Teste da aula

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);
        System.out.printf("%s, which price is $ %.2f %n", product2, price2);

        System.out.printf("Record: %d  years old, code %d and gender: %s %n", age, code, gender);

        System.out.printf("Measue with eight decimal places: %.8f %n", measure);

        System.out.printf("Rouded (three decimal plaes): %.3f %n ", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US Decimal point: %.3f ", measure);


        // Pequena Prática.
        String funcionario1 = "Edmundo";
        String cargo1 = "Desenvolvedor backend java";
        int codeFuncionario = 15;
        double salarioFuncionario = 3500.0;

        System.out.printf("O funcionário %s do cargo %s, código %d, teve o salário aumentado para %.2f %n",funcionario1, cargo1, codeFuncionario, salarioFuncionario);




    }
}
