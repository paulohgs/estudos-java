package application;

import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;


public class DollarConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarValue = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarQuantity = sc.nextDouble();
        System.out.printf(
                "Amount to be paid in reais = R$ %.2f",
                CurrencyConverter.converter(dollarValue, dollarQuantity)
        );

        sc.close();
    }
}
