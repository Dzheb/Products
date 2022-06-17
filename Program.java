import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Program {
  public static void main(String[] args) throws InterruptedException {
    
    // молоко
    Food foodItemmilk = new Food  ("Молоко",(double) 1,2000, "л",strDate("2022-11-15"));
    Milk milkItem = new Milk(foodItemmilk,(double) 3);
    Product.Print_Product(milkItem);
    // лимонад
    Beverage bevItem = new Beverage("Лимонад",(double) 30, 10000, "л",1.5);
    Limonade limItem = new Limonade(bevItem);
    Product.Print_Product(limItem);
    // хлеб
    Food foodItembread = new Food  ("Хлеб",(double) 35,3000, "шт.",strDate("2022-07-15"));
    Bread breadItem = new Bread(foodItembread,"высший сорт");
    Product.Print_Product(breadItem);
   // яйца
   Food foodItemEggs = new Food  ("Яйца",(double) 100,3500, "уп.",strDate("2022-10-25"));
   Eggs eggsItem = new Eggs(foodItemEggs,10);
   Product.Print_Product(eggsItem);
   // маски
   Hygien hygienItemMasks = new Hygien  ("Маски",(double) 14,5400, "уп.",10);
   Masks masksItem = new Masks(hygienItemMasks);
   Product.Print_Product(masksItem);
   // туалетная бумага
   Hygien hygienPaper = new Hygien  ("Туалетная бумага",(double) 33,8300, "уп.",4);
   ToilPaper paperItem = new ToilPaper(hygienPaper,4);
   Product.Print_Product(paperItem);
  // подгузники
  ChildGoods childPumpers = new ChildGoods  ("Подгузники",(double) 1200,3400, "уп.",(double)1.5,true);
  Pampers pumperItem = new Pampers(childPumpers,"L",5,9,"трусики");
  Product.Print_Product(pumperItem);
  // соска
  ChildGoods childNipple = new ChildGoods  ("Соска",(double) 120,34, "шт.",(double)0.5,true);
  Nipple nippleItem = new Nipple(childNipple);
  Product.Print_Product(nippleItem);
  

 }
  // перевод строки в объект java date
     public static Date strDate(String str){
        Date parsingDate = null;
       SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
         try {
           parsingDate = ft.parse(str); 
         }catch (ParseException e) { 
           System.out.println("Ошибка парсинга в дату: "+ft); 
         }
   return parsingDate;
   }
     // перевод объекта java date в строку  
   public static String dateString(Date objDate){
    Calendar calendar = new GregorianCalendar();
    calendar.setTime(objDate);
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH);
    int day = calendar.get(Calendar.DAY_OF_MONTH);
    return String.format("%d/%d/%d", day,month,year);
   }
}
