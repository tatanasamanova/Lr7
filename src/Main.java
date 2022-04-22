import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws FormulaException {
        System.out.println("Введите x:");
        int num1=new Scanner(System.in).nextInt();
        System.out.println("Введите y:");
        int num2=new Scanner(System.in).nextInt();
        System.out.println("Введите z:");
        int num3=new Scanner(System.in).nextInt();
        Formula formm = new Formula (num1,num2,num3);
        formm.displayFormula(num1,num2,num3);

    }
}

class Formula {
    float x;
    float y;
    float z;

    public Formula(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void displayFormula(int num1,int num2,int num3) throws FormulaException {
        if (num1<0|num2<0|num3<0) throw new FormulaException("Вы ввели число меньше 0",num1);
        double l = Math.sqrt(x * x + y * y + z * z);
        System.out.println(l);
    }

}
class FormulaException extends Exception{
    private float number1;
    public float getNumber1(){return number1;}
    public FormulaException(String message,float num1){
        super(message);
        number1=num1;
    }

}
