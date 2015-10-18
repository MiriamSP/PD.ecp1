package es.upm.miw.pd.command.calculator;


import upm.jbb.IO;

public class ComandoGuardar extends OrderComando {

    private GestorMementos<MementoCalculadora> gm;
    private CalculadoraMementable<Memento> o;

    
    public ComandoGuardar(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        //this.gm.addMemento(IO.getIO().readString("Nombre del Memento"), o.createMemento());
        this.gm.addMemento(IO.getIO().readString(), o.createMemento());
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "guardar";
    }
    

}
