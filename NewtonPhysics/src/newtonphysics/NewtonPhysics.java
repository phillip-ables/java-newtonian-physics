package newtonphysics;

import java.util.Scanner;

public class NewtonPhysics {
    //future classes
    static double findDisplacement(double incline, double friction, double time){
        System.out.println("Finding Displacement");
        return 5.0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double degreeIncline, frictionalCoefficient, targetTime;
        double anDistance;
        /*
        so i would love to start with a free body diagram
        point particle with two arrow png's -> from origin height of png is mangnitude, rotated to rightness
        */        
        //this could be string. index of degree, minus two space chars for number an possible pronoun and one space after for possible pronoun
        //int is deegree, if "downward", "down", "below horizon" degree negative else positive
        System.out.println("Enter degree incline: ");
        degreeIncline = in.nextDouble();
        System.out.println("Enter frictional coefficient: ");
        frictionalCoefficient = in.nextDouble();
        System.out.println("Enter time desired: ");
        targetTime = in.nextDouble();
        
        System.out.println(degreeIncline+" degrees with a "+frictionalCoefficient+" friction coefficient.");
        System.out.println("How far has it been displaced after "+targetTime);
        delay(4000);
        System.out.println("hmmmmm?");
        delay(2000);
        findDisplacement(degreeIncline, frictionalCoefficient, targetTime);
        
    }    
    public static void delay(int millis){
        try{
            Thread.sleep(millis);
        }catch(InterruptedException exp){
        }
    }
}
