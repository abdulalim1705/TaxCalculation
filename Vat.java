public class Vat{
	
	double price;
	public Vat(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price can't be less than zero.");
        }
        this.price = price;
    }
	
	public void getVat(double price) {
        double vat = price*15/100;
		System.out.println("\n\nPrice is : "+price+ "\nVAT Rate is 15% \nAmount of vat is : "+vat);
		
    }
	
	
}