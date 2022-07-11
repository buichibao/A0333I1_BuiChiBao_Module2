package ss7_acstract_interface.practice.practice2.controller;

import ss7_acstract_interface.practice.practice2.model.ComparableCircle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle comparableCircle[] = new ComparableCircle[3];
        comparableCircle[0]= new ComparableCircle(3.6);
        comparableCircle[1]= new ComparableCircle();
        comparableCircle[2]= new ComparableCircle("yellow",false,3.5);
        System.out.println("Pre- sorted");
        for(ComparableCircle circle : comparableCircle){
            System.out.println(circle);
        }

       Arrays.sort(comparableCircle);

        System.out.println("After - sorted:");
        for(ComparableCircle circle: comparableCircle){
            System.out.println(circle);
        }

    }
}
