package ua.org.crazy.homework19.task01;

public class MyLinkedList<T> implements MyList<T> {

    private int size = 0;
    private Node<T> first;
    private Node<T> last;

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T element) {
        linkLast(element);
    }

    @Override
    public T get(int index) {
        validateIndex(index);
        return findNode(index).item;
    }

    @Override
    public T remove(int index) {
        validateIndex(index);
        return unLink(findNode(index));
    }

    @Override
    public void clear() {
        Node<T> nodeI = first;
        for (int i = 0; i < size; i++) {
            Node<T> next = nodeI.next;
            nodeI.next = null;
            nodeI.prev = null;
            nodeI.item = null;
            nodeI = next;
        }
        first = null;
        last = null;
        size = 0;
    }

    private void linkLast(T element) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(l, element, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    private T unLink(Node<T> nodeToRemove) {
        final T element = nodeToRemove.item;
        final Node<T> prev = nodeToRemove.prev;
        final Node<T> next = nodeToRemove.next;
        if (nodeToRemove.prev == null) {
            first = nodeToRemove.next;
        }
        if (nodeToRemove.next == null) {
            last = nodeToRemove.prev;
        }

        nodeToRemove.item = null;
        nodeToRemove.prev = null;
        nodeToRemove.next = null;

        prev.next = next;
        next.prev = prev;

        size--;
        return element;
    }

    private String indexOutOfBoundMessage(int index) {
        return "Index " + index + ", size " + size;
    }

    private Node<T> findNode(int index) {
        if (index < (size >> 1)) {
            Node<T> nodeToFind = first;
            for (int i = 0; i < index; i++)
                nodeToFind = nodeToFind.next;
            return nodeToFind;
        } else {
            Node<T> nodeToFind = last;
            for (int i = size - 1; i > index; i--)
                nodeToFind = nodeToFind.prev;
            return nodeToFind;
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(indexOutOfBoundMessage(index));
        }
    }
}
