public class Shirt {
  public int shirtID = 1; // стандартне значення номера моделі сорочки
  public String description = "-Beautiful-"; // стандартний опис сорочки
  public char colorCode = 'R';// коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
  public double price = 99.9; // стандартна вартість сорочки
  public int quantityInStock = 23; // стандартна кількість на складі
  
  
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    switch (colorCode) 
    {
      case 'R':
        System.out.println("Color: Red");
        break;
      case 'G':
        System.out.println("Color: Green");
        break;
      case 'B':
        System.out.println("Color: Blue");
        break;
      default:
        System.out.println("Color: Unset");
        break;
    }
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  }
}