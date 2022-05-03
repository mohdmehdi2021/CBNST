import java.util.Scanner;

class RegulaFalsiMethod{
    double A,B,X2,result,sendResultToEquation; //  A = -ve, B = +ve, X2 = number of Iteration performed
    public RegulaFalsiMethod(double a, double b, double x2){
        A = a;
        B = b;
        X2 = x2;
    }
    public double equationOfRFM(double x){
       return  ((x*x*x)-x-1);
    }
    public double findRoot(){
        for (int counter = 0; counter <= X2; counter++) {
            // formula
            result = (((A*funOf_B())-(B*funOf_A()))/(funOf_B()-funOf_A()));
            sendResultToEquation = equationOfRFM(result);
            if (sendResultToEquation > 0){
                A = result;
            }
            if (sendResultToEquation < 0){
                B = result;
            }
        }
        return result;
    }
    public double funOf_A(){
        return equationOfRFM(A);
    }
    public double funOf_B(){
        return equationOfRFM(B);
    }
}

public class RFalsiMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial value of A");
        double initial_A = sc.nextDouble();
        System.out.println("Enter Initial value of B");
        double initial_B = sc.nextDouble();
        // Original author = Mohd Mehdi
        System.out.println("Enter Number of Iteration");
        double iteration = sc.nextDouble();

        RegulaFalsiMethod rfm = new RegulaFalsiMethod(initial_A,initial_B,iteration);
        double answer = rfm.findRoot();
        System.out.println(answer);
    }
}
