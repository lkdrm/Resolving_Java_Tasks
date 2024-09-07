import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate
{
    // Resolving task about removing duplicated numbers in array
    public static int[] Resolve(int[] numbers)
    {
        List<Integer> result = new ArrayList<>();
        int currentNumber = Integer.MIN_VALUE;

        for(int number : numbers)
        {
            if(currentNumber != number)
            {
                result.add(number);
            }
            currentNumber = number;
        }

        return result.stream().mapToInt(i->i).toArray();
    }

    // Resolving task about removing duplicated numbers in array
    public static int[] Resolve2(int[] numbers)
    {
        List<Integer> result = new ArrayList<>();
        int currentNumber = Integer.MIN_VALUE;
        int twice = 0;

        for(int number : numbers)
        {
            if(currentNumber != number)
            {
                twice = 0;
            }
            currentNumber = number;
            if(twice < 2)
            {
                result.add(number);
                twice++;
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}
