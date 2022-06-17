      public class Pampers  extends ChildGoods{
        private String Size;
        private Integer MinWeight;
        private Integer MaxWeight;
        private String Type;

        public Pampers(Product ChildGoods, String size,Integer minWeight,Integer maxWeight, String type) {
          super(ChildGoods.Name,ChildGoods.Price, ChildGoods.Quantity,ChildGoods.Unit, ((ChildGoods) ChildGoods).getAgeMin(),((ChildGoods) ChildGoods).getHypoAllerg());
          this.Size = size;
          this.MinWeight = minWeight;
          this.MaxWeight = maxWeight;
          this.Type = type;
        }
        @Override
        public String toString(){
          return String.format("Наименование: %s \n Цена: %.2f руб. \n Количество: %d \n Единица измерения: %s \n Минимальный возраст: %.1f \n %s\n Размер: %s\n Вес минимальный: %d кг\n Вес максимальный: %d кг\n Тип: %s",getName(),getPrice(), getQuantity(), getUnit(),getAgeMin(), strAllerg(getHypoAllerg()),Size, MinWeight, MaxWeight, Type);
        }
       
        private String strAllerg(Boolean hypoAllerg) {
          return hypoAllerg ? "Гипоаллергеный" :"";
        }
        public String getSize() {
          return Size;
        }
        public void setSize(String size) {
          Size = size;
        }
        public Integer getMinWeight() {
          return MinWeight;
        }
        public void setMinWeight(Integer minWeight) {
          MinWeight = minWeight;
        }
        public Integer getMaxWeight() {
          return MaxWeight;
        }
        public void setMaxWeight(Integer maxWeight) {
          MaxWeight = maxWeight;
        }
        public String getType() {
          return Type;
        }
        public void setType(String type) {
          Type = type;
        }
        
      }
      