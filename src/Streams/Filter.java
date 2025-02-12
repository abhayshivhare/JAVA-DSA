package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    } 
}
public class Filter {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(12, "Samsung", 50000));
		list.add(new Product(18, "Appple", 40000));
		list.add(new Product(10, "Mango", 60000));
		list.add(new Product(16, "Tangi", 80000));
		
		
		Stream<Product> filter = list.stream().filter(p -> p.price >50000);
		filter.forEach(p -> System.out.println("Value of P is : "+ p.price + " name is : " + p.name + " id is :" + p.id));
		
	}

}
