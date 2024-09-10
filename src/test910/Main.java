package test910;

import java.util.*;

public class Main {
    public static void main1(String[] args) {
        int a,b,c,max;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        max=a;


        if (b > max) {
            max=b;
        }
        if (c>max){
            max=c;
        }


        System.out.println(max*max);

//        JOptionPane.showMessageDialog(null,"x=3;"+"\ny=5;"+"\nx+y="+sum);
//        System.exit(0);
    }

    public static void main(String[] args) {
        int sum=0;
        while (sum<10){
            System.out.println(sum);
            sum++;
        }


}}