package doublelinkedlist;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class DoubleLinkedListTest {
    DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

    @Test
    public void addFirst() {
        doubleLinkedList.addFirst(2);
        assertThat(doubleLinkedList.size()).isEqualTo(1);
        assertThat(doubleLinkedList.node(0).value).isEqualTo(2);
    }

    @Test
    public void addLast() {
        doubleLinkedList.addLast(4);
        assertThat(doubleLinkedList.size()).isEqualTo(1);
        assertThat(doubleLinkedList.node(0).value).isEqualTo(4);
    }

    @Test
    public void add() {
        doubleLinkedList.add(0, 1);
        doubleLinkedList.add(0, 3);
        assertThat(doubleLinkedList.node(0).value).isEqualTo(3);
        assertThat(doubleLinkedList.node(1).value).isEqualTo(1);
    }

    @Test
    public void removeFirst() {
        doubleLinkedList.add(0, 5);
        doubleLinkedList.add(1, 6);
        doubleLinkedList.removeFirst();
        assertThat(doubleLinkedList.node(0).value).isEqualTo(6);
    }

    @Test
    public void removeLast() {
        doubleLinkedList.add(0, 5);
        doubleLinkedList.add(1, 6);
        doubleLinkedList.removeLast();
        assertThat(doubleLinkedList.node(0).value).isEqualTo(5);
    }

    @Test
    public void indexOf() {
        doubleLinkedList.add(0, 5);
        doubleLinkedList.add(1, 6);
        doubleLinkedList.add(2, 7);
        doubleLinkedList.add(3, 8);
        doubleLinkedList.add(4, 9);
        doubleLinkedList.add(5, 10);
        assertThat(doubleLinkedList.indexOf(10)).isEqualTo(5);
        assertThat(doubleLinkedList.indexOf(12)).isEqualTo(-1);
    }

    @Test
    public void remove() {
        doubleLinkedList.add(0, 5);
        doubleLinkedList.add(1, 6);
        doubleLinkedList.add(2, 7);
        doubleLinkedList.add(3, 8);
        doubleLinkedList.add(4, 9);
        doubleLinkedList.add(5, 10);
        doubleLinkedList.remove(3);
        assertThat(doubleLinkedList.get(3)).isEqualTo(9);
        doubleLinkedList.remove(0);
        assertThat(doubleLinkedList.get(0)).isEqualTo(6);
    }
}