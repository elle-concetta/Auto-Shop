
import java.util.Scanner;

public class MyDriverClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter customer's name: ");
        String myName = in.next();

        System.out.print("Enter car's model year: ");
        int myCarYear = in.nextInt();

        System.out.print("Enter estimated labor cost: ");
        double myLabor = in.nextDouble();
        System.out.print("Enter estimated parts charge: ");
        double myParts = in.nextDouble();

        // create instances of the classes
        Customer myCustomer = new Customer();

        Car myCar = new Car();
        ServiceQuote myQuote = new ServiceQuote();

        // set the data for the customer and car objects
        myCustomer.setName("Elle");
        myCar.setYear();

        // set the car age discount based on the car year
        myQuote.setCarAgeDiscount();

        // set the labor and parts charges for the service quote
        myQuote.setLaborCharges();
        myQuote.setPartsCharges();

        /* print out the service quote details */
        System.out.printf("Dear " + myCustomer.getName() + ", your total quote is: %.2f", myQuote.totalCharges());
        System.out.printf("\nTotal taxes: %.2f", myQuote.salesTax());
        System.out.print("\nTotal discount:" + (myQuote.getCarAgeDiscount()*100) + "%");
    }
}