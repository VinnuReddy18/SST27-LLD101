public class ElectricCar implements EngineVehicle, ElectricVehicle {
    public void startEngine() {
        System.out.println("Electric motor started - Silent!");
    }
    
    public void recharge(int kWh) {
        System.out.println("Charging " + kWh + " kWh");
    }
}
