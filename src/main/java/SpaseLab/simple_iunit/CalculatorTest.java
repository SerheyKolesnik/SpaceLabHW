package SpaseLab.simple_iunit;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalculatorTest {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh = new FileHandler("C:\\Users\\Sergey\\IdeaProjects\\SpaceLabEducation\\log_file.log");
        logger.addHandler(fh);
        logger.setUseParentHandlers(false);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        Calculator.getSum(5, 3);
        logger.info("метод getSum работает");
        Calculator.getDivide(5, 3);
        logger.info("метод getDivide работает");
        Calculator.getMultiple(5, 3);
        logger.info("метод getMultiple работает");
    }
}
