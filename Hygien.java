public class Hygien  extends Product{
  private Integer Pieces;

  public Hygien(String name, Double price, Integer quantity, String unit, Integer pieces) {
    super(name, price, quantity, unit);
    this.Pieces = pieces;
  }

  public Integer getPieces() {
    return Pieces;
  }

  public void setPieces(Integer pieces) {
    Pieces = pieces;
  }
  
}
