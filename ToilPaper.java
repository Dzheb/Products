public class ToilPaper  extends Hygien{
  private Integer Layers;

  public ToilPaper(Product Hygien,Integer layers) {
   super(Hygien.Name,Hygien.Price, Hygien.Quantity,Hygien.Unit,((Hygien) Hygien).getPieces() );
   this.Layers = layers;
 }
 
 @Override
 public String toString(){
   return String.format("Наименование: %s \n Цена: %.2f руб. \n Количество: %d \n Единица измерения: %s \n Количество в упаковке: %d \n Количество слоёв: %d слоя\n",getName(),getPrice(), getQuantity(), getUnit(), getPieces(),Layers);
 }
 
}