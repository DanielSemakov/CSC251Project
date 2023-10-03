public class Policy {
    private int policyNum;
    private String providerName;
    
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    
    private String policyHolderSmokingStatus;
    
    private double policyHolderHeightInches;
    private double policyHolderWeightPounds;
    
    /**
    Assign default values to fields
    */
    public Policy() {
        policyNum = 0;
        providerName = "";
        
        policyHolderFirstName = "";
        policyHolderLastName = "";
        policyHolderAge = 0;
        
        policyHolderSmokingStatus = "";
        
        policyHolderHeightInches = 0;
        policyHolderWeightPounds = 0;
    }

    /**
    Assign inputted values to all fields
    
    @param policyNum
    @param providerName
    @param policyHolderFirstName
    @param policyHolderLastName
    @param policyHolderAge
    @param policyHolderSmokingStatus
    @param policyHolderHeightInches
    @param policyHolderWeightPounds
    */

    public Policy(int policyNum, String providerName, String policyHolderFirstName, 
            String policyHolderLastName, int policyHolderAge, String policyHolderSmokingStatus, 
            double policyHolderHeightInches, double policyHolderWeightPounds) {
        this.policyNum = policyNum;
        this.providerName = providerName;
        
        this.policyHolderFirstName = policyHolderFirstName;
        this.policyHolderLastName = policyHolderLastName;
        this.policyHolderAge = policyHolderAge;
        
        this.policyHolderSmokingStatus = policyHolderSmokingStatus;
        
        this.policyHolderHeightInches = policyHolderHeightInches;
        this.policyHolderWeightPounds = policyHolderWeightPounds;
    }

    public int getPolicyNum() {
        return policyNum;
    }

    public String getProviderName() {
        return providerName;
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
    
    /**
    Calculates and returns the insurance policy's price in U.S. Dollars.
    
    @return price in USD
    */
    public double getPrice() {
        double totalPrice = 0;
        
        final int BASE_FEE = 600;
        totalPrice += BASE_FEE;
        
        final int MIN_OLD_AGE_LIMIT = 50;
        
        if (policyHolderAge > MIN_OLD_AGE_LIMIT) {
            final int OLD_AGE_FEE = 75;
            totalPrice += OLD_AGE_FEE;
        }
        
        if (policyHolderSmokingStatus.equals("smoker")) {
            final int SMOKER_FEE = 100;
            totalPrice += SMOKER_FEE;
        }
        
        final int MIN_HIGH_BMI_LIMIT = 35;
        
        if (getPolicyHolderBMI() > MIN_HIGH_BMI_LIMIT) {
            final double HIGH_BMI_FEE = (getPolicyHolderBMI() - 35) * 20;
            totalPrice += HIGH_BMI_FEE;
        }
        
        return totalPrice;
    } 
}
