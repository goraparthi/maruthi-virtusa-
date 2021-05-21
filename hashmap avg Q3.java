package com;

 

import java.util.ArrayList;

 

public class Ex1 {
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    public Integer checkPalindrome(int start,int end)
    {

 

        Integer sum =0,sum2=0;
        for(int i=start;i<=end;i++)
        {
            while(i>0)
            {
                sum = (sum*10) + (i%10);
                i/=10;
            }

 

            if(i==sum)
            {
                a1.add(i);
            }

 

        }
        for(Integer i:a1)
        {
            sum2=sum2+i;
        }
        return sum2;
        
    }
    public static void main(String[] args) {
        Ex1 l=new Ex1();
        System.out.println(l.checkPalindrome(90,120));
    }

 

}