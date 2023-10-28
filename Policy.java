public class Policy {
    private int policyNum;
    private String providerName;
    private PolicyHolder policyHolder;
    
    private static int numPolicyObjects = 0;
    
    /**
    Assign default values to fields
    */
    public Policy() {
        policyNum = 0;
        providerName = "";
        policyHolder = new PolicyHolder();
        
        numPolicyObjects++;
    }

    /**
    Assign inputted values to all fields
    
    @param policyNum
    @param providerName
    @param policyHolder
    */

    public Policy(int policyNum, String providerName, PolicyHolder policyHolder) {
        this.policyNum = policyNum;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        
        numPolicyObjects++;
    }

    public int getPolicyNum() {
        return policyNum;
    }

    public String getProviderName() {
        return providerName;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }
    /**
    I'M REALLY CONFUSED ABOUT THE INSTRUCTIONS. I NEED TO CHANGE THIS METHOD SO THAT IT GETS THE POLICY HOLDER INFO FROM A POLICY HOLDER CLASS. BUT I'M
    UNSURE HOW I SHOULD GO ABOUT DOING THIS. Should I have a PolicyHolder field inside this class? Should I make the constructor take in a PolicyHolder
    object?
    
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
