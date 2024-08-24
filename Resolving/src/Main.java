import java.util.Arrays;

public class Main {
    public static final String ANSI_Green = "\u001B[32m";
    public static void main(String[] args)
    {
        System.out.println(ANSI_Green +  "Here u can see the resolved tasks!");

        System.out.println("Task 1:");
        var mergeSortedArrayTask1 = new MergeSortedArray().ResolvingTask(new int[]{1, 2, 3, 0, 0, 0},3,new int[]{2,5,6},3);
        System.out.println(Arrays.toString(mergeSortedArrayTask1));
        var mergeSortedArrayTask2 = new MergeSortedArray().ResolvingTask(new int[]{1},1,new int[]{},0);
        System.out.println(Arrays.toString(mergeSortedArrayTask2));
        var mergeSortedArrayTask3 = new MergeSortedArray().ResolvingTask(new int[]{0},0,new int[]{1},1);
        System.out.println(Arrays.toString(mergeSortedArrayTask3));
    }
}