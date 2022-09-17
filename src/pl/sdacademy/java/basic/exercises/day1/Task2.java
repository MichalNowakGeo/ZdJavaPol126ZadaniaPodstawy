package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task2 {
    private static final float PI =3.14F;
    public static void main(String[] args) {
        float radius = getDiameterFromUser()/2;
       float circumference = calculateAreaOfACircle(radius);
       float area = calculateAreaOfACircle(radius);


    }
        private static float getDiameterFromUser(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please insert diameter: ");
            //float diameter = scanner.nextFloat();
           //return diameter;
            return scanner.nextFloat();
        }
        private static float calculateCircumfenceOfACirclle(float diameter){
        //2*po*r

            return 2*3.14*(diameter/2);

        }
private static float calculateAreaOfACircle(float radius)



}
