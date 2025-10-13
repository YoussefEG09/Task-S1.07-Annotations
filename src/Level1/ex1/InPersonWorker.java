package Level1.ex1;

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


}
