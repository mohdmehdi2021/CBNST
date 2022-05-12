import java.util.Scanner;

class STER{
    double y0,y_final,y1,y3,y5,y2,y4,b,a,no_ofSteps;
    float threebyeight=3/8;
    STER(double y0, double y_final,double y1, double y3,double y5,double y2,double y4,double lowerlim,double upperlim, double num_ofSteps){
        this.y5=y5;
        this.y3=y3;
        this.y1=y1;
        this.y_final=y_final;
        this.y0=y0;
        this.b=upperlim;
        this.a = lowerlim;
        this.no_ofSteps=num_ofSteps;
        this.y2=y2;
        this.y4=y4;
    }




    public double h(){
        return (b-a)/no_ofSteps;
    }
    public double ster(){
        return (((threebyeight)*h())*((y0+y_final)+(3*(y1+y2+y4+y5))+(2*(y3))));
    }
}

public class SimpsonThreeEightRule {
    public static void main(String[] args) {
        double lowlim,upperlim,steps,initValue,finValue,y1,y2,y3,y4,y5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Lower Limit");
        lowlim= scanner.nextDouble();
        System.out.println("Enter Upper Limit");
        upperlim= scanner.nextDouble();
        System.out.println("Enter Number of Steps");
        steps= scanner.nextDouble();
        System.out.println("Enter initial value");
        initValue= scanner.nextDouble();
        System.out.println("Enter final value");
        finValue= scanner.nextDouble();
        System.out.println("Enter (Odd) Y1");
        y1= scanner.nextDouble();
        System.out.println("Enter (Odd) Y3");
        y3= scanner.nextDouble();
        System.out.println("Enter (Odd) Y5");
        y5= scanner.nextDouble();
//        System.out.println("Enter Y6");
//        double y6 = scanner.nextDouble();

        System.out.println("Enter (Even) Y2");
        y2= scanner.nextDouble();
        System.out.println("Enter (Even) Y4");
        y4= scanner.nextDouble();

        STER str = new STER(lowlim,upperlim,steps,initValue,finValue,y1,y2,y3,y4,y5);
        System.out.println(str.ster());
    }
}
