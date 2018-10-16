
/**
 * The code creates a class to represet a stock item
 *
 * @author Zophia Raleigh 18107206
 * @version 16 October 2018
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String id;      //e.g. a part identifier "ZA423"
    private String descr;   //e.g. a part description
    private int quant;   //e.g. the quantity available
    private double price;   //e.g. a price per item
    private double taxRate; //e.g. the tax rate as a perentage

    /**
     * Constructor accepts 5 parameters and initialises the object using the passed arguments
     */
    public Item(String pId, String pDescr, int pQuant, double pPrice, double pTaxRate)
    {
        id = pId;
        descr = pDescr;
        quant = pQuant;
        price = pPrice;
        taxRate = pTaxRate;
    }

    /**
     * Constructor will accept no parameters
     * to initialize the fie instance variables
     */
    public Item()
    {
        id = "";
        descr = "";
        quant = 0;
        price = 0.0;
        taxRate = 0.0;
    }
    
    /**
     * Provide a set and get method for each of the 5 instance variables
     */
    public String getId()
    {
       return id; 
    }
    
    public void setId(String qID)
    {
        id = qID;
    }
    
    public String getDescr()
    {
        return descr;
    }
    
    public void setDescr(String description)
    {
        this.descr = description;
    }
    
    public int getQuant()
    {
        return quant;
    }
    
    public void setQuant(int quantity)
    {
        if (quantity < 0)
            quantity = 0;
        this.quant = quantity;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double Price)
    {
        if (Price < 0)
            Price = 0.0;
        this.price = Price;
    }
    
    public double getTaxRate()
    {
        return taxRate;
    }
    
    public void setTaxRate(double TaxRate)
    {
        if (TaxRate < 0 || TaxRate > 80)
            TaxRate = 80;
        this.taxRate = TaxRate;
    }
    
    /**
     * Provide an appropriate toString method that returns a string representation of the item details
     */
    public String toString()
    {
        return "Item{" + "id=" + id + "descr=" + descr + "quant=" + quant + "price=" + price + "taxRate=" + taxRate + '}';
    }
    
    /**
     * Provide a method named computeTotal that computes the total cost of the stock item available
     */
    public double computeTotal()
    {
        return (price * quant) + ((taxRate/100)*price);
    }
}   
