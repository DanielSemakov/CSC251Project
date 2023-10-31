public class Policy {
    private int policyNum;
    private String providerName;
    private PolicyHolder policyHolder;
    
    private static int numPolicyObjects = 0;
    
    /**
    No-argument constructor: Assign default values to fields
    */
    public Policy() {
        policyNum = 0;
        providerName = "";
        policyHolder = new PolicyHolder();
        
        numPolicyObjects++;
    }

    /**
    Argument-constructor: Assign inputted values to all fields
    
    @param policyNum the number associated with the insurance policy
    @param providerName the name of the provider of the insurance policy
    @param policyHolder the person who owns the insurance policy
    */
    public Policy(int policyNum, String providerName, PolicyHolder policyHolder) {
        this.policyNum = policyNum;
        this.providerName = providerName;
        this.policyHolder = new PolicyHolder(policyHolder);
        
        numPolicyObjects++;
    }

    /**
    @return the number associated with the insurance policy
    */
    public int getPolicyNum() {
        return policyNum;
    }

    /**
    @return the name of the provider of the insurance policy
    */
    public String getProviderName() {
        return providerName;
    }

    /**
    @return the person who owns the insurance policy 
    */
    public PolicyHolder getPolicyHolder() {
        return new PolicyHolder(policyHolder);
    }
    
    /**
    @return the number of PolicyHolder objects that have been created since the program started 
    */
    public static int getNumPolicyObjects() {
        return numPolicyObjects;
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
        
        if (policyHolder.getAge() > MIN_OLD_AGE_LIMIT) {
            final int OLD_AGE_FEE = 75;
            totalPrice += OLD_AGE_FEE;
        }
        
        if (policyHolder.getSmokingStatus().equals("smoker")) {
            final int SMOKER_FEE = 100;
            totalPrice += SMOKER_FEE;
        }
        
        final int MIN_HIGH_BMI_LIMIT = 35;
        
        if (policyHolder.getBMI() > MIN_HIGH_BMI_LIMIT) {
            final double HIGH_BMI_FEE = (policyHolder.getBMI() - 35) * 20;
            totalPrice += HIGH_BMI_FEE;
        }
        
        return totalPrice;
    } 
    
    /**
    @return a String with an organized list of all the insurance policy info 
    */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append("Policy Number: ").append(policyNum).append("\n")
                .append("Provider Name: ").append(providerName).append("\n");
        
        stringBuilder.append(policyHolder);
        
        String priceHundredthsPlace = String.format("$%.2f", getPrice());
        stringBuilder.append("Policy Price: ").append(priceHundredthsPlace);
        
        return stringBuilder.toString();
    }
}
