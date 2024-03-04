package org.example;

public class MathFunction {
    public void add(double a, int b){
        System.out.println(a + b);
    }
    public void add(int a, double b){
        System.out.println(a + b);
    }

    public void sub(int c, float d){
        System.out.println(c - d);
    }
    public void sub(double c, float d){
        System.out.println(c - d);
    }

    public void multiply(long e, int f){
        System.out.println(e * f);
    }
    public void multiply(double e, int f){
        System.out.println(e * f);
    }

    public void div(int g, float h){
        System.out.println(g / h);
    }
    public void div(double g, float h){
        System.out.println(g / h);
    }

    public void abs(long a1){
        System.out.println(Math.abs(a1));
    }
    public void abs(int a1){
        System.out.println(Math.abs(a1));
    }

    public void pow(float a2){
        System.out.println(Math.pow(a2,a2));
    }
    public  void pow(double a2){
        System.out.println(Math.pow(a2, a2));
    }


}
