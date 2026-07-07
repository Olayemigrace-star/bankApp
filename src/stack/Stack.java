package stack;

public class Stack {

    private int count;
    private String[] items = new String[5];

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(String item) {
        items[count] = item;
        count += 1;
    }

    public String pop() {
        if (isEmpty()) throw new IllegalArgumentException();
        return items[--count];
    }

    public String peek() {
        String output = items[--count];
        count++;
        return output;
    }
}
