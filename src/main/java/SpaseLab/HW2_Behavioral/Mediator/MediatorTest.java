package SpaseLab.HW2_Behavioral.Mediator;

public class MediatorTest {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        user1.sendMessage("messege 1");
        user2.sendMessage("messege 2");
    }
}
