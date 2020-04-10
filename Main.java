package com.codewithme;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        System.out.println("1.C to F");
        System.out.println("2.F to C");
        System.out.println("0.exit");
        System.out.println("Enter your choice! ");
        int choice=scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter C degree: ");
                double celsius=scanner.nextDouble();
                System.out.println("F degree is :"+ celsiusToFahrenheit(celsius));
                break;
            case 2:
                System.out.println("Enter F degree: ");
                double fahrenheit=scanner.nextDouble();
                System.out.println("C degree is :" +fahrenheitToCelsius(fahrenheit));
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Enter degree");
        }


    }

    public static double celsiusToFahrenheit(double celsius){
        double F=32+(9*celsius/5);
        return  F;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double C=5*(fahrenheit-32)/9;
        return  C;
    }


}
