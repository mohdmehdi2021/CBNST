import java.util.Scanner;

class NFDiff{
    double x,x0,h,dely0, dely20,dely30,dely40,y0;
    NFDiff(double x, double x0, double h, double dely0, double y20, double y30, double y40,double y){
        this.x=x;
        this.x0=x0;
        this.h=h;
        this.dely0=dely0;
        this.dely20=y20;
        this.dely30=y30;
        this.dely40=y40;
        y0=y;
    }

    public double P(){
        return (x-x0)/h;
    }

    public int factorial(int num){
        if (num ==0 || num == 1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }

    public double estimatedAnswer(){
        return y0 + (P()*dely0) + ((P()*(P()-1)*dely20)/factorial(2)) + ((P()*(P()-1)*(P()-2)*dely30)/factorial(3)) + ((P()*(P()-1)*(P()-2)*(P()-3)*dely40)/factorial(4));
    }


}

public class NewtonForwardDifference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x");
        double x = sc.nextDouble();
        System.out.println("Enter x0");
        double x0 = sc.nextDouble();
        System.out.println("Enter interval");
        double h = sc.nextDouble();

        System.out.println("Enter del y0");
        double y0 = sc.nextDouble();
        System.out.println("Enter del y2_0");
        double y20 = sc.nextDouble();
        System.out.println("Enter del y3_0");
        double y30 = sc.nextDouble();
        System.out.println("Enter del y4_0");
        double y40 = sc.nextDouble();
        System.out.println("Enter y0");
        double y=sc.nextDouble();

        NFDiff nfDiff = new NFDiff(x,x0,h,y0,y20,y30,y40,y);
        System.out.println("The estimated result is "+nfDiff.estimatedAnswer());
    }
}
