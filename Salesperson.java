/**
 * A class for salespeople to get their names
 * and their respective sales amounts recognized.
 *
 * Gabriel Mendez-Frances
 * 1-25-2022
 * CS 321-02
 * Dr. Beth Allen
 */

public class Salesperson {
    /**
     Constructs a Salesperson object with corresponding name and gross sales amount.
     @param aFirstName the first name of the salesperson.
     @param aLastName the last name of the salesperson.
     @param salesNum the gross sales amount.
     */
    public Salesperson(String aFirstName, String aLastName, double salesNum) { // Constructor
        name1 = aFirstName;
        name2 = aLastName;
        sales = salesNum;
    }
    /**
     Constructs a default Salesperson object with default values.
     */
    public Salesperson() { // Default Constructor
          name1 = "unknown";
          name2 = "unknown";
          sales = 0;
    }
    /**
     Sets a new name for the salesperson.
     @param setName the new name that will be set for the salesperson.
     */
    public void setFirstName(String setName) {
        name1 = setName;
    }
    /**
     Sets a new sales amount.
     @param salesNum the new sales amount that will be set.
     */
    public void setSales(double salesNum) {
        sales = salesNum;
    }
    /**
     Gets the numerical sales amount.
     @return A double of the sales amount.
     */
    public double getSales() {
        return sales;
    }
    /**
     Gets the full name of the salesperson.
     @return A string with the first and last name of the salesperson.
     */
    public String getFullName() {
        return name1 + " " + name2;
    }
    /**
     Calculates the bonus based on the sales amount. Bonus is 2% of
     the sales amount above 10,000, otherwise it would be 0.
     */
    public double getBonus() {
        if (sales < 10000) {
            return 0;
        } else if (sales >= 10000) {
            return ((sales - 10000) * 0.02);
        }
        return sales;
    }

    private String name1, name2;
    private double sales;
}
