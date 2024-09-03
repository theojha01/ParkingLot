package Model;

public abstract class MyCar {
    CarModelType carModelType;
    int startTime;
    int rate;
    boolean usingParking;
    public MyCar(CarModelType carModelType, int startTime){
        this.carModelType= carModelType;
        this.startTime=startTime;
        switch (carModelType){
            case SUV -> {this.rate=20;}
            case HATCH -> {this.rate=30;}
            default -> System.out.println("Wrong car model");

        }
    }
}
