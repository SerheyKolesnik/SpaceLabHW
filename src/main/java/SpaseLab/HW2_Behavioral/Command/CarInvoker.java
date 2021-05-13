package SpaseLab.HW2_Behavioral.Command;

public class CarInvoker {
    public static Command command;

    public CarInvoker(Command command) {
        this.command = command;
    }

    public static void execute() {
        command.execute();
    }
}
