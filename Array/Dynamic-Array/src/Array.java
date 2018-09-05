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

        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");

        for (int i = size - 1 ; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public void addLast(E e) {
        add(size, e)
    }

    public void addFirst(E e) {
        add(0, e);
    }


    public E remove(int index) {

        E ret = data[index];

        for (int i = index + 1 ; i < size; i++) {
            data[i - 1] = data[i];
        }

        size--;
        data[size] = null;

        return ret;

    }

    public void removeElement(E e) {

        int index = find(e);
        if (inde) {

        }
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
        for (int i = 0 ; i < data.length; i++) {
            if (data[i] == E) {
                return i;
            }
        }
        return -1;
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
