public class Masks  extends Hygien{
  public Masks(Product Hygien) {
   super(Hygien.Name,Hygien.Price, Hygien.Quantity,Hygien.Unit,((Hygien) Hygien).getPieces() );
 }
 
 @Override
 public String toString(){
   return String.format("Наименование: %s \n Цена: %.2f руб. \n Количество: %d \n Единица измерения: %s \n Количество в упаковке: %d \n",getName(),getPrice(), getQuantity(), getUnit(), getPieces());
 }
 
}