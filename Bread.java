      public class Bread  extends Food{
        private String TypeFlour;       
      
        public Bread(Product Food, String typeFlour) {
          super(Food.Name,Food.Price, Food.Quantity,Food.Unit, ((Food) Food).getMaturity());
          this.TypeFlour = typeFlour;
        }
        
        public String getTypeFlour() {
          return TypeFlour;
        }

        public void setTypeFlour(String typeFlour) {
          TypeFlour = typeFlour;
        }
        @Override
        public String toString(){
          return String.format("Наименование: %s \n Цена: %.2f руб. \n Количество: %d \n Единица измерения: %s \n Истечение срока годности: %s \n Тип муки: %s ",getName(),getPrice(), getQuantity(), getUnit(),Program.dateString(getMaturity()), getTypeFlour());
        }
        
      }
      