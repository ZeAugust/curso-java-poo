package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rectangle retangulo;
		retangulo = new rectangle();
		
		
		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		double area = retangulo.area();
		double perimetro = retangulo.perimeter();
		double diagonal = retangulo.diagonal();
		
		System.out.printf("AREA = %.2f\n", area);
		System.out.printf("PERIMETER = %.2f\n", perimetro);
		System.out.printf("DIAGOLNAL = %.2f", diagonal);
		
		sc.close();
	}
}
