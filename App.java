public class App {

    public static void main(String[] args) {

        //Variables
        double item = 250;
        double moneyInWallet = 600;
        int numberOfFriends = 5;
        int ageInYears = 40;
        String firstName = "Montrell";
        String lastName = "Story";
        String middleInitial = "None";
        String line = "-----------------------------------------------------------------";

        // Calculating variables
        double moneyRemainingInWallet = moneyInWallet - item;
        int numberOfFriendsOverYears = numberOfFriends * ageInYears;
        String fullName = firstName + " "+ middleInitial + " "+ lastName;
        //spacing
        System.out.println(line);
        System.out.println("");

        //Operations ( + - concatenation on variables above)

        //a. Printing what is remaining in the wallet
        System.out.println("After purchasing your Item your remaining cash in you Wallet is :  $" + moneyRemainingInWallet);

        //b. Printing the number of friends over the years
        System.out.println("");
        System.out.println("Considering your age of 40 * 5 friends, Your friend count is :  " + numberOfFriendsOverYears);

        //c. Printing the Full Name
        System.out.println("");
        System.out.println("Your Full Name is: " + fullName);
        System.out.println("");
        System.out.println(line);
    }
}
