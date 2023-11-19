class p93{  
public static int getSecondLargest(int[] a, int total)
{  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-2];  
}  
public static void main(String args[])
{  
int a[]={91,25,15,61,33,29};  
System.out.println("Array: ");
for(int x : a)
System.out.println(x);
System.out.println("Second Largest number: "+getSecondLargest(a,6));   
}
}  