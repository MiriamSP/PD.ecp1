package es.upm.miw.pd.composite.expression.solution;

import java.util.ArrayList;

public abstract class ExpressionComposite extends Expresion {

    private ArrayList<Expresion> expressions;

    public ExpressionComposite(Expresion exp1, Expresion exp2) {
        expressions = new ArrayList<>(2);
        expressions.add(exp1);
        expressions.add(exp2);
    }

    protected ArrayList<Expresion> getExpressions() {
        return expressions;
    }

    public String toString() {
        return "(" + getExpressions().get(0).toString() + getOperator() + getExpressions().get(1).toString() + ")";
    }

    public abstract String getOperator();

}
