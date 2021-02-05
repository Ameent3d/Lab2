import java.util.Arrays;

/**
 * Created by ameen on 31/01/2021.
 */
public class Revers {

    static int arr[]= {1,2,3,4,5};
    int b=arr.length-1;
    public void revers(){
        for(int i=0;i<arr.length/2;i++)
    {
        int a;
        a=arr[i];
        arr[i]=arr[b];
        arr[b]=a;
        b--;

    }

    }
    public void shiftRight(){
        int i;
        for (i=arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];}
        arr[i]=0;


        }
    public void shiftleft(){
        int i;
        for (i=0; i <arr.length -1; i++) {
            arr[i]=arr[i+1];}
        arr[i]=0;


    }
    int []array=new int[5];
    int count=0;
    public void addArray(int s){
       if(count<array.length)
       {
           array[count]=s;
       }
    }


    public static void main(String []args)
    {
      Revers o=new Revers();
        o.revers();
        System.out.println(Arrays.toString(arr));

        o.shiftleft();
        System.out.println(Arrays.toString(arr));
         o.shiftRight();
        System.out.println(Arrays.toString(arr));


    }


}
