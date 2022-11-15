public class Worker {
    String name;
    int number;
    float wage;
    int hours;

    public void displayInfo(){
        System.out.println(name+number);
    }
    public void displaySalary(){
        System.out.println("Salary= "+wage*hours);
    }
}
