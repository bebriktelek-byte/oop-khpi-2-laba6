public abstract class InsurancePolicy {
    private String policyNumber;
    private String policyHolder;
    private double coverageAmount;
    private int durationMonths;
    public InsurancePolicy(String policyNumber, String policyHolder,
                           double coverageAmount, int durationMonths) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.coverageAmount = coverageAmount;
        this.durationMonths = durationMonths;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyHolder() { return policyHolder; }
    public double getCoverageAmount() { return coverageAmount; }
    public int getDurationMonths() { return durationMonths; }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public abstract double calculateMonthlyPremium();

    public void displayDetails() {
        System.out.println("Policy #: " + policyNumber);
        System.out.println("Holder: " + policyHolder);
        System.out.println("Coverage: " + coverageAmount);
        System.out.println("Duration: " + durationMonths + " months");
        System.out.printf("Monthly premium: %.2f\n", calculateMonthlyPremium());
    }
}