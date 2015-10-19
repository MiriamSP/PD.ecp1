package es.upm.miw.pd.text;

public class Parrafo extends CompositeDocument {

    private String endLineFeed = "\n";
    @Override
    public String dibujar(Boolean formatMayusculas) {
        // TODO Auto-generated method stub
        return super.dibujar(formatMayusculas);
    }

   

    public String getEndLineFeed() {
        return endLineFeed;
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
