import java.util.ArrayList;
import java.util.List;

public class RemoveElement
{
    // Resolving task about RemoveElement
    public int[] Resolving(int[] numbers, int removeValue)
    {
        List<Integer> withRemovedElements = new ArrayList<>();

        for (int fromArray : numbers) {
            if (fromArray != removeValue) {
                withRemovedElements.add(fromArray);
            }
        }

        return withRemovedElements.stream().mapToInt(i->i).toArray();
    }
}

