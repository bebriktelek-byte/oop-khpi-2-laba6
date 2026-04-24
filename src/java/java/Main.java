public class Main {
    public static void main(String[] args) {
        InsurancePolicy[] policies = new InsurancePolicy[3];

        policies[0] = new HealthPolicy("H100", "Ткаченко Тимур", 50000, 12, true);
        policies[1] = new VehiclePolicy("V202", "Шевченко Марія", 20000, 6, "Toyota Camry", 2020);
        policies[2] = new TravelPolicy("T305", "Коваленко Олег", 10000, 3, "USA", true);

        System.out.println("=== Звіт страхових полісів ===\n");
        for (InsurancePolicy policy : policies) {
            policy.displayDetails();
            System.out.println("-----------------------------");
        }

        System.out.println("\n=== Поліморфні щомісячні премії ===");
        for (InsurancePolicy policy : policies) {
            System.out.printf("%s -> %.2f грн на місяць\n",
                    policy.getClass().getSimpleName(),
                    policy.calculateMonthlyPremium());
        }
    }
}