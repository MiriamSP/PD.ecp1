package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoGuardar extends OrderComando {

    private GestorMementos<MementoCalculadora> gm;

    private CalculadoraMementable<Memento> o;

    public ComandoGuardar(Calculator calculator, GestorMementos<MementoCalculadora> gm) {
        super(calculator);
        this.gm = gm;
    }

    @Override
    public void execute() {
        String key = IO.getIO().readString();
        MementoCalculadora memento = o.createMemento();
        this.gm.addMemento(key, memento);
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "guardar";
    }

}
