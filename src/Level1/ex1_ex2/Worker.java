package Level1.ex1_ex2;

public abstract class Worker {
    private String name;
    private String surName;
    private double hourPrice;


    public Worker(String name, String surName, double hourPrice) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("The worker's name is not valid.");
        }
        this.name = name;

        if (surName.isEmpty()) {
            throw new IllegalArgumentException("Worker's surname is not valid.");
        }
        this.surName = surName;

        if (hourPrice == 0) {
            throw new IllegalArgumentException("Hour's price is not valid.");
        }
        this.hourPrice = hourPrice;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public double calculateSalary(double hours) {
        if(hours<0 || hours > 176){
            throw new IllegalArgumentException("Hours worked are not valid.");
        }
        double totalGains = hours * hourPrice;
        return totalGains;
    }

    @Override
    public String toString() {
        return "Name ='" + name + '\'' +
                ", Surname ='" + surName + '\'' +
                ", hourPrice = " + hourPrice;
    }
}
