
import javax.swing.*;

public class CalculateCreditScore {
	
	public static int annualSalary(Employee temp) {
		int annual = 0;
		annual = 12*temp.getSalary();
		return annual;
	}// end annualSalary method	

	public static int creditScore(Employee temp) {
		int age = 2014 - temp.getYear();
		int salary = 12*temp.getSalary();
		int credit = 0;
		do{
		if (age < 40 && salary < 40) credit = 550;
		else if (age > 40 && salary < 40) credit = 600;
		else if (age < 40 && salary > 40) credit = 650;
		else if (age > 40 && salary > 40) credit = 700;
		else credit = 700;
		} while (credit > 0);
		return credit;
	}// end creditScore method	
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Doug", 1980, 4000);
		int b1 = 0;
		int m1 = 0;
		boolean wrongYear = true;
		boolean wrongPay = true;
		
		// set name
		String n1 = JOptionPane.showInputDialog(null, "Enter your name", "Credit Score", JOptionPane.QUESTION_MESSAGE);
		e1.setName(n1);
		
		// set year
		do{
			
		String y1 = JOptionPane.showInputDialog(null, "Enter year of birth (yyyy)", "Credit Score", JOptionPane.QUESTION_MESSAGE);
			
		try{
		b1 = Integer.parseInt(y1);
		wrongYear = false;
		}//end try
		catch(NumberFormatException e){
		wrongYear = true;	
		}//end catch
		if(b1 > 2014) wrongYear = true; 
		}//end while
		while(wrongYear);
		e1.setYear(b1);
		
		
		//set salary
		do{
			
		String s1 = JOptionPane.showInputDialog(null, "Enter your monthly salary (round to thousands, no decimals)", "Credit Score", JOptionPane.QUESTION_MESSAGE);
			
		try{
		m1 = Integer.parseInt(s1);
		wrongPay = false;
		}//end try
		catch(NumberFormatException e){
		wrongPay = true;	
		}//end catch
		if(m1 > 20) wrongPay = true; 
		}//end while
		while(wrongPay);
		e1.setSalary(m1);
		
		int salary = annualSalary(e1);
		int score = creditScore(e1);
	
		//show results
		JOptionPane.showMessageDialog(null, "Your annual salary is:" + salary + "and your credit score is:" + score, "Credit Score", JOptionPane.INFORMATION_MESSAGE);
		
	}//end main

}//end class
