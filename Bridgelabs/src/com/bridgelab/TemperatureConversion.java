package com.bridgelab;
import java.util.Scanner;

public class TemperatureConversion {
	
		double Celsius(double Fahrenheit) {
		return (Fahrenheit - 32)*5/9;	
		}
		double Fahrenheit(double Celsius) {
		return (Celsius * 9/5)+32;
		}
		public static void main(String[] args) {
		double Celsius;
		double Fahrenheit;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Type of Conversion 1.Fahrenheit to celsius 2.Celsius to Fahrenheit");
		int ch = s.nextInt();
		switch(ch) {
		case 1: System.out.println(" Enter Temperature in Fahrenheit ");
		Fahrenheit = s.nextDouble();
		TemperatureConversion ftoc = new TemperatureConversion();
		double result1=ftoc.Celsius(+Fahrenheit);
		System.out.println(" Temperature in Celsius = " +result1);
		break;
		case 2: System.out.println("Enter Temperature in Celsius");
		Celsius = s.nextDouble();
		TemperatureConversion ctof = new TemperatureConversion();
		double result2 = ctof.Fahrenheit(+Celsius);
		System.out.println("Temperature in Fahrenheit= "+result2);
		break;
		default: System.out.println("Enter valid choice");
		}
	}
}


