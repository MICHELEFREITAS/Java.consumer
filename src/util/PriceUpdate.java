package util;

import java.util.function.Consumer;

import entities.Product;
//classe para implementar interface consumer
public class PriceUpdate implements Consumer<Product>{

	//atualizar o produto p aumentando preco 10%
	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
		
	}

}
