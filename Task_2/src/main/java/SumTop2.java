public class SumTop2 {
    public static int sumOfTopTwo(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two integers.");
        }else if (numbers.length == 2) {
        	return numbers[0] + numbers[1] ;
        }else {
        	int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

            for (int num : numbers) {
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max2 = num;
                }
            }

            return max1 + max2;
        }
    }
    
    /*Check test cases by running project with JUnit Test*/
    public static void main(String[] args) {
        System.out.println(sumOfTopTwo(new int[]{1, 4, 2, 3, 5})); // 9
        System.out.println(sumOfTopTwo(new int[]{10, 9})); // 19
        System.out.println(sumOfTopTwo(new int[]{-1, -2, -3})); // -3
        System.out.println(sumOfTopTwo(new int[]{100, 100, 50, 50})); // 200
        System.out.println(sumOfTopTwo(new int[]{1000, 9999999, 12345, 2345})); // 10012344
        System.out.println(sumOfTopTwo(new int[]{42})); // failure
        System.out.println(sumOfTopTwo(new int[]{})); // failure
    }
}
