import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Calculator calc = (Calculator) Naming.lookup("rmi://localhost:8000/CalculatorService");
            System.out.println("Soma: 10 + 5 = " + calc.add(10, 5));
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}