import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.name="Bahadir";
        w1.hours=12;
        w1.number=31;
        w1.wage=5500;
        w1.displayInfo();
        w1.displaySalary();

        Worker w2= new Worker();
        Scanner input = new Scanner(System.in);
        System.out.println("İsminizi girin: ");
        w2.name=input.nextLine();
        System.out.println("Calısma saatinizi girin: ");
        w2.hours=input.nextInt();
        System.out.println("numaranızı girin: ");
        w2.number=input.nextInt();
        System.out.println("maaşınızı girin: ");
        w2.wage=input.nextFloat();
        w2.displaySalary();
        w2.displayInfo();
    }
}