package com.question.answer.misc;

import java.util.Scanner;

public class SayingNumber {
    //This returns the English word for numbers 0 - 9
    public static String oneDigitToStr(int num) {
        switch (num) {
            case 0 : return "zero";
            case 1 : return "one";
            case 2 : return "two";
            case 3 : return "three";
            case 4 : return "four";
            case 5 : return "five";
            case 6 : return "six";
            case 7 : return "seven";
            case 8 : return "eight";
            case 9 : return "nine";
        }
        return"";
    }
    //This returns the English words for numbers 10 - 99
    public static String twoDigitToStr(int num) {
        //This returns the English word for numbers 10 - 19
        switch(num){
            case 10 : return "ten";
            case 11 : return "eleven";
            case 12 : return "tweleve";
            case 13 : return "thirteen";
            case 14 : return "fourteen";
            case 15 : return "fifteen";
            case 16 : return "sixteen";
            case 17 : return "seventeen";
            case 18 : return "eighteen";
            case 19 : return "nineteen";
        }
        //This returns the English word for multiples of 10 up until 90.
        String tens[] = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        int onesPlace;
        int tensPlace;
        int i;
        i = num;
        onesPlace = i%10; //Finds ones place
        i /= 10;
        tensPlace = i; //Finds tens place
        if(tensPlace == 0) {
            return oneDigitToStr(onesPlace); //Calls oneDigitToStr for single digit numbers
        }
        if(onesPlace == 0) {
            return tens[tensPlace - 2]; //Multiples of 10
        }
        //Returns all other two digit numbers > 20
        return tens[tensPlace - 2] + " " + oneDigitToStr(onesPlace);
    }
    //Returns the English words for numbers 100-999
    public static String threeDigitToStr (int num) {
        String hundreds = "hundred";
        int hundredsPlace;
        int tensPlace;
        int onesPlace;
        int i;
        i = num;
        onesPlace = i % 100;
        hundredsPlace = i / 100;
        i = num;
        i = i - hundredsPlace;
        tensPlace = i / 10;
        if (hundredsPlace == 0) {
            return twoDigitToStr(tensPlace);
        }
        i = num - hundredsPlace;
        return oneDigitToStr(hundredsPlace) + " hundred " + twoDigitToStr(onesPlace);
    }
    //Returns the English words for numbers 1000+ (within int parameters)
    public static String numToStr (int num) {
        String userNum = Integer.toString(num);
        int billions;
        int millions;
        int thousands;
        int hundredsPlace;
        int tensPlace;
        int onesPlace;
        int i = num;
        int n = userNum.length();
        if (n > 9) {
            if (n < 12) {
                n = 12 - n;
                while (n > 0) {
                    userNum = "0" + userNum;
                    n--;
                }
            }
            billions = Integer.parseInt(userNum.substring(0,3));
            millions = Integer.parseInt(userNum.substring(3,6));
            thousands = Integer.parseInt(userNum.substring(6,9));
            hundredsPlace = Integer.parseInt(userNum.substring(9,12));
            return threeDigitToStr(billions) + " billion " + threeDigitToStr(millions) + " million " + threeDigitToStr(thousands) + " thousand " + threeDigitToStr(hundredsPlace);
        }
        else if (n > 6 && n <= 9) {
            if (n < 9) {
                n = 9 - n;
                while (n > 0) {
                    userNum = "0" + userNum;
                    n--;
                }
            }
            millions = Integer.parseInt(userNum.substring(0,3));
            thousands = Integer.parseInt(userNum.substring(3,6));
            hundredsPlace = Integer.parseInt(userNum.substring(6,9));
            return threeDigitToStr(millions) + " million " + threeDigitToStr(thousands) + " thousand " + threeDigitToStr(hundredsPlace);
        }
        else if (n > 3) {
            if (n < 6) {
                n = 6 - n;
                while (n > 0) {
                    userNum = "0" + userNum;
                    n--;
                }
            }
            thousands = Integer.parseInt(userNum.substring(0,3));
            hundredsPlace = Integer.parseInt(userNum.substring(3,6));
            return threeDigitToStr(thousands) + " thousand " + threeDigitToStr(hundredsPlace);
        }
        else {
            return threeDigitToStr(Integer.parseInt(userNum));
        }
    }
    //This gets user input
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numEntered;
        while(true) {
            System.out.print("Enter an integer to pronounce (any negative value to exit): ");
            numEntered = scnr.nextInt();
            if (numEntered < 0) {
                break;
            }
            System.out.println(numEntered);
            String numToString = numToStr(numEntered);
            System.out.println(numToString);
        }
        System.out.println("kthxbye!");
    }
}