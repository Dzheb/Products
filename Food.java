import java.util.Date;

public class Food  extends Product{
  Date Maturity;

  public Food(String name, Double price, Integer quantity, String unit, Date maturity) {
    super(name, price, quantity, unit);
    this.Maturity = maturity;
  }

   public Date getMaturity() {
    return Maturity;
  }

  public void setMaturity(Date maturity) {
    Maturity = maturity;
  }
  
}
