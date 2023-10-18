package sentinelsearch;
public class sentinelsearch{
public int sel(int a[],int n,int key){
int i=0;
int last=a[n-1];
while(a[i]!=key){
    i++;

}
a[n-1]=last;
if((i<n-1) || (a[n-1]==key))
return i;
else
  return -1;


}
public static void main(String args[]){
    sentinelsearch s=new sentinelsearch();
    int a[]=new int[3];
    a[0]=2;
    a[1]=3;
    a[2]=7;
    int pos=s.sel(a,3,7);
    if(pos==-1)
    System.out.println("key not found in this array");
    else
    System.out.println("key  found in this array at index ="+pos);

}
}
