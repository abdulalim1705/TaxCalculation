public class CompanyTax {
    private double cincome;

   
    public CompanyTax(double income) {
        if (cincome < 0) {
            throw new IllegalArgumentException("Income can't be less than zero.");
        }
        this.cincome = cincome;
    }

    public void NPTCompanyTax(double cincome) {
		System.out.println("\n\nNon Public Trated Conpany Income : "+cincome);
        cincome *=.35;
		System.out.println("Non Public Trated Company tax rate : 35% \nTax amount to pay : "+cincome);
		
    }
	
	public void PTCompanyTax(double cincome) {
		System.out.println("\n\nPublic Trated Conpany Income : "+cincome);
        cincome *=.25;
		System.out.println("Public Trated Company tax rate : 25% \nTax amount to pay : "+cincome);
		
    }
	
	public void BankTax(double cincome) {
		System.out.println("\n\nBank Income : "+cincome);
        cincome *=.40;
		System.out.println("Bank tax rate : 40% \nTax amount to pay : "+cincome);
		
    }
	
	
	
	public void MarBankTax(double income) {
		System.out.println("\n\nMarchand Bank Income : "+income);
        income *=.375;
		System.out.println("Marchand Bank tax rate : 37.5% \nTax amount to pay : "+income);
		
    }
	
	public void OtherTax(double inc) {
		System.out.println("\n\nTotal Income : "+inc);
        inc *=.45;
		System.out.println("Tax rate : 45% \nTax amount to pay : "+inc);
		
    }
	
	
}