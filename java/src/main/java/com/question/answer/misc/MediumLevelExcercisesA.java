package com.question.answer.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MediumLevelExcercisesA {

    Scanner number;
    Scanner yorn;

    public MediumLevelExcercisesA(){

    }

    static void DisplayNumbers(int[] a) {
        for (int b = 0; b < a.length; b++) {
            System.out.print(a[b]);
            System.out.print(" ");
        }
    }

    static void SumOfNumbers(int...a) {
        int total = 0;
        for (int b = 0; b < a.length; b++) {
            total += a[b];
        }
        System.out.println(" ");
        System.out.println("Sum: " + total);
    }



    public static void main(String[] args) {
        MediumLevelExcercisesA obj01 = new MediumLevelExcercisesA();
        List<Integer> lnumber = new ArrayList<Integer>();

        boolean numbercounter = true;

        while (numbercounter) {
            obj01.number = new Scanner(System.in);
            System.out.println("Please input a number");
            int inputnumber = obj01.number.nextInt();
            lnumber.add(inputnumber);

            System.out.println("Number/s you've entered so far are the following: " + lnumber);

            obj01.yorn = new Scanner(System.in);
            System.out.println("Do you want to continue?");
            String iyorn = obj01.yorn.nextLine().toUpperCase();

            if (iyorn.equals("YES")||iyorn.equals("Y")) {
                System.out.println("You've answered yes, program will proceed.");
            }
            else if (iyorn.equals("NO")||iyorn.equals("N")) {
                System.out.println("You've answered no, program ends.");
                numbercounter = false;
                break;
            }
            else {
                System.out.println("Answer not understood, program continues.");
            }
        } //end of while loop.

        System.out.println("Final review of numbers entered: " + lnumber);

        //Remove below two commented line because it is not need further
        //Integer[] intarray = new Integer[lnumber.size()];
        //intarray = lnumber.toArray(intarray);
        // This can be used for if not java 8 compatible
        /*int[] intarray = new int[lnumber.size()];
        Integer[] temp = lnumber.toArray(new Integer[lnumber.size()]);
        for (int n = 0; n < lnumber.size(); ++n) {
            intarray[n] = temp[n];
        }*/
        //Java 8 and above
        int[] intarray = lnumber.stream().mapToInt(i -> i).toArray();

        MediumLevelExcercisesA.DisplayNumbers(intarray);
        MediumLevelExcercisesA.SumOfNumbers(intarray);
    }

}