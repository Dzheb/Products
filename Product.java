public class Product {
  String Name;
  Double Price;
  Integer Quantity;
  String Unit;

  public Product(String name, Double price, Integer quantity, String unit) {
    this.Name = name;
    this.Price = price;
    this.Quantity = quantity;
    this.Unit = unit;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public Double getPrice() {
    return Price;
  }

  public void setPrice(Double price) {
    Price = price;
  }

  public Integer getQuantity() {
    return Quantity;
  }

  public void setQuantity(Integer quantity) {
    Quantity = quantity;
  }

  public String getUnit() {
    return Unit;
  }

  public void setUnit(String unit) {
    Unit = unit;
  }
  


public static void Print_Product(Product itemProduct){
  System.out.println();
  System.out.println(itemProduct.toString());
}

@Override
public String toString(){

  return String.format("%s, %.2f, %d, %s",getName(), getPrice(), getQuantity(), getUnit());
}

}