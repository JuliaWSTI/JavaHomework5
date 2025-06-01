package Task5_1;
import java.util.Iterator;
import java.util.TreeSet;

class Wspolrzedna implements Comparable<Wspolrzedna> {

    private int x, y;
    public Wspolrzedna(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Wspolrzedna o) {
        int result = Integer.compare(this.x, o.x);
        if (result != 0) return result;
        return Integer.compare(this.y, o.y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}



public class Task1 {
    private static void writeElements(TreeSet set){
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
    public static void main(String[] args) {
        TreeSet<Wspolrzedna> set = new TreeSet<>();

        set.add(new Wspolrzedna(2, 3));
        set.add(new Wspolrzedna(-3, 0));
        set.add(new Wspolrzedna(-1, 2));
        set.add(new Wspolrzedna(-1, 2));
        set.add(new Wspolrzedna(-3, -2));
        writeElements(set);

    }
}

