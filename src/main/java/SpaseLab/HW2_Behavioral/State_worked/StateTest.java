package SpaseLab.HW2_Behavioral.State_worked;

public class StateTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.openWindow();
        car.openDoor();
        car.on();
        car.openWindow();
        car.openDoor();
        car.start();
        car.openWindow();
        car.openDoor();
    }
}
