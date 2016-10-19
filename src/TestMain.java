import java.util.Scanner;
/**
 * Created by renstange on 10/18/16.
 */
public class TestMain {
    public static void main(String[] args) {

        FrequencyTable thisTable = new FrequencyTable();
        Scanner myScanner = new Scanner(System.in);

        //Added string for testing, prior to taking user input.
        String testString = "This is my test string";

        System.out.println("Entry text to be counted:");

        String enteredText = myScanner.nextLine();

        thisTable.countString(enteredText);

        System.out.println(thisTable.toString());

    }
}
