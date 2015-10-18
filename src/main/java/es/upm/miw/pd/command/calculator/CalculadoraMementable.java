package es.upm.miw.pd.command.calculator;

public interface CalculadoraMementable<T> {
    MementoCalculadora createMemento();

    void restoreMemento(T memento);

}
