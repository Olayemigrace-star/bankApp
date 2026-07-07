package arrayList;

public class ArrayList {
    private String[] list = new String[5];
    private int count;
    public boolean isEmpty() {
        if(count == 0) return true;
        else {
            return false;
        }
        }

    public void add(String content) {
            list[count] = content;
            count++;
        }

    public String remove() {
        String removed = list[--count];
            list[count] = null;
            return removed;
        }

    public int size() {
        return count;
    }

    public int index() {
        return count--;
    }

    public String set(int index) {
        String actual = list[index];
        return actual;
    }
}

