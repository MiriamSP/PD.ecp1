package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class PrintCommand extends OrderComando{

    public PrintCommand(Calculator calculator) {
        // TODO Auto-generated constructor stub
        super(calculator);
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        IO.getIO().clear();
        IO.getIO().print(calculator.getTotal());
        }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "print";
    }
    

}
