public class TaxReturn {
    private double income;

    public TaxReturn(double income) {
        if (income < 0) {
            throw new IllegalArgumentException("Income can't be less than zero.");
        }
        this.income = income;
    }

    public void getTax(double income) {
        if (income <= 250000) {
            System.out.println("\nYour income : "+income+" this amount Tax is not applicable.");
        } else if (250000<income && income <= 500000) {
			System.out.println("\nYour income : "+income);
            income *= 0.05;
			System.out.println("Tax rate : 5% \nYour Tax Amount to pay : "+income);
        } else if (500000<income && income <= 1000000) {
			System.out.println("\nYour income : "+income);
            income *= 0.20;
			System.out.println("Tax rate : 20% \nYour Tax Amount to pay : "+income);
        } else if (income > 1000000){
			System.out.println("\nYour income : "+income);
            income *= 0.30;
			System.out.println("Tax rate : 30% \nYour Tax Amount to pay : "+income);
        } 
		
    }
}