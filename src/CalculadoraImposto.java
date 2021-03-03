import java.util.Scanner;

public class CalculadoraImposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;
        int saida;
        do {
            System.out.print("Digite seu salário!\n");
            salario = sc.nextDouble();
            if (salario < 0) {
                System.out.println("Digite um valor válido de salário!\n");
            } else {
                if (salario <= 2000) {
                    System.out.printf("O seu salário é R$%.2f e você está isento de imposto!", salario);
                } else if ((salario >= 2000.01) && (salario <= 3000)) {
                    double imposto;
                    imposto = (salario * 0.08);
                    System.out.printf("O seu salário é R$ %.2f e você vai pagar R$%.2f", salario, imposto);
                } else if ((salario >= 3000.01) && (salario <= 4500)) {
                    double imposto;
                    imposto = (salario * 0.18);
                    System.out.printf("O seu salário é R$ %.2f e você vai pagar R$%.2f", salario, imposto);
                } else if (salario > 4500.00) {
                    double imposto;
                    imposto = (salario * 0.28);
                    System.out.printf("O seu salário é R$ %.2f e você vai pagar R$%.2f", salario, imposto);
                }
            }
            System.out.println("\nDeseja testar outro salário? 1 - continuar | 2 - sair");
            saida = sc.nextInt();
        } while (saida == 1);
        sc.close();
    }
}
