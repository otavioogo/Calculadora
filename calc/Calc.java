import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        double n1, n2;
        double somar, subtrair, multiplicar, divisao;
        int ler;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor 1 e 2: ");
        n1 = (scan.nextDouble());
        n2 = (scan.nextDouble());

        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        ler = scan.nextInt();
        switch (ler) {
            case 1:
                somar = n1 + n2;
                System.out.println("A Soma: " + somar);
                break;

            case 2:
                subtrair = n1 - n2;
                System.out.println("A subtracao: " + subtrair);
                break;

            case 3:
                multiplicar = n1 * n2;
                System.out.println("A multiplicacao: " + multiplicar);
                break;

            case 4:
                divisao = n1 / n2;
                System.out.println("A divisao: " + divisao);

                break;

            default:
                System.out.println("*4*ERRO*4*");
                break;
        }

    }

}
