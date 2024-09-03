import java.util.Arrays;

public class Main {
    public static final String ANSI_Green = "\u001B[32m";
    public static void main(String[] args)
    {
        System.out.println(ANSI_Green +  "Here u can see the resolved tasks!");

        System.out.println("Task 1:");
        var mergeSortedArrayTask1 = MergeSortedArray.ResolvingTask(new int[]{1, 2, 3, 0, 0, 0},3,new int[]{2,5,6},3);
        System.out.println(Arrays.toString(mergeSortedArrayTask1));
        var mergeSortedArrayTask2 = MergeSortedArray.ResolvingTask(new int[]{1},1,new int[]{},0);
        System.out.println(Arrays.toString(mergeSortedArrayTask2));
        var mergeSortedArrayTask3 = MergeSortedArray.ResolvingTask(new int[]{0},0,new int[]{1},1);
        System.out.println(Arrays.toString(mergeSortedArrayTask3));

        System.out.println("Task 2:");
        var removeElementTask1 = RemoveElement.Resolving(new int[]{3,2,2,3},3);
        System.out.printf("The result of first task is: %s. Length: %s%n", Arrays.toString(removeElementTask1), removeElementTask1.length);
        var removeElementTask2 = RemoveElement.Resolving(new int[]{0, 1, 2, 2, 3, 0, 4, 2},2);
        System.out.printf("The result of second task is: %s. Length: %s%n", Arrays.toString(removeElementTask2), removeElementTask2.length);

        System.out.println("Task 3:");
        var removeDuplicities = RemoveDuplicate.Resolve(new int[]{1,1,2});
        System.out.printf("The result of first task is: %s. Length: %s%n",Arrays.toString(removeDuplicities), removeDuplicities.length);
        var removeDuplicities2 = RemoveDuplicate.Resolve(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.printf("The result of first task is: %s. Length: %s%n",Arrays.toString(removeDuplicities2), removeDuplicities2.length);
    }
}