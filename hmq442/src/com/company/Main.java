package com.company;

public class Main {

    public class hmq444 {
        public static void main(String[] args) {
            double a[] = new double[3];
            System.out.println("before");
            for (int i = 0; i <a.length ; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            System.out.println("after");
            for (int i = 0; i <a.length ; i++) {
                double random=Math.random();
                a[i]=random;
                System.out.println(a[i]);
            }

        }

    }

}
