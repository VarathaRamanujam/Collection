package Collection;

public class Mobile_obj {

String brand;
String model;
int price;
int ram;



public Mobile_obj(String brand, String model, int price, int ram) {
	this.brand = brand;
	this.model = model;
	this.price = price;
	this.ram = ram;
}



public String getBrand() {
	return brand;
}



public void setBrand(String brand) {
	this.brand = brand;
}



public String getModel() {
	return model;
}



public void setModel(String model) {
	this.model = model;
}



public int getPrice() {
	return price;
}



public void setPrice(int price) {
	this.price = price;
}



public int getRam() {
	return ram;
}



public void setRam(int ram) {
	this.ram = ram;
}



@Override
public String toString() {
	return " brand=" + brand + ", model=" + model + ", price=" + price + ", ram=" + ram + "";
}

}
