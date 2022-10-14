package Collection;

public class Laptop_obj {
String brand;
int price;
double display_size;


public Laptop_obj(String brand, int price, double display_size) {
	super();
	this.brand = brand;
	this.price = price;
	this.display_size = display_size;
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public double getDisplay_size() {
	return display_size;
}


public void setDisplay_size(double display_size) {
	this.display_size = display_size;
}


@Override

public String toString() {
	return "brand=" + brand + ", price=" + price + ", display_size=" + display_size + "";
}
}
