public class Limonade  extends Beverage{
   public Limonade(Product Beverage) {
    super(Beverage.Name,Beverage.Price, Beverage.Quantity,Beverage.Unit,((Beverage)Beverage).getVolume() );
  
  }
  
  @Override
  public String toString(){
    return String.format("Наименование: %s \n Цена: %.2f руб. \n Количество: %d \n Единица измерения: %s \n Объём: %.2f \n",getName(),getPrice(), getQuantity(), getUnit(), getVolume());
  }
  
}
