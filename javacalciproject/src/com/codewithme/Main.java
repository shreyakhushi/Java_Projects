package com.codewithme;


 import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
final int year=12;
final int percent=100;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Principal:");
       double principal_value= scanner.nextDouble();

        System.out.print("Annual Interest Rate:");
       double ANR_value= scanner.nextFloat();
  double MIR_value= (ANR_value/percent)/year; // monthly income value calculated by ((annual income rate )divide by100) multiply year (12)


        System.out.print("Period(year):");
       int year_value= scanner.nextInt();
       int numberOfPay= year_value*year; // n= year value *12(year constant)

        System.out.print("Mortgage:");
        double Mortgage=  principal_value* (MIR_value* (Math.pow(1+MIR_value,numberOfPay)) ) / ((Math.pow(1+MIR_value,numberOfPay))-1); //formula of mortgage

     String mortgageFormatted =  NumberFormat.getCurrencyInstance().format(Mortgage); // converted the value of mortgage int0 currency

        System.out.println("Mortgage value:"+ mortgageFormatted);


        // in this majorly I have used the formatting numbers and reading inputs




    }
}
