package classwork;

public class MissingIndex {

    public static int getMissingIndex(int[] value) {

        int secondIndex;
        int finalIndex = 0;
        for (int index = 0; index < value.length; index++) {
            secondIndex = value[index + 1] ;
            if(value[index] + 1 != secondIndex) {

                finalIndex = value[index] + 1;
            }
        }
        return finalIndex;
    }


}
