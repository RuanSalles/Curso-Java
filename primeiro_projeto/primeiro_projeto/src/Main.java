import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        double x = 20.1092812;
        String nome = "Ruan Sales";
        int idade = 28;
        double renda = 4000.00;
        System.out.println("Mensagem: Olá Mundo!");
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado = %.2f Metros %n", x);

        System.out.println("-----------------------------------------------");

        System.out.printf("%s tem %d e ganha R$ %.2f reais por mês %n", nome, idade, renda);


    }
}
