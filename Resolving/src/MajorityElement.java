import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MajorityElement
{
    // Resolving task about majority number in array
    public static String Resolve(int[] numbers)
    {
        Set<Integer> intSet = new HashSet<>();
        Map<Integer, Integer> result = new HashMap<>();
        Map.Entry<Integer, Integer> keyValueResult = null;

        for (int i: numbers)
        {
            intSet.add(i);
        }

        for (int i: intSet)
        {
            result.put(i,0);
        }

        for(int numb: result.keySet())
        {
            int majority = 0;
            for(int i:numbers)
            {
                if(i == numb)
                {
                    majority++;
                }
            }
            if(majority > 0)
            {
                result.put(numb,majority);
            }
        }

        for(Map.Entry<Integer, Integer> entry : result.entrySet())
        {
            if(keyValueResult == null || entry.getValue() > keyValueResult.getValue())
            {
                keyValueResult = entry;
            }
        }

        return String.format("The majority of the Array is :[%s, %s]", keyValueResult.getKey(), keyValueResult.getValue());
    }
}
