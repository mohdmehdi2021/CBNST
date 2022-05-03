import java.util.Scanner;

class LagrangeMethod{
    double a,b,c,d,fa,fb,fc,fd,gx;
    public LagrangeMethod(double a,double b, double c,double d,double fa,double fb,double fc, double fd, double gx){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.fa = fa;
        this.fb= fb;
        this.fc= fc;
        this.fd= fd;
        this.gx = gx;
    }
    public double lagrangeMethod(){
        double result = fun1()+fun2()+fun3()+fun4();
        return result;
    }
    public double fun1(){
        double Dxb = gx-b; // Dxb = Difference of x and b
        double Dxc = gx-c;
        double Dxd = gx-d;
        double Dab = a-b;
        double Dac = a-c;
        double Dad = a-d;
        return (((Dxb*Dxc*Dxd)/(Dab*Dac*Dad))*fa);


    }
    public double fun2(){
        double Dxa = gx-a; // Dxb = Difference of x and a
        double Dxc = gx-c;
        double Dxd = gx-d;
        double Dba = b-a;
        double Dbc = b-c;
        double Dbd = b-d;
        return (((Dxa*Dxc*Dxd)/(Dba*Dbc*Dbd))*fb);
        // Mohd Mehdi
    }
    public double fun3(){
        double Dxa = gx-a; // Dxb = Difference of x and a
        double Dxb = gx-b;
        double Dxd = gx-d;
        double Dca = c-a;
        double Dcb = c-b;
        double Dcc = c-d;
        return (((Dxa*Dxb*Dxd)/(Dca*Dcb*Dcc))*fc);

    }
    public double fun4(){
        double Dxa = gx-a; // Dxb = Difference of x and a
        double Dxb = gx-b;
        double Dxc = gx-c;
        double Dda = d-a;
        double Ddb = d-b;
        double Ddc = d-c;
        return (((Dxa*Dxb*Dxc)/(Dda*Ddb*Ddc))*fd);
    }
}

public class Lagrange {
    public static void main(String[] args){

        double xA,xB,xC,xD;
        double fxA,fxB,fxC,fxD;
        double givenX;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data for X");
        System.out.print("Value of A = ");
        xA = sc.nextDouble();

        System.out.print("Value of B = ");
        xB = sc.nextDouble();

        System.out.print("Value of C = ");
        xC = sc.nextDouble();

        System.out.print("Value of D = ");
        xD = sc.nextDouble();

        System.out.println("Enter data for f(X)");
        System.out.print("Value of f(A) = ");
        fxA = sc.nextDouble();

        System.out.print("Value of f(B) = ");
        fxB = sc.nextDouble();

        System.out.print("Value of f(C) = ");
        fxC = sc.nextDouble();

        System.out.print("Value of f(D) = ");
        fxD = sc.nextDouble();

        System.out.print("Value of X to find = ");
        givenX = sc.nextDouble();

        LagrangeMethod lm = new LagrangeMethod(xA,xB,xC,xD,fxA,fxB,fxC,fxD,givenX);
        double answer = lm.lagrangeMethod();
        System.out.println("Value of given Point is "+answer);
    }
}
