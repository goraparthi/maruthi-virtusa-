import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        //TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        List<Integer>al=new ArrayList<>();
        int a=55;
        int b=75;
        for(int i=a;i<=b;i++) {
            if(palin(i))
            al.add(i);
        }
        int s=0;
        for(Integer i:al){
            s+=i;
        }
        System.out.println(s);
    
    }
    public static boolean palin(int num){
        int x=num;
        int r=0;
        while(num !=0){
            int digit = num%10;
            r=r*10+digit;
            num/=10;
        }
        if(x==r)
        return true;
        return false;
    }
}