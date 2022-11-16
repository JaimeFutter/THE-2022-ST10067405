package question2;

import java.text.DecimalFormat;

/**
 *
 * @author jaime - ST10067405
 */
public class Property {
    /*references: 
     * 1 - https://jenkov.com/tutorials/java-internationalization/decimalformat.html
     * 2 - Java-Programming-9th-Edition by Joyce Ferrell
     */
    //arrays
    private static int propPrices[][] = {
        {800000, 1500000, 2000000},
        {700000, 1200000, 1600000},
        {750000, 1300000, 1800000}};

    private static String province[] = {"Gauteng", "Natal", "Cape"};

    //DecimalFormat
    //reference: https://jenkov.com/tutorials/java-internationalization/decimalformat.html
    //decimalformat to format the averages
    public static DecimalFormat df = new DecimalFormat("###,###,###");

    public static void main(String[] args) {
        Print();
        Calculate();
    }

    private static void Print() {
        //display variable
        String display;
        
        //Setting display Variable String
        display = province[0] + "\t\tR " + df.format(propPrices[0][0]) + "\t\tR " + df.format(propPrices[0][1]) + "\t\tR " + df.format(propPrices[0][2])
                + "\n" + province[1] + "\t\tR " + df.format(propPrices[1][0]) + "\t\tR " + df.format(propPrices[1][1]) + "\t\tR " + df.format(propPrices[1][2])
                + "\n" + province[2] + "\t\tR " + df.format(propPrices[2][1]) + "\t\tR " + df.format(propPrices[2][2]);
        
        //displaying layout and display string
        System.out.println("\t\tFLAT\t\t\tTOWN HOUSE\t\tHOUSE");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(display);
    }

    private static void Calculate() {
        //calculating the averages as temp variables
        int gautengAvg = (propPrices[0][0] + propPrices[0][1] + propPrices[0][2]) / 3;
        int natalAvg = (propPrices[1][0] + propPrices[1][1] + propPrices[1][2]) / 3;
        int capeAvg = (propPrices[2][0] + propPrices[2][1] + propPrices[2][2]) / 3;

        //displaying the averages
        System.out.println("\nAverage property prices in " + province[0] + " = R " + df.format(gautengAvg)
                + "\nAverage property prices in " + province[1] + " = R " + df.format(natalAvg)
                + "\nAverage property prices in " + province[2] + " = R " + df.format(capeAvg));
    }

}
