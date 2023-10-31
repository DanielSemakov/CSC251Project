/**
Deals with the person who owns the insurance policy.
*/
public class PolicyHolder {

   /**
    * Policy holder's personal info
    */
   private String firstName;
   private String lastName;
   private int age;
    
   private String smokingStatus;
    
   private double heightInches;
   private double weightPounds;
   
   /**
    No-argument constructor initializes the fields with default values
    */
   public PolicyHolder() {
      firstName = "";
      lastName = "";
      age = 0;
        
      smokingStatus = "";
        
      heightInches = 0;
      weightPounds = 0;

   }
   
   /**
   Copy-constructor which initializes the fields in this object with the same values as the 
   * fields in the passed-in PolicyHolder object
   * 
   * @param policyHolder the PolicyHolder object that is to be duplicated
   */
   public PolicyHolder(PolicyHolder policyHolder) {
       firstName = policyHolder.getFirstName();
       lastName = policyHolder.getLastName();
       age = policyHolder.getAge();
       
       smokingStatus = policyHolder.getSmokingStatus();
       
       heightInches = policyHolder.getHeightInches();
       weightPounds = policyHolder.getWeightPounds();
   }
   
   /**
   Argument-constructor that initializes all the fields with the passed in parameters
   * 
   * @param firstName Policyholder's first name
   * @param lastName Policyholder's last name
   * @param age Policyholder's age
   * @param smokingStatus Policyholder's smoking status
   * @param heightInches Policyholder's height in inches
   * @param weightPounds Policyholder's weight in pounds
   */
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
    
    /**
    @return the policyholder's first name
    */
    public String getFirstName() {
        return firstName;
    }

    /**
    @return the policyholder's last name 
    */
    public String getLastName() {
        return lastName;
    }

    /**
    @return the policyholder's age 
    */
    public int getAge() {
        return age;
    }

    /**
    @return the policyholder's smoking status 
    */
    public String getSmokingStatus() {
        return smokingStatus;
    }
    
    /**
    @return The policyholder's height
    */
    public double getHeightInches() {
        return heightInches;
    }

    /**
   @return The Policyholder's weight
   */
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
    
    /**
    @return a String with an organized list of all the policyholder info 
    */
   @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append("Policyholder's First Name: ").append(firstName).append("\n")
                .append("Policyholder's Last Name: ").append(lastName).append("\n")
                .append("Policyholder's Age: ").append(age).append("\n")
                .append("Policyholder's Smoking Status (Y/N): ").append(smokingStatus).append("\n");
        
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