// 1. Java
// A. Create an Array with the values (1,2,3,4,5,6,7) and shuffle it.
import java.util.Arrays;
import java.util.Random;
public class ArrayShuffle {
    public static void main(String[] args)
    {
        int[] array= {1,2,3,4,5,6,7};
        System.out.println("Original Array: "+Arrays.toString(array));
        for(int i=array.length-1;i>=0;i--)
        {
            Random r=new Random();
            int j=r.nextInt(i+1);
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        System.out.println("Suffled Array: "+Arrays.toString(array));
    }
}
