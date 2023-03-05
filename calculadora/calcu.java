
package calculadora;


public class calcu {
    private double num1;
    private double num2;
    private double result;
    
    public double getNum1() {
        return num1;
    }

    
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    
    public double getNum2() {
        return num2;
    }

   
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    double sumar(){
        return num1 + num2;
    }
    
    double restar(){
        return num1 - num2;
    }
    
    double dividir(){
        return num1/num2;
    }
    
    double multiplicar(){
        return num1 * num2;
    }

    
    public double getResult() {
        return result;
    }

   
    public void setResult(double result) {
        this.result = result;
    }
}
