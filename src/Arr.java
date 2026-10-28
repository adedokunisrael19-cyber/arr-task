import java.util.Arrays;

public class Arr{
        public static int[] sortedNumbers(int[] numbers){
            int[] sortedNumbers = new int[numbers.length];

            for(int index =0;index<numbers.length; index++){
                sortedNumbers[index] = numbers[index] * numbers[index];
            }
            Arrays.sort(sortedNumbers);
            return sortedNumbers;
        }
    }
