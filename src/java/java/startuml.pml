@startuml
abstract class InsurancePolicy {
  - policyNumber: String
  - policyHolder: String
  - coverageAmount: double
  - durationMonths: int
  + InsurancePolicy(policyNumber: String, policyHolder: String, coverageAmount: double, durationMonths: int)
  + getPolicyNumber(): String
  + getPolicyHolder(): String
  + getCoverageAmount(): double
  + getDurationMonths(): int
  + setCoverageAmount(coverageAmount: double): void
  + abstract calculateMonthlyPremium(): double
  + displayDetails(): void
}

class HealthPolicy {
  - hospitalCoverage: boolean
  + HealthPolicy(policyNumber: String, policyHolder: String, coverageAmount: double, durationMonths: int, hospitalCoverage: boolean)
  + calculateMonthlyPremium(): double
  + hasHospitalCoverage(): boolean
}

class VehiclePolicy {
  - vehicleModel: String
  - year: int
  + VehiclePolicy(policyNumber: String, policyHolder: String, coverageAmount: double, durationMonths: int, vehicleModel: String, year: int)
  + calculateMonthlyPremium(): double
  + getVehicleInfo(): String
}

class TravelPolicy {
  - destination: String
  - includesMedical: boolean
  + TravelPolicy(policyNumber: String, policyHolder: String, coverageAmount: double, durationMonths: int, destination: String, includesMedical: boolean)
  + calculateMonthlyPremium(): double
  + getTravelDetails(): String
}

InsurancePolicy <|-- HealthPolicy
InsurancePolicy <|-- VehiclePolicy
InsurancePolicy <|-- TravelPolicy
@enduml