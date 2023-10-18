package binarysearch;
import java.util.Scanner;


public class binary{
    public int bnc(int a[],int n,int key){
        int low=0,high=n-1,mid;
        while(low<=high){
            mid=(high+low)/2;
            if(key==a[mid]){
                return mid;

            }
            else
             if(key<a[mid])
             high=mid-1;
             else  
             low=mid+1;

        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many elemnts in array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        binary b=new binary();
        System.out.println("enter array elemnts:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter key");
        int key=sc.nextInt();
        int pos=b.bnc(a, key,n);
       if(pos==-1)
       {
        System.out.println("key not found");

       }
       else
       {
        System.out.println("key foundat position index="+pos);
       }

    }
}