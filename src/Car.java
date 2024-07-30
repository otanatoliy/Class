public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brandOfCar, String modelOfCar, int yearOfCar){
        this.brand = brandOfCar;
        this.model = modelOfCar;
        this.year = yearOfCar;
    }

    public String getInfo(){
        return "Brand:" + brand + ", Model:" + model + ", Year:" + year;

    }
}
