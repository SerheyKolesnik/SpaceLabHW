package SpaseLab.HW3_Structural.Flyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        int[] characterCode = {1, 2, 3};
        for (int nextCode : characterCode) {
            EnglishCharacter character = factory.getCharacter(nextCode);
            character.printCharacter();
        }
    }
}

