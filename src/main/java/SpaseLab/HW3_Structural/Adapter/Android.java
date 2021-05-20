package SpaseLab.HW3_Structural.Adapter;

public class Android implements MicroUsbPhone {
    private boolean connector;

    @Override
    public void recharge() {
        if (connector) {
            System.out.println("recharge started");
            System.out.println("recharge finished");
        } else {
            System.out.println("Connect MicroUsb first");
        }
    }

    @Override
    public void useMicroUsb() {
        connector = true;
        System.out.println("MicroUsb connected");
    }
}
