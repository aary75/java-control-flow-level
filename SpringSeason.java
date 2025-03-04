// Creating the class SpringSeason to check whether the month is spring or not
public class SpringSeason {

    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide two arguments: month and day.");
            return;
        }

        // Parse the month and day from the command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the month and day fall within the Spring Season
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
