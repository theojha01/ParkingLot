package Model;

public class ParkingSystem {
    int totalSpaces;
    int suvCapacity;
    int hatchCapacity;
//    private static ParkingSystem parkingSystem=null;

    public ParkingSystem(int suvCapacity, int hatchCapacity) {
        this.suvCapacity = suvCapacity;
        this.hatchCapacity = hatchCapacity;
        this.totalSpaces = this.suvCapacity+this.hatchCapacity;

    }

    public int getTotalSpacesLeft(){
        return this.suvCapacity+this.hatchCapacity ;
    }
}
