package SpaseLab.HW1.AbstractFactory;

public class RUCarPriceAbsFactory implements InteAbsFactory {

    public Lada getLada() {
        return new RULadaImpl();
    }

    public Ferrari getFerrary() {
        return new UAFerrariImpl();
    }

    public Porshe getPorshe() {
        return new UAPorsheImpl();
    }

}
