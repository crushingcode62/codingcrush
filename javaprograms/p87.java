import java.util.Arrays;
public class p87 {
    public static void main(String args[])
    {
        
        int[] a = {10,20,30,40,50,60,70};
        int index = 2;
        int value = 55;
        System.out.println("Array Before Insert "+Arrays.toString(a) );
        System.out.println("Vaule want to insert: "+value);
        System.out.println("Position : "+ index);
         for(int i=a.length-1;i>index;i--)
        {
            a[i]=a[i-1];
        }
        a[index]=value;
        System.out.println("Array After Insert "+Arrays.toString(a) );
    }
}