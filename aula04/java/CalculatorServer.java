import java.rmi.Naming;

public class CalculatorServer {
    public static void main(String[] args){
        try {
            CalculatorImpl calc = new CalculatorImpl();
            Naming.rebind("rmi://localhost:8000/CalculatorService", calc);
            System.out.println("Servidor RMI aguardando requisição...");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}