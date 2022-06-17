public class Beverage  extends Product{
    private Double Volume;
  
    public Beverage(String name, Double price, Integer quantity, String unit, Double volume) {
      super(name, price, quantity, unit);
      this.Volume = volume;
    }

    public Double getVolume() {
      return Volume;
    }

    public void setVolume(Double volume) {
      Volume = volume;
    }
  
  
    
  }
  
