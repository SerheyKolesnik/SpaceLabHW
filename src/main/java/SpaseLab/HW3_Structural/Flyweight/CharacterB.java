package SpaseLab.HW3_Structural.Flyweight;

public class CharacterB extends EnglishCharacter {

    public CharacterB() {
        char symbol = 'B';
        int wedth = 20;
        int height = 30;
    }

    @Override
    public void printCharacter() {
        System.out.println("symbol = " + symbol + " Width " + wedth + "Height " + height);
    }
}
