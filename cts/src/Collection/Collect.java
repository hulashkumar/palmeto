package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList=new ArrayList<Product>();
		Product p1=new Product(1001,"Sumsung",50000);
		Product p2=new Product(1002,"Apple",40000);
		Product p3=new Product(1003,"Mi",20000);
		Product p4=new Product(1004,"Lenevo",60000);
		Product p5=new Product(1005,"Apple",70000);
		Product p6=new Product(1006,"Apple",40000);
		List<Double>productPriceList=productList.stream().map(x->x.price).collect(Collectors.toList());
		Set<Double>productPriceList1=productList.stream().map(x->x.price).collect(Collectors.toSet());
		Double sumPrices=productList.stream().map(x->x.price).collect(Collectors.summingDouble(x->x.price));
		
	}

}
