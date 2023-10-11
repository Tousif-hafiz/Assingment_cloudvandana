// 1. Java
// A. Create an Array with the values (1,2,3,4,5,6,7) and shuffle it.
import java.util.Arrays;
import java.util.Random;
public class ArrayShuffle {
    public static void main(String[] args)
    {
        int[] array= {1,2,3,4,5,6,7};
        System.out.println("Original Array: "+toString(array));
        for(int i=array.length-1;i>=0;i--)
        {
            Random r=new Random();
            int j=r.nextInt(i+1);
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        System.out.println("Suffled Array: "+toString(array));
    }
    // toString method is developed to print like a collection
    static String toString(int[] array){
        StringBuilder str=new StringBuilder("[");
        for(int i=0;i<array.length-1;i++){
            if(i!=array.length-1)
            {
                str.append(array[i]);
                str.append(",");
            }
            str.append(array[array.length-1]);
        }
        str.append("]");
        return str.toString();
    }
}
