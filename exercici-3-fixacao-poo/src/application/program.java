package application;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		student aluno; 
		
		
		aluno = new student();
		
		aluno.name = sc.nextLine();
		aluno.grade1 = sc.nextDouble();
		aluno.grade2 = sc.nextDouble();
		aluno.grade3 = sc.nextDouble();
		
		aluno.finalGrade();
		
		
		sc.close();
	}

}
