package util;


public class CurrencyConverter {
	
	public static double converteDolar(double valorDolar, double qndDolar) {
		
		double totalPago = valorDolar*qndDolar*1.06;
		
		return totalPago; 
	}
	
}
