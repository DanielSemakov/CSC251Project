public class PolicyHolder {

   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int policyHolderAge;
    
   private String policyHolderSmokingStatus;
    
   private double policyHolderHeightInches;
   private double policyHolderWeightPounds;
   
   public Policy() {
      policyHolderFirstName = "";
      policyHolderLastName = "";
      policyHolderAge = 0;
        
      policyHolderSmokingStatus = "";
        
      policyHolderHeightInches = 0;
      policyHolderWeightPounds = 0;

   }
   
   public Policy(String policyHolderFirstName, 
            String policyHolderLastName, int policyHolderAge, String policyHolderSmokingStatus, 
            double policyHolderHeightInches, double policyHolderWeightPounds) {
        this.policyHolderFirstName = policyHolderFirstName;
        this.policyHolderLastName = policyHolderLastName;
        this.policyHolderAge = policyHolderAge;
        
        this.policyHolderSmokingStatus = policyHolderSmokingStatus;
        
        this.policyHolderHeightInches = policyHolderHeightInches;
        this.policyHolderWeightPounds = policyHolderWeightPounds;
    }
    
    public String getPolicyHolderFirstName() {
        return policyHolderFirstName;
    }

    public String getPolicyHolderLastName() {
        return policyHolderLastName;
    }

    public int getPolicyHolderAge() {
        return policyHolderAge;
    }

    public String getSmokingStatus() {
        return policyHolderSmokingStatus;
    }

    public double getPolicyHolderHeightInches() {
        return policyHolderHeightInches;
    }

    public double getPolicyHolderWeightPounds() {
        return policyHolderWeightPounds;
    }

   /**
    Calculates and returns the policyholder's BMI based on their height and weight
    
    @return the policyholder's BMI
    */
    public double getPolicyHolderBMI() {
        return (policyHolderWeightPounds * 703 ) / (Math.pow(policyHolderHeightInches, 2));
    }
}