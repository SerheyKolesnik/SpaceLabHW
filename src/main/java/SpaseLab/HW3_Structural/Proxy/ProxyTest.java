package SpaseLab.HW3_Structural.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Imath p = new MathProxy();
        System.out.println("4+2 = " + p.add(4, 2));
        System.out.println("4-2 = " + p.sub(4, 2));
        System.out.println("4*2 = " + p.mul(4, 2));
        System.out.println("4/2 = " + p.div(4, 2));
    }
}



