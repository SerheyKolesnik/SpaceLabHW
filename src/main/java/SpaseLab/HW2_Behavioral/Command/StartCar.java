package SpaseLab.HW2_Behavioral.Command;

import javax.swing.plaf.PanelUI;

public class StartCar implements Command {
    Car car;

    public StartCar(Car car) {
        this.car = car;
    }

    public void execute() {
        car.startEngine();
    }
}
