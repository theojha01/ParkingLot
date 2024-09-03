package Model;

public class ParkingFactory {
    public static MyCar getCarInstance(CarModelType carModelType, int startTime){
        MyCar myCar= null;
        switch (carModelType){
            case SUV -> myCar=new SuvCar(carModelType,startTime);
            case HATCH -> myCar=new HatchCar(carModelType,startTime);

        }
        return myCar;
    }

    public static void parkCar(MyCar car,ParkingSystem parkingSystem){
        switch (car.carModelType){
            case SUV -> {
                if(parkingSystem.suvCapacity>0){
                    parkingSystem.suvCapacity-=1;
                }
                else {
                    System.out.println("No parking for SUV");
                }
            }
            case HATCH -> {
                if(parkingSystem.hatchCapacity>0){
                    parkingSystem.hatchCapacity-=1;
                } else if (parkingSystem.suvCapacity>0) {
                    parkingSystem.suvCapacity-=1;
                    car.usingParking=true;
                }
                else {
                    System.out.println("Parking full");
                }
            }
        }
    }

    public static int exitParking(MyCar myCar, ParkingSystem parkingSystem, int endTime){
        switch (myCar.carModelType){
            case SUV -> {
                parkingSystem.suvCapacity+=1;
            }
            case HATCH -> {
                if(myCar.usingParking){
                    parkingSystem.suvCapacity+=1;

                }
                else {
                    parkingSystem.hatchCapacity+=1;

                }
            }

        }
        return (endTime-myCar.startTime)*myCar.rate;
    }
}
