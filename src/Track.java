public class Track extends Car{

    private int loadCapacity;

    public Track(String brandOfCar, String modelOfCar, int yearOfCar, int LoadCapacityOfCar) {
        super(brandOfCar, modelOfCar, yearOfCar);
        this.loadCapacity = LoadCapacityOfCar;
    }
    @Override
    public String getInfo(){
        return super.getInfo() + ", LoadCapacity: " + loadCapacity + " кг";
    }
}
