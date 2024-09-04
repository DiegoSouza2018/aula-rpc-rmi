import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
    
    protected CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int x, int y){
        return x + y;
    }

    @Override
    public int subtract(int x, int y) {
        return x - y;
    }

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }

    @Override
    public int divide(int x, int y) throws ArithmeticException {
        if(y == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return x / y;
    }
}