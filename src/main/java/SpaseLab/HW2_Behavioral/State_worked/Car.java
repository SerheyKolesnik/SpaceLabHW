package SpaseLab.HW2_Behavioral.State_worked;

public class Car {
    private CarState carState;

    public void Car() {
        off();
    }

    public void on() {
        carState = new CarOn();
        System.out.println("car is on!");
    }

    public void off() {
        carState = new CarOff();
        System.out.println("car is off!");
    }

    public void start() {
        carState = new CarMoving();
        System.out.println("car is moving!");
    }

    public void openWindow() {
        carState.openWindow();
    }

    public void openDoor() {
        carState.openDoor();
    }

}
