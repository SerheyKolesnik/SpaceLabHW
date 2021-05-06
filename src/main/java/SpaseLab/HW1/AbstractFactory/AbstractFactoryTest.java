package SpaseLab.HW1.AbstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        String country = "UA";
        InteAbsFactory ifactory = null;

        if (country.equals("UA")) {
            ifactory = new UACarPriceAbsFactory();
        } else if (country.equals("RU")) {
            ifactory = new RUCarPriceAbsFactory();
        }

        Lada lada = ifactory.getLada();
        System.out.println(lada.getLadaPrice());
        System.out.println("");

    }
}
