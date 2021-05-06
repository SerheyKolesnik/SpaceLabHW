package SpaseLab.HW2_Behavioral.ChainOfResponsibility;

public class VisaPayment implements Payment {
    private Payment payment;

    public void setNext(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void pay() {
        System.out.println("Visa Payment");
    }
}
