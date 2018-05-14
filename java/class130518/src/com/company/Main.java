package com.company;

public class Main {

    public static void main(String[] args) {

        int bbb=5;
        bbb++;

        int[] score;
        score= new int[3];
        score[0]=87;
        score[1]=99;
        score[2]=98;

        System.out.println(average(score));
        System.out.println("biggest="+biggest(score));
        System.out.println("sum="+shom(score));
        System.out.println("exiast="+isExist(score,5));

    }
    //----------------------------------------------
    static float average(int[] grades){
        int sum=0;
        for (int i = 0; i <grades.length ; i++) {
            sum+=grades[i];

        }
        float result=sum;
        result/=grades.length;
        return result;


    }
    //----------------------------------------------
    static int biggest(int[] grades){

        int biggest=0;
        for (int i = 0; i <grades.length; i++) {
            if (grades[i]>biggest) biggest=grades[i];

        }
        return biggest;


    }
    //-----------------------------------------------
    static int shom(int[] grades){
        int sum=0;
        for (int i = 0; i <grades.length; i++) {
           sum+=grades[i];


        }

        return sum;
    }
    //-------------------------------------------
    static boolean isExist(int[] grades,int num){

        for (int i = 0; i <grades.length; i++) {

            if(grades[i]==num) return true;

        }
        return false;

    }
    //---------------------------------------------
    static boolean aInB(int[] a,int[] b){

        




    }


}
