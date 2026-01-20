package crash_c;

import java.util.Date;
import java.awt.*;

public class prac {
    public static void main(String args[]) {

        // type of variable
        // primative(8)
        /* 
        basic int long float double char bool
        */
        int inte=1;
        long lon=1L;
        float flo=1.0f;
        double dou=1.0;
        boolean bo=true;
        char ch='a';
        System.out.println("hello world");

        /*
        Refrence type we need to allocate memory but java will release it automatickly
        1. data opject
        */

        int age=30;
        Date now = new Date(); //instance of Date
        now.getTime();
        System.out.println(now.getTime());

        /*
        Difference between primitive and refrence
        if priative two data is not depend
        */
       int a=10;
       int b=a;
       a=15;
       System.out.printf("b=%d\n",b);


       Point p1= new Point(1, 2);
       Point p2=p1;
       System.out.printf("P2 x=%d\np2 y=%d\n",p2.x,p2.y);
       p1.x=10;
       p1.y=10;
       System.out.printf("P2 x=%d\np2 y=%d\n",p2.x,p2.y);


       
    }
}
