import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate
{
    // Resolving task about removing duplicated numbers in array
    public int[] Resolve(int[] numbers)
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
}
