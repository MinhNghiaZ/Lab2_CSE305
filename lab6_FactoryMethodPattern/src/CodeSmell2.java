import java.util.*;

class Property {
    private final String name;
    private final double rentAmount;
    private final String ownerName;
    private final String location;

    public Property(String name, double rentAmount, String ownerName, String location) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getName() { return name; }
    public double getRentAmount() { return rentAmount; }
    public String getOwnerName() { return ownerName; }
    public String getLocation() { return location; }

    public String getCategory(double threshold) {
        return rentAmount > threshold ? "Premium" : "Standard";
    }

    public double getYearlyRent() {
        return rentAmount * 12;
    }

    public String getSummary(double threshold) {
        return String.format(
            "Property: %s\nOwner: %s\nLocation: %s\nMonthly Rent: $%.2f\nCategory: %s\nYearly Rent: $%.2f\n",
            name, ownerName, location, rentAmount, getCategory(threshold), getYearlyRent()
        );
    }
}

class FinancialReport {
    private final String reportTitle;
    private final List<Property> properties;
    private final double premiumThreshold = 2000;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        double totalRent = 0;
        System.out.println("=== " + reportTitle + " ===");
        for (Property p : properties) {
            System.out.println(p.getSummary(premiumThreshold));
            totalRent += p.getRentAmount();
            System.out.println("----------------------------");
        }
        System.out.printf("Total Monthly Rent: $%.2f\n", totalRent);
    }
}

public class CodeSmell2 {
    public static void main(String[] args) {
        List<Property> properties = List.of(
            new Property("Apartment A", 1500.0, "John Doe", "City Center"),
            new Property("House B", 2500.0, "Jane Smith", "Suburb"),
            new Property("Condo C", 1800.0, "Bob Johnson", "Downtown")
        );
        FinancialReport report = new FinancialReport("Monthly Rent Summary", properties);
        report.generateReport();
    }
}