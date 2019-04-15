
import java.util.Scanner;


public class TaxCalculation{
    public static void main(String[] args) {
		
		System.out.println("Please reply one for calculation.");
		System.out.println("1. For Income Tax.\n2. For Valu Added Tax(VAT).\n3. For Company Tax.\n");
        Scanner input = new Scanner(System.in);
		int kind = input.nextInt();
		
		if(kind == 1){
			System.out.print("Please enter your income : ");
			double income = input.nextDouble();
			
			TaxReturn tax = new TaxReturn(income);
			tax.getTax(income);
			
		}else if(kind == 2){
			System.out.print("Please enter your price : ");
			double price = input.nextDouble();
			
			Vat vat = new Vat(price);
			vat.getVat(price);
		}else if(kind == 3){
			System.out.println("Please reply one for calculation : \n1. Non Public Trated Company.\n2. Public Trated Company. \n3. Bank.\n4. Marchand bank. \n5. Cigerate Manufacturing Company.\n6. Mobile Operator company.");
			int sec = input.nextInt();
			
			if(sec == 1 ){
				System.out.print("Please enter your company income : ");
				double cincome = input.nextDouble();
				CompanyTax tax = new CompanyTax(cincome);
				tax.NPTCompanyTax(cincome);
				
			}else if(sec == 2 ){
				System.out.print("Please enter your company income : ");
				double cincome = input.nextDouble();
				CompanyTax tax = new CompanyTax(cincome);
				tax.PTCompanyTax(cincome);
				
			}else if(sec == 3 ){
				System.out.print("Please enter your Bank income : ");
				double cincome = input.nextDouble();
				CompanyTax tax = new CompanyTax(cincome);
				tax.BankTax(cincome);
				
			}else if(sec == 4 ){
				System.out.print("Please Enter Your Marchand Bank income : ");
				double income = input.nextDouble();
				CompanyTax tax = new CompanyTax(income);
				tax.MarBankTax(income);
				
			}else if(sec == 5 || sec == 6 ){
				System.out.print("Please Enter Your Marchand Bank income : ");
				double inc = input.nextDouble();
				CompanyTax tax = new CompanyTax(inc);
				tax.OtherTax(inc);
				
			}else{
				System.out.println("\nYour input is not valid.\nPlease enter correct one.");
				
			}
			
			
			
		}else{
			System.out.println("\nYour input is not valid.\nPlease enter correct one.");
		}
		
    }
}