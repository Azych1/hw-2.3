public class Main {
    public static void main(String[] args) {
        Car fiat = new Car("fiat", 3);
        Car volvo = new Car("volvo");

        System.out.println(fiat.getWheelsCount());
        System.out.println(volvo.getWheelsCount());

        fiat.checkEngine();

        Truck truck = new Truck("truck", 6);
        Bicycle bicycle = new Bicycle("bicycle", 2);

        truck.checkTrailer();
        bicycle.updateTyre();

        ServiceStationImpl serviceStation = new ServiceStationImpl();
        serviceStation.check(fiat);
        serviceStation.check(truck);
        serviceStation.check(bicycle);

    }
}