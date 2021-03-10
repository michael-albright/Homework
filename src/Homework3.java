import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Homework3
{

    public static void main(String[] args)
    {
        List<Integer> intList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; ++i)
        {
            System.out.println("Inuput a number: ");
            Integer value = Integer.parseInt(input.nextLine());
            intList.add(value);
        }
        Integer[] intArray = intList.toArray(new Integer[0]);
        System.out.println(intList);
        Arrays.sort(intArray);
        System.out.println("Minimum = " + intArray[0]);
        System.out.println("Maximum = " + intArray[intArray.length - 1]);

        
        int sum = intArray[0] + intArray[1] + intArray[2] + intArray[3] + intArray[4];

        int product = intArray[0] * intArray[1] * intArray[2] * intArray[3] * intArray[4];

        System.out.println("Sum of all numbers: " + sum);
        
        System.out.println("Product of all numbers: " + product);

    }

}


