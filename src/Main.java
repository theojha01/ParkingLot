import Model.CarModelType;
import Model.MyCar;
import Model.ParkingFactory;
import Model.ParkingSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ParkingSystem parkingSystem= new ParkingSystem(5,1);
        MyCar suv1= ParkingFactory.getCarInstance(CarModelType.SUV,1);
        MyCar hatch1= ParkingFactory.getCarInstance(CarModelType.HATCH,2);
        ParkingFactory.parkCar(suv1,parkingSystem);
        ParkingFactory.parkCar(hatch1,parkingSystem);
        int rate=ParkingFactory.exitParking(hatch1,parkingSystem,4);
        System.out.println("charge:"+rate);
        System.out.println("Parking capacity:"+parkingSystem.getTotalSpacesLeft());


    }
}