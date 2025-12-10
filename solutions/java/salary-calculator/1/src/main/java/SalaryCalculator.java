public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean exp = daysSkipped >= 5;
        double val = exp ? 0.85 : 1.0;
        return val;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold >= 20 ? 13*productsSold : 10 * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double val = salaryMultiplier(daysSkipped);
        double bonus = bonusForProductsSold(productsSold);
        double finalSalary = 1000 * val + bonus;
        return finalSalary >= 2000 ? 2000.00 : finalSalary;
    } 
}
