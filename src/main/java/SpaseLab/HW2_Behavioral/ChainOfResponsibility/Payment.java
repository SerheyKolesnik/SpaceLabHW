package SpaseLab.HW2_Behavioral.ChainOfResponsibility;

public interface Payment {
    void setNext(Payment payment);

    void pay();
}
