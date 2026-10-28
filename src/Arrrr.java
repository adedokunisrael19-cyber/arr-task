public class Arrrr {
    public static int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        int beginning = 0;
        int end = length - 1;

        for (int position = length - 1; position >= 0; position--) {
            int leftSquare = nums[beginning] * nums[beginning];
            int rightSquare = nums[end] * nums[end];

            if (leftSquare > rightSquare) {
                result[position] = leftSquare;
                beginning++;
            } else {
                result[position] = rightSquare;
                end--;
            }
        }

        return result;
    }
}
