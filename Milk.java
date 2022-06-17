public class Milk  extends Food{
  private Double fatRatio;
 

  public Milk(Product Food, Double fatRatio) {
    super(Food.Name,Food.Price, Food.Quantity,Food.Unit, ((Food) Food).getMaturity());
    this.fatRatio = fatRatio;
  }
  public Double getFatRatio() {
    return fatRatio;
  }
  public void setFatRatio(Double fatRatio) {
    this.fatRatio = fatRatio;
  }
  @Override
  public String toString(){
    return String.format("Наименование: %s \n Цена: %.2f руб. \n Количество: %d \n Единица измерения: %s \n Истечение срока годности: %s \n Жирность: %.2f ",getName(),getPrice(), getQuantity(), getUnit(),Program.dateString(getMaturity()), getFatRatio());
  }
  
}
