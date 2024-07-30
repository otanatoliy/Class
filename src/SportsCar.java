public class SportsCar extends Car{

    private int maxSpeed;

    public SportsCar(String brandOfCar, String modelOfCar, int yearOfCar,int maxSpeedOfCar) {
        super(brandOfCar, modelOfCar, yearOfCar);
        this.maxSpeed = maxSpeedOfCar;
    }
    @Override
    public String getInfo(){
        return super.getInfo() + ", maxSpeed: " + maxSpeed + " км/ч";
    }
}
