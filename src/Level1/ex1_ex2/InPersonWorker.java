package Level1.ex1_ex2;

public class InPersonWorker extends Worker {
    private static double fuelCost = 80.0;

    public InPersonWorker(String name, String surName, double hourPrice, double fuelCost) {
        super(name, surName, hourPrice);
        InPersonWorker.fuelCost = fuelCost;
    }

    @Override
    public double calculateSalary(double hoursMonth) {
        double totalSalary = hoursMonth * getHourPrice() + fuelCost;
        return totalSalary;
    }

    /**
     * @deprecated
     * This method was the old that we used before.
     */
    @Deprecated
    public double obsoletMethod(double hoursMonth){
        double totalSalary = hoursMonth * getHourPrice();
        return totalSalary;
    }


}
