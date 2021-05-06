package SpaseLab.HW1_Creational.AbstractFactory;

public class UACarPriceAbsFactory implements InteAbsFactory {
    public Lada getLada() {
        return new UALadaImpl();
    }


    public Ferrari getFerrary() {
        return new UAFerrariImpl();
    }

    public Porshe getPorshe() {
        return new UAPorsheImpl();
    }
}
