
/**
 * This is the main function of the Item class and tests the ability to represnt a stock item
 *
 * @author Zophia Raleigh
 * @version 16 October 2018
 */
public class ItemTest
{
    public static void main(String[] args)
    {
       Item item1 = new Item("BK420", "Muh Huly Buhk", 1, 2.0, 10.0);
       Item item2 = new Item();
       
       System.out.println(item1.toString());
       
       item2.setId("BK421");
       item2.setDescr("Muh Luss Huly Buhk");
       item2.setQuant(2);
       item2.setPrice(1.0);
       item2.setTaxRate(20.0);
       
       System.out.println("The attributes of the second item are: " + " Id= " + item2.getId() + " Description= " + item2.getDescr() + " Quantity= " + item2.getQuant() + " Price= "
       + item2.getPrice() + " Tax Rate= " + item2.getTaxRate());
       
       System.out.println("The cost of item two is: " + item2.computeTotal());
    }  
}
