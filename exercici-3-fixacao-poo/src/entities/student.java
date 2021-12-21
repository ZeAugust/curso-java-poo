package entities;

public class student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public double finalGrade;
	
	public void finalGrade() {
		
		finalGrade = grade1 + grade2 + grade3;
		System.out.printf("FINAL GRADE: %.2f\n", finalGrade);
		if (finalGrade < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - finalGrade);
		}else {
			System.out.println("PASS");
		}
	}
	
	
	
}
