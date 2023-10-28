public class PolicyHolder {

   private String firstName;
   private String lastName;
   private int age;
    
   private String smokingStatus;
    
   private double heightInches;
   private double weightPounds;
   
   public PolicyHolder() {
      firstName = "";
      lastName = "";
      age = 0;
        
      smokingStatus = "";
        
      heightInches = 0;
      weightPounds = 0;

   }
   
   public PolicyHolder(String firstName, 
            String lastName, int age, String smokingStatus, 
            double heightInches, double weightPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        
        this.smokingStatus = smokingStatus;
        
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public double getHeightInches() {
        return heightInches;
    }

    public double getWeightPounds() {
        return weightPounds;
    }

   /**
    Calculates and returns the policyholder's BMI based on their height and weight
    
    @return the policyholder's BMI
    */
    public double getBMI() {
        return (weightPounds * 703 ) / (Math.pow(heightInches, 2));
    }
    
   @Override
    public String toString() {
        /*
        String.format("Policyholder's First Name: %s%n", policyHolder.getFirstName());
            System.out.printf("Policyholder's Last Name: %s%n", policyHolder.getLastName());
            System.out.printf("Policyholder's Age: %d%n", policyHolder.getAge());

            System.out.printf("Policyholder's Smoking Status: %s%n", policyHolder.getSmokingStatus());

            System.out.printf("Policyholder's Height: %.1f inches%n", policyHolder.getHeightInches());
            System.out.printf("Policyholder's Weight: %.1f pounds%n", policyHolder.getWeightPounds());
            System.out.printf("Policyholder's BMI: %.2f%n", policyHolder.getBMI());

            System.out.printf("Policy Price: $%.2f%n", policy.getPrice());
        */
        
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append("Policyholder's First Name: ").append(firstName).append("\n")
                .append("Policyholder's Last Name: ").append(lastName).append("\n")
                .append("Policyholder's Age: ").append(age).append("\n")
                .append("Policyholder's Smoking Status: ").append(smokingStatus).append("\n");
        
        String heightInchesTenthsPlace = String.format("%.1f", heightInches);
        stringBuilder.append("Policyholder's Height: ").append(heightInchesTenthsPlace)
                .append(" inches").append("\n");
        
        String weightPoundsTenthsPlace = String.format("%.1f", weightPounds);
        stringBuilder.append("Policyholder's Weight: ").append(weightPoundsTenthsPlace)
                .append(" pounds").append("\n");
        
        String bmiHundredthsPlace = String.format("%.2f", getBMI());        
        stringBuilder.append("Policyholder's BMI: ").append(bmiHundredthsPlace).append("\n");
        
        return stringBuilder.toString();
        
    }
}