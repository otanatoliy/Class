//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", "X5", 2020);
        String carInfo = myCar.getInfo();
        System.out.println(carInfo);;

        SportsCar  mySportsCar = new SportsCar("Honda","Civic",2018,260);
        String sportsCarInfo = mySportsCar.getInfo();
        System.out.println(sportsCarInfo);

        Track myTrack  = new Track("MAN","TGS",2021,12000);;
        String trackInfo = myTrack.getInfo();
        System.out.println(trackInfo);
    }
}