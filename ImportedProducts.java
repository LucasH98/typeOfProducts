package type_of_products;

public class ImportedProducts extends Product {

private Double customsFee ;

public ImportedProducts() {
	super();
	
}

public ImportedProducts(String name, Double price, Double customsFee) {
	super(name, price);
	this.customsFee = customsFee;
}

public Double getCustomsFee() {
	return customsFee;
}

public void setCustomsFee(Double customsFee) {
	this.customsFee = customsFee;
}

public double totalPrice() {
	double total = price + customsFee ;
	return total ; 
}
@Override
public String priceTag() {
	
	return getName() +  totalPrice()+"(Customs Fee $ : "+ String.format("%.2f", customsFee)+ ")";
}
}
