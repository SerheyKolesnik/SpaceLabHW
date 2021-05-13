package SpaseLab.HW2_Behavioral.Interpreter;

public class impreterTest {
    public static void main(String[] args) {
        String str = "Test";
        Context context = new Context();
        Expression lowerExpression = new LowerExpression(str);
        str = lowerExpression.interpret(context);
    }
}
