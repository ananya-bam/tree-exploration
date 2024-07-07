import java.util.Queue;

public interface TreeInterface<Key extends Comparable<Key>, Value>{

    boolean contains(Key key);

    int size();

    void insert(Key key, Value val);

    Value get(Key key);

    void remove(Key key);

    String toString();
}