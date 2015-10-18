package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoDeshacer extends OrderComando {

    private GestorMementos<MementoCalculadora> gm;

    private CalculadoraMementable<Memento> o;

    public ComandoDeshacer(Calculator calculator, GestorMementos<MementoCalculadora> gm) {
        super(calculator);
        this.gm = gm;
    }

    @Override
    public void execute() {
        String key = (String) IO.getIO().select(gm.keys());
        MementoCalculadora memento = o.createMemento();
        this.gm.addMemento(key, memento);
    }

    @Override
    public String name() {
        return "deshacer";
    }

}
