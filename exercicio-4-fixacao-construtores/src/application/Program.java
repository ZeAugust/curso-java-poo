package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		System.out.print("Enter accont holder:");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Is there a inicial deposit (y/n)? ");
		char escolha = sc.next().charAt(0);
		
		if(escolha == 'y') {
			System.out.print("Enter de inicial deposit value: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println(conta);
		
		
		
		sc.close();
	}
}
