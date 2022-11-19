import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class SumPositives {
    public static int sumPositive(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0)
                sum += arr[i];
        }
        return sum;
    }


    public static boolean empty_arr(){
        int[] arr = new int[0];
        int res = sumPositive(arr), expected = 0;
        return res == expected;
    }
   
    public static boolean one_element(){
        Random rd = new Random();
        int[] arr = new int[1];
        arr[0] = rd.nextInt();
        int res = sumPositive(arr), expected = Math.max(arr[0], 0);
        return res == expected;
    }
 
    public static boolean two_elements(){
        Random rd = new Random();
        int[] arr = new int[2];
        arr[0] = rd.nextInt();
        arr[1] = rd.nextInt();
        int expected = Math.max(arr[0], 0) + Math.max(arr[1], 0);
        int res = sumPositive(arr);
        return res == expected;
    }

    public static void main(){
        System.out.println("Check all: ");
        boolean f= empty_arr(), s = one_element(), t = two_elements();
        Assert.assertEquals(f, true);
        Assert.assertEquals(s, true);
        Assert.assertEquals(t, true);
        System.out.println("Empty arr => " + f);
        System.out.println("One Element => " + s);
        System.out.println("Two Elements => " + t);
        if(f && s && t){
            System.out.println("Success !");
        }
    }
}
