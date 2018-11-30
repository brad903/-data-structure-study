package doublelinkedlist;

import java.util.Objects;

public class Node {
    Node previous;
    Object value;
    Node next;

    public Node(Object value) {
        this.previous = null;
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(previous, node.previous) &&
                Objects.equals(value, node.value) &&
                Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(previous, value, next);
    }
}


