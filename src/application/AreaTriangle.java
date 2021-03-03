package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.sideA =  sc.nextDouble();
        x.sideB =  sc.nextDouble();
        x.sideC =  sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.sideA =  sc.nextDouble();
        y.sideB =  sc.nextDouble();
        y.sideC =  sc.nextDouble();

        double areaX = x.areaTriangle();
        double areaY = y.areaTriangle();
        System.out.printf("Area X = %.4f\n",areaX);
        System.out.printf("Area Y = %.4f\n",areaY);
        if(areaX > areaY){
            System.out.printf("Larger Area is Triangle X: %.4f", areaX);
        } else {
            System.out.printf("Larger Area is Triangle Y: %.4f", areaY);
        }
        sc.close();
    }
}
