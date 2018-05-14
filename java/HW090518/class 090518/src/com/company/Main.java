package com.company;

public class Main {

    public static void main(String[] args) {

        int baseNumber=7;
        int powerNumber=4;
        int xSqrt = 25;
        int status;
        int sum=0;
        int mul=0;
        byte b=127;
        long l;




        status = power3(baseNumber,powerNumber);

        if (status!=-1)
            System.out.println(baseNumber+"^"+powerNumber+"="+status);
        else
            System.out.println("illegal operation");

        System.out.println("sqrt"+xSqrt+"="+ sqrt(xSqrt));
        System.out.println(sqrt2(64.145f,3));

        plot(5,6,2,3);
        paintX(8);
        paintO(40,40,5);
        primes(-123);

    }
    //---------------calc x power y-----------------

    static int power1(int x,int y) {

        int result=x;
        if (y==0 && x==0) {
            return -1;
        }
        if (y==0) return 1;

        for (int i = 1; i <y ; i++) {

            result *= x;
        }
        return result;

    }
    //-------------clac x power y-------------------------------
    static int power2(int x,int y) {

        double result;
        result = Math.pow(x,y);

        return (int)result;

    }
    //--------------clac x power y-------------------------------
    static int power3(int x, int y) {

        if (y == 0) {
            if (x==0) return -1;
            return 1;
        }
        if (x==0 || x==1) return x;


        return power3(x,y-1)*x;

    }
    //----------------------------------------------
    static int sqrt(int x) {

        if (x==0) return 0;


        for (int i = 0; i < x; i++) {

            if (i*i==x) return i;
            if (i*i>x) return i-1;

        }

        return 1;
    }
    //-----------------------------------------------
    static float sqrt2(float x,int y) {

        int shalem;
        float sever;
        int severInt;
        float result;

        shalem = (int)x; //shalem in int
        System.out.println(shalem);

        sever=x-(float)shalem; //sever in float
        System.out.println(sever);

        sever *= power2(10,y);
        System.out.println(sever);

        severInt = (int)sever; //sever in int

        System.out.println(sqrt(shalem)+ "."+ sqrt(severInt));;

        result = sqrt(shalem) + ((float)sqrt(severInt))/power2(10,y-1);

        return result;

    }
    //----------------print a square------------------------------
    static void plot(int height,int width,int top,int right) {

        for (int k = 0; k < top; k++) {
            System.out.println();
        }

        for (int i = 0; i < height ; i++) {

            for (int l = 0; l <right ; l++) {
                System.out.print(" ");
            }

            for (int j = 0; j < width; j++) {


                if (i==0 || i==height-1 || j==0 || j==width-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
    //--------------paint a X-----------------------------------
    static void paintX(int xSize) {

        int shift=0;
        for (int i = 0; i <xSize ; i++) {

            shift++;
            System.out.println();

            for (int j = 0; j < xSize ; j++) {


                if (j==shift || j==xSize-shift)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }

        }

        System.out.print("*");
    }

    //--------------paint a circle---------------------------------
    static void paintO(int a,int b,int r){


        int yShlili=b;
        yShlili*=-1;
        for (int i = 0; i <a+r ; i++) {
            System.out.println();

            for (int j = 0; j <b+r ; j++) {

                if (power2(i-a,2)+power2(-j-yShlili,2)<power2(r,2)) System.out.print("*");
                else System.out.print(" ");


            }

        }
        

    }
    // ----------------is a number is prime--------------------------
    static boolean checkPrime(int x) {

        for (int i = 2; i <x; i++) {

            if(x%i==0) return false;


        }

        return true;
    }

    //-----------------what are the prime deviders of a number--------------------------
    static void primes(int x){
        if (x<0) x*=-1;

        System.out.println(" ");

        System.out.println("the prime dividers of "+ x +" are:");
        System.out.println("1");

        for (int i = 2; i <x; i++) {

            if(x%i==0) {
                if (checkPrime(i)) {
                    System.out.println(i);
                }

            }

        }


    }




}
