import java.util.*;
class Kishore{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0,b,c,d;
        c= sc.nextInt();
        int []arr=new int[c];
        for (int i=0;i<c;i++){
            arr[i] = sc.nextInt();
        }
        d = sc.nextInt();
        for (int i=0;i<c;i++){
            if (arr[i]==d){count++;}
        }
        System.out.println(count);
    }
}