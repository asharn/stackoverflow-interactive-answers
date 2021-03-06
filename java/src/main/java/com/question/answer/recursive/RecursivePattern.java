package com.question.answer.recursive;

public class RecursivePattern {

    public static int countPairs(String str) {
        if(str.length()<3) {
            return 0;
        }else{
            if(str.charAt(0)==str.charAt(2)){
                str = str.substring(1);
                return 1 + countPairs(str);
            }else{
                str = str.substring(1);
                return countPairs(str);
            }
        }
    }
    /*public static void main(String[] args){

        *//**
         * We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.
         *
         * countPairs("axa") → 1
         * countPairs("axax") → 2
         * countPairs("axbx") → 1

         * public int countPairs(String str) {
         *
         * }
         *//*
        System.out.println(countPairs("AxAxA"));
    }*/

   /* public static void main(String[] args){
        *//**
         * Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.
         *
         * countHi2("ahixhi") → 1
         * countHi2("ahibhi") → 2
         * countHi2("xhixhi") → 0
         *//*
        System.out.println(countHi2("xhixhi"));
    }*/


    public static int countHi2(String str) {
        if(str.length()<2){
            return 0;
        }else{
            if("hi".equals(str.substring(0,2))){
                str = str.substring(2);
                return 1 + countHi2(str);
            }else if(str.length() > 2 && "xhi".equals(str.substring(0,3))){
                str = str.substring(3);
                return countHi2(str);
            }else{
                str = str.substring(1);
                return countHi2(str);
            }
        }
    }

    public static void main(String[] args){
        /**
         *  Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
         *
         * parenBit("xyz(abc)123") → "(abc)"
         * parenBit("x(hello)") → "(hello)"
         * parenBit("(xy)1") → "(xy)"
         */
        System.out.println(parenBit("xyz(abc)123"));
    }

    public static String parenBit(String str) {

        if(str.length()==0){
            return "";
        }

        return "";
    }
}
