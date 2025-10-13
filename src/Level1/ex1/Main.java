package Level1.ex1;

public class Main {
    public static void main(String args[]){

        OnlineWorker onlineWorker = new OnlineWorker("Youssef", "El Gmoudi", 14.72);
        InPersonWorker inPersonWorker = new InPersonWorker("Jose", "Martinez", 14.72, 124.15);

        System.out.println(onlineWorker.toString());
        System.out.print("Total earned this month: " );
        System.out.printf( "%.2f%n" ,onlineWorker.calculateSalary(158));

        System.out.println(inPersonWorker.toString());
        System.out.print("Total earned this month: " );
        System.out.printf("%.2f%n" , inPersonWorker.calculateSalary(158));








    }
}
