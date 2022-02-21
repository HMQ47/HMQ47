package com.company;

public class Main {

    public static class hmq222 {
        static Integer[] intArray = {10,20,30,40,50,60,70,80,90};
        int[] b=new int[intArray.length];
        public void print (){
            System.out.println("before");
            for(int i=0;i<intArray.length;i++)
                System.out.print(intArray[i] + "  ");
            System.out.println();

        }
        public void Copy(){
            System.out.println("after");
            for(int i=0;i<intArray.length;i++) {
                b[i]=intArray[i];
                System.out.print(b[i] + "   ");
            }
        }

        public static void main(String[] args) {
            hmq222 y=new hmq222();
            y.print();
            y.Copy();
        }

    }

}
