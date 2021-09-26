import java.math.BigDecimal;

public class SalaryCalculator{


public static void main(String args[]){

	// using big decimal

	BigDecimal day_salary = new BigDecimal("374.34");
	BigDecimal loan_ded= new BigDecimal("102.4");
	BigDecimal bonus_amount= new BigDecimal("1202.4");
	System.out.println(day_salary.add(bonus_amount).subtract(loan_ded));



	//using double
        double day_salary1 = 374.34;
        double loan_ded1 =102.4;
        double bonus_amount1=1200.7;
       
        System.out.println((day_salary1 + bonus_amount1) - loan_ded1 );




}

}