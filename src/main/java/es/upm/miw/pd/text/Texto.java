package es.upm.miw.pd.text;

public class Texto extends CompositeDocument {
    private String endLineFeed ="---o---";
    @Override
    public String dibujar(Boolean formatMayusculas) {
        // TODO Auto-generated method stub
        return super.dibujar(formatMayusculas);
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
    
    public String getEndLineFeed(){
        return endLineFeed;
    }

   

    

}
