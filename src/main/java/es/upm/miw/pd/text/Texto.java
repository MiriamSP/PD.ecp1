package es.upm.miw.pd.text;

import java.util.ArrayList;

public class Texto extends CompositeDocument {
    
    public Texto(){
    
    }
    /*public Texto() {
        //super(componentes, endLineFeed);
        // TODO Auto-generated constructor stub
    }*/

    

    private static String endLineFeed ="---o---";
    @Override
    public String dibujar(Boolean formatMayusculas) {
        // TODO Auto-generated method stub
        return super.dibujar(formatMayusculas);
    }

   
    @Override
    public void add(Componente componente) {
        // TODO Auto-generated method stub
        if (!componente.isComposite()){
            componentes.add(componente);

        }           throw new UnsupportedOperationException();
    }

    @Override
    public boolean isComposite() {
        return true;
    }
    
    public String getEndLineFeed(){
        return endLineFeed;
    }

   

    

}
