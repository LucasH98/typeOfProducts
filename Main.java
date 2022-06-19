package type_of_products;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
	Locale.setDefault(Locale.US);
	Scanner sc =new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	System.out.print("Enter the number of products : ");
	List<Product> list = new ArrayList<>();
	int n = sc.nextInt();
	for(int i= 0 ; i<n;i++ ) {
	System.out.println("Product #"+(i+1) +" data:");
	System.out.println("Common, used or imported (c/u/i) ?");
	char ch = sc.next().charAt(0);
	sc.nextLine();
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("Price: ");
	Double price  = sc.nextDouble();
	if(ch == 'i' || ch =='I') {
	System.out.print("Customs Fee : ");
	double cf = sc.nextDouble();
	Product imported  = new ImportedProducts(name, price, cf);
	list.add(imported);
	}
	else if (ch =='u' || ch =='U') {
	System.out.print("Manufacture date (DD/MM/YYYY):");
	Date date = sdf.parse(sc.next());
	Product used = new UsedProduct(name, price, date);
	list.add(used);
	}
	else {
	Product product = new Product(name, price);
	list.add(product);
	}
	}
	System.out.println();
	System.out.println("PRICE TAGS:");
	for(Product x : list) {
		System.out.println(x.priceTag());
	}
	
	
	
	sc.close();

	}

}
