package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class AddCommand extends OrderComando {

    public AddCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        int num = IO.getIO().readInt();
        calculator.add(num);
    }

    @Override
    public String name() {
        return "sumar";
    }

}
