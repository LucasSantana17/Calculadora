package calculadora;

public class opraçoes {

    private double number1;
    private double number2;
    public double resul;

    opraçoes(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    opraçoes(){

    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double Soma (){
      return resul = number1 + number2;
    }

    public double Subtr (){
        return resul = number1 - number2;
    }

    public double  Multp (){
      return resul = number1 * number2;
    }

    public double  Div (){
       return resul = number1 / number2;
    }

}
