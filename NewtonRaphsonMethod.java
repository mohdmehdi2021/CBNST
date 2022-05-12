import java.util.Scanner;

class NewtonRaphsonMethodEqnDeriv{
    double x0,answer;
    int iter;
    NewtonRaphsonMethodEqnDeriv(double x0,int iter){
        this.x0 = x0;
        this.iter = iter;
    }

    public double equationRes(){
        return (Math.pow(x0,3)-(2*Math.pow(x0,2)) + (4*x0) + 3);
    }
    public double derivativeRes(){
        return ((3*Math.pow(x0,2)) - (4*x0) + 4);
    }
    public double netResult(){
        for (int count = 1; count <= iter; count++) {
            answer = x0 - (equationRes()/derivativeRes());
        }
        return answer;
    }
}

public class NewtonRaphsonMethod {
    public static void main(String[] args) {

        // Equation => x^3 - 2x^2 + 4x + 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x0 : ");
        double x0 = sc.nextDouble();
        System.out.println("How many iteration must be performed : ");
        int iter = sc.nextInt();

        NewtonRaphsonMethodEqnDeriv newtonObject = new NewtonRaphsonMethodEqnDeriv(x0,iter);
        System.out.format("Approx. root = %.5f",newtonObject.netResult());
    }
}
