public class Nipple  extends ChildGoods{
  

  public Nipple (Product ChildGoods) {
    super(ChildGoods.Name,ChildGoods.Price, ChildGoods.Quantity,ChildGoods.Unit, ((ChildGoods) ChildGoods).getAgeMin(),((ChildGoods) ChildGoods).getHypoAllerg());
    
  }
  @Override
  public String toString(){
    return String.format("Наименование: %s \n Цена: %.2f руб. \n Количество: %d \n Единица измерения: %s \n Минимальный возраст: %.1f \n %s\n",getName(),getPrice(), getQuantity(), getUnit(),getAgeMin(), strAllerg(getHypoAllerg()));
  }
 
  private String strAllerg(Boolean hypoAllerg) {
    return hypoAllerg ? "Гипоаллергеный" :"";
  }
    
}
