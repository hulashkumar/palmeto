package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingUser {
	public static void main(String []args) {
		Product p1=new Product(1001,"Sumsung",50000);
		Product p2=new Product(1002,"Apple",40000);
		Product p3=new Product(1003,"Mi",20000);
		Product p4=new Product(1004,"Lenevo",60000);
		Product p5=new Product(1005,"Apple",70000);
		Product p6=new Product(1006,"Apple",40000);
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		List<Product> list=products.stream()
				.sorted((a,b)->a.name.compareTo(b.name))
				.collect(Collectors.toList());
		Product p=products.stream()
				.min(Product a,Product b)->a.price<b.price?-1:1)
				.get();
	}

}
