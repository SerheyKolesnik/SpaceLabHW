package SpaseLab.HW3_Structural.Adapter;

public class AdapterTest {
    static void rechargeMicroUsbPhone(MicroUsbPhone phone) {
        phone.useMicroUsb();
        phone.recharge();
    }

    static void rechargeLightningPhone(LightningPhone phone) {
        phone.useLightning();
        phone.recharge();
    }

    public static void main(String[] args) {
        Android android = new Android();
        Iphone iphone = new Iphone();
        System.out.println("Rechargin android with MicroUsb");
        rechargeMicroUsbPhone(android);
        System.out.println("Rechargin iphone with Lightning");
        rechargeLightningPhone(iphone);
        System.out.println("Rechargin iphone with MicroUsb");
        rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iphone));
    }
}
