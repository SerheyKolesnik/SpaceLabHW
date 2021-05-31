package SpaseLab.simple_iunit;

import java.util.logging.Logger;

public class Calculator {
    private static final Logger log = Logger.getLogger(String.valueOf(Calculator.class));

    public static int getSum(int x, int y) {
        log.info("Это информационное сообщение!");
        return x + y;
    }

    public static int getDivide(int x, int y) {
        log.info("Это информационное сообщение!");
        return x - y;
    }

    public static int getMultiple(int x, int y) {
        log.info("Это информационное сообщение!");
        return x * y;
    }
}
