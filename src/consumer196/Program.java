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
		
		//variável recebe valor para atualizar preço.
		double factor = 1.1;
		
		//Consumer que recebe função que recebe produto p e atualiza o preço.
		//Pode abrir chaves e definir função entre chaves mas com 1 linha é opcional
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * factor);
		};
		
		//vai percorrer a coleção e executar um consumer para cada elemento. Atualizando preço de cada produt
		//chamando variável cons
		list.forEach(cons);
		
		//imprimir a lista. Usando reference method para o println
		list.forEach(System.out::println);
	}

}
