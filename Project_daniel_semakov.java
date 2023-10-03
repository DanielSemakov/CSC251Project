import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Project_daniel_semakov {

   public static void main(String[] args) {
      File textFile = new File("PolicyInformation.txt");

        Scanner scanner;
        try {
            scanner = new Scanner(textFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            scanner = new Scanner(System.in);
        }

        ArrayList<Policy> policies = new ArrayList<>();

        while (scanner.hasNext()) {
            int policyNum = Integer.parseInt(scanner.nextLine());
            String providerName = scanner.nextLine();

            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());

            String smokingStatus = scanner.nextLine();

            double heightInches = scanner.nextDouble();
            double weightLbs = scanner.nextDouble();
            
            Policy policy = new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, heightInches,
                    weightLbs);

            policies.add(policy);

            if(scanner.hasNext())
            { 
               scanner.nextLine();
               scanner.nextLine();
            }

        }
        
        /*
                
        System.out.println();
        
        System.out.printf("Policy Number: %d%n", policy.getPolicyNum());
        System.out.printf("Provider Name: %s%n", policy.getProviderName());
        
        System.out.printf("Policyholder's First Name: %s%n", policy.getPolicyHolderFirstName());
        System.out.printf("Policyholder's Last Name: %s%n", policy.getPolicyHolderLastName());
        System.out.printf("Policyholder's Age: %d%n", policy.getPolicyHolderAge());
        
        System.out.printf("Policyholder's Smoking Status: %s%n", policy.getPolicyHolderSmokingStatus());
        
        System.out.printf("Policyholder's Height: %.1f inches%n", policy.getPolicyHolderHeightInches());
        System.out.printf("Policyholder's Weight: %.1f pounds%n", policy.getPolicyHolderWeightPounds());
        System.out.printf("Policyholder's BMI: %.2f%n", policy.getPolicyHolderBMI());
        
        System.out.printf("Policy Price: $%.2f%n", policy.getPrice());
        */
    }
}
