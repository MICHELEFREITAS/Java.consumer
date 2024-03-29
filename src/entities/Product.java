package entities;

import java.util.Set;

public class Product {
	private String name;
	private Double price;

	public Product() {
		
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//st�tico s� mexe com objeto que vai receber como par�metro
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	//n�o est�tico, n�o recebe argumento, price do pr�prio obj
	public void nonStaticPriceUpdate() {
		//setPrice(getPrice() * 1.1);
		//ou
		price = price * 1.1;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + String.format("%.2f", price) + "]";
	}
	
}
