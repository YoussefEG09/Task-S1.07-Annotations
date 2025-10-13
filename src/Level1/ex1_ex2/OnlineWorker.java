package Level1.ex1_ex2;

public class OnlineWorker extends Worker {
    private static final double INTERNET_PRICE = 40.0;


    public OnlineWorker(String name, String surName, double hourPrice) {
        super(name, surName, hourPrice);
    }

    @Override
    public double calculateSalary(double hoursMonth) {
        double totalSalary = hoursMonth * getHourPrice() + INTERNET_PRICE;
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
