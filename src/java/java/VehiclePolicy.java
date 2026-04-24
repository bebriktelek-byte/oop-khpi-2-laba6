public class VehiclePolicy extends InsurancePolicy {
    private String vehicleModel;
    private int year;

    public VehiclePolicy(String policyNumber, String policyHolder,
                         double coverageAmount, int durationMonths,
                         String vehicleModel, int year) {
        super(policyNumber, policyHolder, coverageAmount, durationMonths);
        this.vehicleModel = vehicleModel;
        this.year = year;
    }

    @Override
    public double calculateMonthlyPremium() {
        // 3% від покриття; старі авто (до 2015) +20%
        double premium = getCoverageAmount() * 0.03;
        if (year < 2015) {
            premium *= 1.2;
        }
        return premium / getDurationMonths();
    }

    public String getVehicleInfo() {
        return vehicleModel + " (" + year + ")";
    }
}