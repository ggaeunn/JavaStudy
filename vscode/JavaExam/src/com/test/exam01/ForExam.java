package com.test.exam01;

import java.util.Arrays;

public class ForExam {
    
    public static void main(String[] args) {

        System.out.println("Integer Size = "+ Integer.SIZE);
        System.out.println("Byte Size = "+ Byte.SIZE);
        System.out.println("Short Size = "+ Short.SIZE);

        System.out.println("Long Size = "+ Long.SIZE);
        System.out.println("Float Size = "+ Float.SIZE);
        System.out.println("Double Size = "+ Double.SIZE);
    
        int[] a = {1, 2, 3, 4, 5};
        String[] str = new String[]{"kia", "park", "lee "};

        for(int i=0; i<a.length; i++)
         System.out.print(a[1]+"\t");

        for(String s:str) System.out.print(s + "\t");

        System.out.println(Arrays.toString(str));

        int sum = 0;
        for(int i=1; i<=100; sum+=i++);
        System.out.println("\n" + "#1 sum = " + sum);

        int i =1;
        sum =0;
        while(true){

            sum += i++;
            if(i>100) break;
        
        }
        System.out.println("#2 sum =" + sum);

        i =1; sum=0;
        while(i<100) sum += i++;
        System.out.println("#3 sum =" + sum);


        i=1; sum=0;
        while(true){
            sum += i++;
            if(i<=100) continue;
            else break;
        }
        System.out.println("#4 sum =" + sum);

        i=1; sum =0;
        do {
            sum += i++;
        }while(i<=100);
        System.out.println("#5 sum =" + sum);


    }


}
