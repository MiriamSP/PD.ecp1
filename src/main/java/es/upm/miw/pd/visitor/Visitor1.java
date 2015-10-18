package es.upm.miw.pd.visitor;

public class Visitor1 extends Visitor {
    private int contA, contB;

    public Visitor1() {
        super();
        this.contA = 0;
        this.contB = 0;
    }

    @Override
    public void visitElementA(ElementA e) {
        System.out.println("Visitador 1 --> elemento: " + e.getAttributeA());
    }

    @Override
    public void visitElementB(ElementB e) {
        System.out.println("Visitador 1 --> elemento: " + e.getAttributeB());
    }
    
    public int getAs() {
        return contA;
    }

    public void setContA(int contA) {
        this.contA = contA;
    }

    public int getBs() {
        return contB;
    }

    public void setContB(int contB) {
        this.contB = contB;
    }


}
