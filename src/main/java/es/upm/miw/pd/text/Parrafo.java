package es.upm.miw.pd.text;

import java.util.ArrayList;

public class Parrafo extends CompositeDocument {

   public Parrafo() {
       super();

    composite = false;
        // TODO Auto-generated constructor stub
    }

/* public Parrafo() {
        //super(componentes,endLineFeed);
        // TODO Auto-nerated constructor stub
    }*/

    private static String endLineFeed = "\n";
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
        if (componente != null){
        if (!componente.isComposite()){
            componentes.add(componente);
        } else
            throw  new UnsupportedOperationException();
        }
       
    }

    @Override
    public boolean isComposite() {
        return true;
    }

}
