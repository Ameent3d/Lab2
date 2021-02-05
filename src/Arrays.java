import java.util.Scanner;

/**
 * Created by ameen on 05/02/2021.
 */
public class Arrays {
    static int []a={1,2,3,4,5};
    public void shiftlift(){
        for (int i = 0; i <a.length-1 ; i++) {
            a[i]=a[i]+1;

        }
        a[a.length-1]=0;
    }
    public void shiftright(){
        for (int i = a.length-1; i >0 ; i--) {
            a[i]=a[i]-1;
        }
        a[0]=0;


    }
    public static int[]arr=new int[3];
    int nuwNum=0;
    Scanner s=new Scanner(System.in);
    public void add(int n)
    {
       if (nuwNum<arr.length)
       {
           System.out.println("Enetr the number");
           n=s.nextInt();
           arr[nuwNum]=n;
           nuwNum++;
       }
       else
           System.out.println("the aray is full");
    }

    public void sortelement(int n)
    {
        if (nuwNum<arr.length)
        {
            System.out.println("Enetr the number");
            n=s.nextInt();
            arr[nuwNum]=n;
            nuwNum++;
        }
        else
            System.out.println("the aray is full");
    }
    public void delet(int n)
    {
        if (n==arr.length)
        {

        }
        else
            System.out.println("the aray is full");
    }
    public static  void main(String[]args)
    {
        Arrays s=new Arrays();
        s.shiftright();
        System.out.println(java.util.Arrays.toString(a));
        s.shiftlift();
        System.out.println(java.util.Arrays.toString(a));
        for (int i = 0; i < arr.length; i++) {
            s.add(1);
            System.out.println(java.util.Arrays.toString(arr));
        }

        java.util.Arrays.sort(arr);
        System.out.println("Array after sorting");
        System.out.println(java.util.Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {

        }
    }
}
