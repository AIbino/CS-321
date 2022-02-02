public class SalesTester {
    /**
     * main entry to the test program
     * @param args command line arguments, unused at this time
     */
    public static void main(String[] args)
    {
        Salesperson agent1 = new Salesperson("Beth", "Allen", 8800.00); // fill with constructor
        Salesperson agent2 = new Salesperson(); // set to default values
        agent2.setFirstName("Bob");
        agent2.setSales(15000.00);
        System.out.println("Program 1 - uses hardcoded statements to set the object's data.");
        System.out.println("The two Salespeople's sales and bonuses are: ");
        System.out.println(agent1.getFullName() + " - Sales: " + agent1.getSales() + " Bonus: " +
                agent1.getBonus());
        System.out.println(agent2.getFullName() + " - Sales: " + agent2.getSales() + " Bonus: " +
                agent2.getBonus());
    }
}