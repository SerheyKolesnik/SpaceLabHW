package SpaseLab.HW2_Behavioral.Mediator;

public class Mediator {
    public static void sendMessege(User user, String msg) {
        System.out.println(user.getName() + ": " + msg);
    }

}
