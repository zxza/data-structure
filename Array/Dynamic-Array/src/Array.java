public class Array<E> {

    private E[] data;
    private int size;

    public Array(int capacity) {
        data = (E[])new Object[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public void add(int index, E e) {

    }

    public void addLast(E e) {
        add(size, e)
    }

    public void addFirst(E e) {
        add(0, e);
    }


    public E remove(int index) {

    }

    public void removeElement(E e) {
        remove(index);
    }

    public E removeLast() {
        remove(size);
    }

    public E removeFirst() {
        remove(0);
    }


    public boolean contains() {

    }

    public int find(E e) {

    }

    public int getSize() {

    }

    public int getCapacity() {

    }

    public E get(int index) {

    }

    public void set(int index, E e) {

    }

}
