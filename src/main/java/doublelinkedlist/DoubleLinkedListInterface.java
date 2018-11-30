package doublelinkedlist;

public interface DoubleLinkedListInterface {

    void addFirst(Object input);

    void addLast(Object input);

    void add(int k, Object input);

    Node node(int index);

    Object removeFirst();

    Object remove(int k);

    Object removeLast();

    Object get(int k);

    int indexOf(Object data);

    int size();

}
