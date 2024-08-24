public class MergeSortedArray
{
    // Resolving task about sort array
    public int[] ResolvingTask(int[] firstArray, int m, int[] secondArray, int n)
    {
      int firstArrayLenght = m - 1;
      int secondArrayLenght = n - 1;
      int arrayLenght = (m + n) - 1;

      while(secondArrayLenght >= 0)
      {
          if(firstArrayLenght >= 0 && firstArray[firstArrayLenght] > secondArray[secondArrayLenght])
          {
              firstArray[arrayLenght] = firstArray[firstArrayLenght];
              firstArrayLenght--;
              arrayLenght--;
          }
          else
          {
              firstArray[arrayLenght] = secondArray[secondArrayLenght];
              arrayLenght--;
              secondArrayLenght--;
          }
      }
      return firstArray;
    }
}
