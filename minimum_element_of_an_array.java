import java.util.*;
class Kishore{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=100000,b,c,d;
        c= sc.nextInt();
        for (int i=0;i<c;i++){
            b = sc.nextInt();
            if (b<count){count=b;}
        }
        System.out.println(count);
    }
}