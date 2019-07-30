package consumer196;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//vari�vel recebe valor para atualizar pre�o.
		double factor = 1.1;
		
		//vai percorrer a cole��o e executar um consumer para cada elemento. Atualizando pre�o de cada produt
		//colocando expressao lambda e colocando direto no argumento da fun��o 
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		//imprimir a lista. Usando reference method para o println
		list.forEach(System.out::println);
	}

}
