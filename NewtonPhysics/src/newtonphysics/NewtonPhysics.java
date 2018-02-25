package newtonphysics;

import java.util.Scanner;

public class NewtonPhysics {
    //future classes
    static double FrictionRampNullMass(double incline, double friction, double time){
        System.out.println("Finding Displacement");
        double wX, wY, Fnormal, Ffriction;
        double g = 9.8;
        double acceleration, displacement;
        //CLASS NOTES
        //break into x and y components
            //wx -> wsintheta -> mg sin theta
            //wy -> wcostheta -> mg cos theta
        //sumation of fy = Force normal - mg cos theta --> F subn = mg cos theta
        //sumation of fx = magnitude friction + mg sin 30 = ma
            //magnitude of friction = coeficient friction times the contact force normal
        //-coefficient of friction time Fnormal plus m g sin theta = m a
            //everything has mass
        //neg coefficient friction times g cos theta + g sin theta equals acceleration
        
        //first break weight into its x and y components
        wX = g * (Math.sin(Math.toRadians(incline)));
        wY = g * (Math.cos(Math.toRadians(incline)));
        
        //find normal to set friction
        Fnormal = wY;
        Ffriction = Fnormal * friction;
        
        //acceleration equals net force, only x direction is unequal
        acceleration = wX - Ffriction;
        displacement = 0.5 * acceleration * (time * time);
        
        System.out.println(acceleration);
        
        return displacement;
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
        anDistance = FrictionRampNullMass(degreeIncline, frictionalCoefficient, targetTime);
        
        System.out.println("Your total displacement after "+targetTime+" seconds is : "+anDistance+" m");
    }    
    public static void delay(int millis){
        try{
            Thread.sleep(millis);
        }catch(InterruptedException exp){
        }
    }
}
