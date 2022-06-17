      public class Eggs  extends Food{
        private Integer PackVol;       
      
        public Eggs(Product Food, Integer packVol) {
          super(Food.Name,Food.Price, Food.Quantity,Food.Unit, ((Food) Food).getMaturity());
          this.PackVol = packVol;
        }
        
        public Integer getPackVol() {
          return PackVol;
        }


        public void setPackVol(Integer packVol) {
          PackVol = packVol;
        }
        @Override
        public String toString(){
          return String.format("Наименование: %s \n Цена: %.2f руб. \n Количество: %d \n Единица измерения: %s \n Истечение срока годности: %s \n Количество в упаковке: %d ",getName(),getPrice(), getQuantity(), getUnit(),Program.dateString(getMaturity()), getPackVol());
        }


        
      }
      