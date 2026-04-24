public class TravelPolicy extends InsurancePolicy {
    private String destination;
    private boolean includesMedical;

    public TravelPolicy(String policyNumber, String policyHolder,
                        double coverageAmount, int durationMonths,
                        String destination, boolean includesMedical) {
        super(policyNumber, policyHolder, coverageAmount, durationMonths);
        this.destination = destination;
        this.includesMedical = includesMedical;
    }

    @Override
    public double calculateMonthlyPremium() {
        double premium = getCoverageAmount() * 0.015;
        if (includesMedical) {
            premium *= 1.5;
        }
        if (destination.equalsIgnoreCase("USA") ||
                destination.equalsIgnoreCase("Japan")) {
            premium *= 1.2;
        }
        return premium / getDurationMonths();
    }

    public String getTravelDetails() {
        return destination + (includesMedical ? " (incl. medical)" : "");
    }
}