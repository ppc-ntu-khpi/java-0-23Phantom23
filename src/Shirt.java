public class Shirt {
  public int shirtID = 1; // стандартне значення номера моделі сорочки
  public String description = "-Beautiful-"; // стандартний опис сорочки
  public char colorCode = 'R';// коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
  public double price = 99.9; // стандартна вартість сорочки
  public int quantityInStock = 23; // стандартна кількість на складі
  
  
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  }
}