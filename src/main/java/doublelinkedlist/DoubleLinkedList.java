package doublelinkedlist;

public class DoubleLinkedList implements DoubleLinkedListInterface {

    private Node head;  // 첫번째 노드
    private Node tail;
    private int size = 0;

    @Override
    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        if (head != null)
            head.previous = newNode;
        head = newNode;

        size++;
        if (tail == null)
            tail = head;
    }

    @Override
    public void addLast(Object input) {
        Node newNode = new Node(input);
        newNode.previous = tail;
        if (tail != null)
            tail.next = newNode;
        tail = newNode;

        size++;
        if (head == null)
            head = tail;
    }

    @Override
    public Node node(int index) {
        if (index > size - 1) throw new IndexOutOfBoundsException();

        if (index < size / 2) {
            Node target = this.head;
            for (int i = 0; i < index; i++) {
                target = target.next;
            }
            return target;
        } else {
            Node target = this.tail;
            for (int i = this.size - 1; i > index; i--) {
                target = target.previous;
            }
            return target;
        }
    }

    @Override
    public void add(int k, Object input) {
        if (k == 0) {
            addFirst(input);
        } else if (k == this.size - 1) {
            addLast(input);
        } else {
            Node prevNode = node(k - 1);
            Node nextNode = prevNode.next;
            Node newNode = new Node(input);
            newNode.next = nextNode;
            if (nextNode != null)
                nextNode.previous = newNode;
            newNode.previous = prevNode;
            if (prevNode != null)
                prevNode.next = newNode;

            size++;
            if (prevNode == null)
                head = newNode;
            if (nextNode == null)
                tail = newNode;
        }
    }

    @Override
    public Object removeFirst() {
        if (this.size == 0) throw new IllegalArgumentException();

        Node temp = head;
        head = temp.next;
        Object returnValue = temp.value;
        temp = null;
        head.previous = null;
        size--;
        return returnValue;
    }

    @Override
    public Object removeLast() {
        if (this.size == 0) throw new IllegalArgumentException();

        Node temp = tail;
        tail = temp.previous;
        Object returnValue = temp.value;
        temp = null;
        tail.next = null;
        size--;
        return returnValue;
    }

    @Override
    public Object remove(int k) {
        if (k == 0) {
            return removeFirst();
        } else if (k == this.size - 1) {
            return removeLast();
        } else {
            Node prevNode = node(k - 1);
            Node tobeDelectedNode = prevNode.next;
            prevNode.next = tobeDelectedNode.next;
            if(prevNode.next != null)
                prevNode.next.previous = prevNode;
            Object returnValue = tobeDelectedNode.value;
            if(tobeDelectedNode == tail) {
                tail = prevNode;
            }
            tobeDelectedNode = null;
            size--;
            return returnValue;
        }
    }

    @Override
    public Object get(int k) {
        return node(k).value;
    }

    @Override
    public int indexOf(Object data) {
        Node temp = head;
        int index = 0;

        while(!temp.value.equals(data)) {
            temp = temp.next;
            index++;

            if(temp == null) return -1;
        }

        return index;
    }

    @Override
    public int size() {
        return this.size;
    }

}


