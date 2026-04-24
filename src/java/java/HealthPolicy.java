public class HealthPolicy extends InsurancePolicy {
    private boolean hospitalCoverage;

    public HealthPolicy(String policyNumber, String policyHolder,
                        double coverageAmount, int durationMonths,
                        boolean hospitalCoverage) {
        super(policyNumber, policyHolder, coverageAmount, durationMonths);
        this.hospitalCoverage = hospitalCoverage;
    }

    @Override
    public double calculateMonthlyPremium() {
        double premium = getCoverageAmount() * 0.02;
        if (hospitalCoverage) {
            premium *= 1.3;
        }
        return premium / getDurationMonths();
    }

    public boolean hasHospitalCoverage() { return hospitalCoverage; }
}