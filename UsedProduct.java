package type_of_products;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

private Date manufactureDate ;

public UsedProduct(String name, Double price, Date manufactureDate) {
	super(name, price);
	this.manufactureDate = manufactureDate;
}

public Date getManufactureDate() {
	return manufactureDate;
}

public void setManufactureDate(Date manufactureDate) {
	this.manufactureDate = manufactureDate;
}

@Override
	public String priceTag() {
		// TODO Auto-generated method stub
		return "(USED) " +  super.priceTag() +"(Manufacture Date : "+sdf.format(manufactureDate) +")";
		
	}
	
}
