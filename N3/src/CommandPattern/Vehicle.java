package CommandPattern;

public class Vehicle {
    final private String type;

    public Vehicle(String type){
        this.type = type;
    }
    public void starts(){
        System.out.println("A " + type + " starts its engine.");
    }
    public void accelerates(){
        System.out.println("A " + type + " accelerates.");
    }
    public void slowsDown(){
        System.out.println("A " + type + " slows down");
    }
}
