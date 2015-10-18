package es.upm.miw.pd.command.calculator;

public abstract class OrderComando implements Comando {
    protected Calculator calculator;

    public OrderComando(Calculator calculator) {
        super();
        this.calculator = calculator;
    }

   

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return null;
    }
    
    

}
