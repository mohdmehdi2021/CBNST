package com.mohdmehdi.bisectionmethod;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Coder = Mohd Mehdi s/o Arshad Abbas Khan

        double I,negRoot,posRoot,eqn;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter negative root (approx.) you found using hit and Trial method : ");
        negRoot = scan.nextDouble();

        System.out.println("Enter positive root (approx.) you found using hit and Trial method : ");
        posRoot = scan.nextDouble();

        System.out.println("Enter the number of Iteration to repeat : ");
        int numberOfIteration = scan.nextInt();

        System.out.println("User entered "+ negRoot +" as negative Root and "+posRoot+" as positive Root");


        for (int i = 1; i <= numberOfIteration; i++) {
            I = (Math.abs(negRoot) + posRoot)/2;
            System.out.println("Iteration " + i + " Result : "+I);

            eqn = equation(I);
            System.out.println("Result of Equation = "+ eqn);

            if (eqn < 0){
                negRoot = I;
                System.out.println("negative Root = "+negRoot);
            }
            else if (eqn > 0){
                posRoot = I;
                System.out.println("positive Root = "+posRoot);
            }

        }



    }
    public static double equation(double X){
        return (X * X *X * X) - X - 10;
    }
}
