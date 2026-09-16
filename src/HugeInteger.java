public class HugeInteger {
    private int[] arr = new int[40];


    public void parse(String number) {
        int length = number.length();
        int start = arr.length - length;
        for (int index = 0; index < length; index++) {
            char c = number.charAt(index);
            arr[start + index] = c - '0';
        }
    }


    public String toString() {
        String result = "";
        boolean startedNumber = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                startedNumber = true;
            }

            if (startedNumber) {
                result = result + arr[i];
            }
        }

        return result;
    }

    public boolean isZero() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isEqualTo(HugeInteger other) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != other.arr[index]) {
                return false;
            }
        }
        return true;
    }

    public boolean isGreaterThan(HugeInteger other) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > other.arr[index]) {
                return true;
            }
            if (arr[index] < other.arr[index]) {
                return false;
            }
        }
        return false;
    }
}

