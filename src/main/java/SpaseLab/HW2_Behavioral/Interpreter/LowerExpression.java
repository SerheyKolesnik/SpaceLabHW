package SpaseLab.HW2_Behavioral.Interpreter;

public class LowerExpression implements Expression {
    private String s;

    public LowerExpression(String s) {
        this.s = s;
    }

    public String interpret(Context context) {
        return context.getLowerCase(s);
    }
}
