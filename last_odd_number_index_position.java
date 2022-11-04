import java.util.*;
class Kishore{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0,b,c,d;
        c= sc.nextInt();
        for (int i=0;i<c;i++){
            d = sc.nextInt();
            if (d%2==1){count = i;}
        }
        
        System.out.println(count);
    }
}