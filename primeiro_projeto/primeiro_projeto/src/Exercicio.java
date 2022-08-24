import java.util.Locale;

public class Exercicio {
    public static void main(String[] args) {

        /* Atribuição das variáveis string (produtos) */
        String produto1 = "Computador";
        String produto2 = "Teclado";
        String produto3 = "Mouse";
        String produto4 = "Placa mãe";
        String produto5 = "Gabinete";

        String nome = "Ruan";

        /* Atribuição da variável char */
        char genero = 'M';

        /* Atribuição da variável inteiro */
        int codigo = 1920;

        /* Atribuição das variáveis double (preços) */
        double preco1 = 3850.00;
        double preco2 = 299.99;
        double preco3 = 89.00;
        double preco4 = 569.80;
        double preco5 = 387.99;

        /* Calculo valor total */
        double total = preco1 + preco2 + preco3 + preco4 + preco5;

        /* Modelando impressão */

        System.out.println("Relatório de Vendas");
        System.out.printf(" Cliente: %s%n Gênero: %s%n Código: %s%n",
                nome,genero,codigo);
        System.out.println("----------------------------------------");

        System.out.println("Produtos: ");
        Locale.setDefault(Locale.US);
        System.out.printf(" %s - %.2f%n %s - %.2f%n %s - %.2f%n %s - %.2f%n %s - %.2f%n",
                produto1,
                preco1,
                produto2,
                preco2,
                produto3,
                preco3,
                produto4,
                preco4,
                produto5,
                preco5);

        System.out.println("----------------------------------------");

        System.out.printf("Total: %.2f%n", total);

    }
}
