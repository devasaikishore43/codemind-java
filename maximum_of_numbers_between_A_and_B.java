import java.util.*;
class Kishor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,c,d,count=0,z=0;
        a = sc.nextInt();
        int b[]=new int[a];
        for (int i=0;i<a;i++)
        {b[i] = sc.nextInt();
        }
        c = sc.nextInt();
        d = sc.nextInt();
        for (int i=0;i<a;i++)
        {
            if (c<=b[i] && d>=b[i]){
                if (z<b[i]){z=b[i];}
                count++;}
            
        }
        if (z==0){System.out.println(-1);}
        else{System.out.println(z);}
    }
}