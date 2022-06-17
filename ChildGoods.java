public class ChildGoods  extends Product{
  private Double AgeMin;
  private Boolean HypoAllerg ;
 
  public ChildGoods (String name, Double price, Integer quantity, String unit, Double ageMin,Boolean hypoAllerg) {
    super(name, price, quantity, unit);
    this.AgeMin = ageMin;
    this.HypoAllerg = hypoAllerg;
  }

  public Double getAgeMin() {
    return AgeMin;
  }

  public void setAgeMin(Double ageMin) {
    AgeMin = ageMin;
  }

  public Boolean getHypoAllerg() {
    return HypoAllerg;
  }

  public void setHypoAllerg(Boolean hypoAllerg) {
    HypoAllerg = hypoAllerg;
  }

  
  }
