package SpaseLab.HW2_Behavioral.State_worked;

public class CarMoving extends CarState {
    @Override
    public void openWindow() {
        System.out.println("The window is been opened...");
    }

    @Override
    public void openDoor() {
        System.out.println("Can't open the door while moving!");
    }
}
