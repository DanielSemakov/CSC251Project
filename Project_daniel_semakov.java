import java.util.Scanner;

public class Project_daniel_semakov {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the Policy Number: ");
        int policyNum = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();
        
        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Please enter the Policyholder's Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();
        
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        double heightInches = scanner.nextDouble();
        
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        double weightLbs = scanner.nextDouble();
        
        Policy policy = new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, heightInches,
        weightLbs);
        
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

    }
}
