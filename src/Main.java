class Main{
    public static void main(String[] args){
        TruckFactory truckFactory = new TruckFactory();        ShipFactory shipFactory = new ShipFactory();        PlaneFactory planeFactory = new PlaneFactory();        Car Truck = truckFactory.createCar();        Car Ship = shipFactory.createCar();        Car Plane = planeFactory.createCar();    }
}
abstract class Car{
    String name;}
interface Logistic{
    Car createCar();}
class Truck extends Car{
    public Truck(){
        name = "Грузовик";    }
}
class Plane extends Car{
    public Plane(){
        name = "Самолет";    }
}
class Ship extends Car{
    public Ship() {
        name = "Лодка";    }
}
class TruckFactory implements Logistic{
    public Car createCar() {
        return new Truck();        }
}
class PlaneFactory implements Logistic{
    public Car createCar() {
        return new Plane();        }
}
class ShipFactory implements Logistic{
    public Car createCar() {
        return new Ship();        }
}
