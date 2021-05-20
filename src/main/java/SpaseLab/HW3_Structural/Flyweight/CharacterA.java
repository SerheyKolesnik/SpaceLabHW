package SpaseLab.HW3_Structural.Flyweight;

public class CharacterA extends EnglishCharacter {

    public CharacterA() {
        char symbol = 'A';
        int wedth = 10;
        int height = 20;
    }

    @Override
    public void printCharacter() {
        System.out.println("symbol = " + symbol + " Width " + wedth + "Height " + height);
    }
}
