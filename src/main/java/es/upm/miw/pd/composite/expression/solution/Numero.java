package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expresion{
    private int num;

    public Numero(int num) {
        this.num = num;
    }    
    
    @Override
    public int operar() {
        return num;
    }

    @Override
    public String toString() {
        return Integer.toString(num);
    }

}
