package es.upm.miw.pd.text;

public class Texto extends CompositeDocument {

    @Override
    public String dibujar(Boolean formatMayusculas) {
        // TODO Auto-generated method stub
        return super.dibujar(formatMayusculas);
    }

    @Override
    protected String printEndLineFeed() {
        // TODO Auto-generated method stub
        return "---o---";
    }

    @Override
    public void add(Componente componente) {
        // TODO Auto-generated method stub
        componentes.add(componente);
    }

    @Override
    public boolean isComposite() {
        return true;
    }

   

    

}
