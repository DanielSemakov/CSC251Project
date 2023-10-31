import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
The main class which gets policy information from a text file, then displays info in the console. Furthermore, the program displays 
the number of Policy objects created, smokers, and non-smokers.
*/
public class Project_daniel_semakov {

    /**
    The first method that the program runs 
    */
    public static void main(String[] args) {
        //Accesses the text file with all the policy info
        File textFile = new File("PolicyInformation.txt");

        //Create a scanner to read the text file
        Scanner scanner;
        try {
            scanner = new Scanner(textFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            scanner = new Scanner(System.in);
        }

        //ArrayList to store all the policies
        ArrayList<Policy> policies = new ArrayList<>();

        
        while (scanner.hasNext()) {
            //Reads and store all the policy info from the text file
            int policyNum = Integer.parseInt(scanner.nextLine());
            String providerName = scanner.nextLine();

            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());

            String smokingStatus = scanner.nextLine();

            double heightInches = scanner.nextDouble();
            double weightLbs = scanner.nextDouble();

            //Stores all the policy info inside PolicyHolder and Policy objects
            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, heightInches,
                    weightLbs);
            Policy policy = new Policy(policyNum, providerName, policyHolder);

            //Add the Policy object to the policies ArrayList
            policies.add(policy);

            //Skips blank lines in the text file
            if (scanner.hasNext()) {
                scanner.nextLine();
                scanner.nextLine();
            }
        }

        //Displays info about all the policies in an organized list
        for (Policy policy : policies) {
            System.out.println(policy + "\n");
        }

        //Displays the number of policy objects created, smokers, and non-smokers
        System.out.printf("There were %d Policy objects created.%n", Policy.getNumPolicyObjects());
        displaySmokingStatuses(policies);
    }

    /**
    Displays the number of smokers and non-smokers who own an insurance policy 
    * 
    * @param policies an ArrayList which stores all the policies that are assessed for smokers and non-smokers
    */
    public static void displaySmokingStatuses(ArrayList<Policy> policies) {
        int numSmokers = 0;
        int numNonSmokers = 0;

        for (Policy policy : policies) {
            PolicyHolder policyHolder = policy.getPolicyHolder();
            if (policyHolder.getSmokingStatus().equals("smoker")) {
                numSmokers++;
            } else {
                numNonSmokers++;
            }
        }

        //Display the number of smokers and non-smokers
        System.out.println("The number of policies with a smoker is: " + numSmokers);
        System.out.println("The number of policies with a non-smoker is: " + numNonSmokers);
    }
}
