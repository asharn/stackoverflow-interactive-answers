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

    public static void main(String[] args){
        System.out.println(countHi2("xhixhi"));
    }


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

}
