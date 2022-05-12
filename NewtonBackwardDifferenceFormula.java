import java.util.Scanner;

class NBDF{
    double giv_x,a,h,neb_y0,neb_y20,neb_y30,neb_y40,fx;
    NBDF(double giv_x,double a,double h, double neb_y0, double neb_y20, double neb_y30, double neb_y40,double fx){
        this.giv_x=giv_x;
        this.a=a;
        this.h=h;
        this.neb_y0=neb_y0;
        this.neb_y20=neb_y20;
        this.neb_y30=neb_y30;
        this.neb_y40=neb_y40;
        this.fx=fx;
    }

    public double nebula(){
        return (giv_x-a)/h;
    }
    public int factorial(int num){
        if (num ==0 || num == 1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }

    public double nbdf_est(){
        return (fx + (nebula()*neb_y0) + (nebula()*(nebula()-1)*neb_y20)/factorial(2) + (nebula()*(nebula()-1)*(nebula()-2)*neb_y20)/factorial(3) + (nebula()*(nebula()-1)*(nebula()-2)*(nebula()-3)*neb_y20)/factorial(4));
    }
}

public class NewtonBackwardDifferenceFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter given X");
        double giv_x = scanner.nextDouble();

        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter h");
        double h = scanner.nextDouble();
        System.out.println("Enter neb_y0");
        double neb_y0 = scanner.nextDouble();
        System.out.println("Enter neb_y20");
        double neb_y20 = scanner.nextDouble();

        System.out.println("Enter neb_y30");
        double neb_y30 = scanner.nextDouble();

        System.out.println("Enter neb_y40");
        double neb_y40 = scanner.nextDouble();

        System.out.println("Enter f(x)");
        double fx = scanner.nextDouble();

        NBDF nbdf = new NBDF(giv_x,a,h,neb_y0,neb_y20,neb_y30,neb_y40,fx);
        System.out.println("Estimated value is = "+ nbdf.nbdf_est());
    }
}
