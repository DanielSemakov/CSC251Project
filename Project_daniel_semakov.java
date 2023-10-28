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

            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, heightInches,
                    weightLbs);
            Policy policy = new Policy(policyNum, providerName, policyHolder);

            policies.add(policy);

            if (scanner.hasNext()) {
                scanner.nextLine();
                scanner.nextLine();
            }
        }

        for (Policy policy : policies) {
            System.out.printf("Policy Number: %d%n", policy.getPolicyNum());
            System.out.printf("Provider Name: %s%n", policy.getProviderName());

            PolicyHolder policyHolder = policy.getPolicyHolder();
            
            System.out.printf("Policyholder's First Name: %s%n", policyHolder.getFirstName());
            System.out.printf("Policyholder's Last Name: %s%n", policyHolder.getLastName());
            System.out.printf("Policyholder's Age: %d%n", policyHolder.getAge());

            System.out.printf("Policyholder's Smoking Status: %s%n", policyHolder.getSmokingStatus());

            System.out.printf("Policyholder's Height: %.1f inches%n", policyHolder.getHeightInches());
            System.out.printf("Policyholder's Weight: %.1f pounds%n", policyHolder.getWeightPounds());
            System.out.printf("Policyholder's BMI: %.2f%n", policyHolder.getBMI());

            System.out.printf("Policy Price: $%.2f%n", policy.getPrice());

            System.out.println();
        }

        displaySmokingStatuses(policies);
    }

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

        System.out.println("The number of policies with a smoker is: " + numSmokers);
        System.out.println("The number of policies with a non-smoker is: " + numNonSmokers);
    }
}
