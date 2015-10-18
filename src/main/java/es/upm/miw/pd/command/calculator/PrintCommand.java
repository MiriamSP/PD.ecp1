package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class PrintCommand extends OrderComando{

    public PrintCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        IO.getIO().clear();
        IO.getIO().print(calculator.getTotal());
        }

    @Override
    public String name() {
        return "print";
    }
    

}
