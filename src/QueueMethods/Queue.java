package QueueMethods;

public class Queue {
    private int count;
    private String[] items = new String[5];

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(String item) {
        if (count == items.length) throw new IllegalArgumentException("queue is full");
        items[count] = item;
      count++;
    }
    public String push() {
        return items[--count];
    }

    public String peek() {
        if (count == 0) return null;

        return items[0];
    }

    public String remove() {
        if (count == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        String removedItem = items[0];

        for (int element = 0; element < count - 1; element++) {
            items[element] = items[element + 1];
        }

        items[count - 1] = null;
        count--;

        return removedItem;
    }
    }

