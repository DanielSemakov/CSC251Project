public class Policy {
    private int policyNum;
    private String providerName;
    
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    
    private String policyHolderSmokingStatus;
    
    private double policyHolderHeightInches;
    private double policyHolderWeightPounds;
    
    public Policy() {
        policyNum = 1234;
        providerName = "State Farm";
        
        policyHolderFirstName = "John";
        policyHolderLastName = "Doe";
        policyHolderAge = 24;
        
        policyHolderSmokingStatus = "non-smoker";
        
        policyHolderHeightInches = 62;
        policyHolderWeightPounds = 250.5;
    }

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

    public String getPolicyHolderSmokingStatus() {
        return policyHolderSmokingStatus;
    }

    public double getPolicyHolderHeightInches() {
        return policyHolderHeightInches;
    }

    public double getPolicyHolderWeightPounds() {
        return policyHolderWeightPounds;
    }
    
    public double getPolicyHolderBMI() {
        return (policyHolderWeightPounds * 703 ) / (Math.pow(policyHolderHeightInches, 2));
    }
    
    /**
    Calculates and returns the insurance policy's price in U.S. Dollars.
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
