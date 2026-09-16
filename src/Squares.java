import java.util.Arrays;

public class squares {
    public static void main(String[]args){

        int[] numbers = {3,5,2,6};
        System.out.print(Arrays.toString(sqrNumber(numbers)));
    }
    public static int [] sqrNumber(int []numbers){
        int [] newNumbers = new int [numbers.length];
        for(int index = 0; index < numbers.length; index++){
            if(!(-100 < numbers[index] && numbers[index] >= 1000)) {


                numbers[index] = numbers[index] * numbers[index];
            }
        }
        int max;
        for (int index = 0; index < numbers.length; index++){
            for(int newIndex = index + 1; newIndex < numbers.length; newIndex++){
                if(numbers[newIndex] < numbers[index]){
                    max = numbers[index];
                    numbers[index] = numbers[newIndex];
                    numbers[newIndex] = max;
                }
            }
        }
        return numbers;

    }
}
