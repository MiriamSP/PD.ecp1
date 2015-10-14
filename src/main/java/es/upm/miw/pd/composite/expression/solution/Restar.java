package es.upm.miw.pd.composite.expression.solution;

public class Restar extends ExpressionComposite {
    public Restar(Expresion exp1, Expresion exp2) {
        super(exp1, exp2);
    }

    @Override
    public int operar() {
        return getExpressions().get(0).operar() - getExpressions().get(1).operar();
    }

    @Override
    public String getOperator() {
        return "-";
    }
}
