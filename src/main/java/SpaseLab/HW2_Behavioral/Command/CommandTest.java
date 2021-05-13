package SpaseLab.HW2_Behavioral.Command;

public class CommandTest {
    public static void main(String[] args) {
        Car car = new Car();
        StartCar startCar = new StartCar(car);
        StartCar stopCar = new StartCar(car);
        CarInvoker.execute();
    }
}
