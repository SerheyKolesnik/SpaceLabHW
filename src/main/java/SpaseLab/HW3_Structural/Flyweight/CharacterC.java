package SpaseLab.HW3_Structural.Flyweight;

public class CharacterC extends EnglishCharacter {

    public CharacterC() {
        char symbol = 'C';
        int wedth = 40;
        int height = 50;
    }

    @Override
    public void printCarcter() {
        System.out.println("symbol = " + symbol + " Width " + wedth + "Height " + height);
    }
}
