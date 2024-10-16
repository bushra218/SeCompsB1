package BUSH_JAVA;

class Product {
	String name;
	double price;
	int quantity;

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	void displayInformation() {
		System.out.println("Name:" + name + " Price: " + price + " Quantity: " + quantity);

	}

	void updatePrice(double price) {
		this.price = price;
	}

	void quantity(int quantity) {
		this.quantity = quantity;
	}

	void stockValue(double price, int quantity) {
		System.out.println("Total stock value=" + price * quantity);
	}
}

public class InstantiateObjects {

	public static void main(String[] args) {
		Product p = new Product("Hair Care Shampoo", 40.0, 5);
		System.out.println("Details of product:\n");
		p.displayInformation();
		
		System.out.println("\nUpdated price and quatity:\n");
		p.updatePrice(45.0);
		p.quantity(8);
		p.displayInformation();
		
		p.stockValue(p.price, p.quantity);

		System.out.println("\n Thank You \n Name: Ansari Bushra \n UIN:231P046 \n Roll no:03 \n ");

	}

}




