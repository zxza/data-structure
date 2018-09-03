public class Array {

    private int[] data;
    private size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getCapacity() {
        return data.length;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(int e) {
//        if (size == data.length) {
//            throw new IllegalArgumentException("AddLast failed. Array is full.");
//        }
//
//        data[size] = e;
//        size++;
        add(size, e);
    }

    public void addFirst(int e) {
        add(0, e);
    }

    public void add(int index,int e) {
        if(size == data.length)
            throw new IllegalArgumentException("Add failed. Array is full.");

        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");

        for (int i = size - 1; i <= index; i++) {
            data[i + 1] = data[i]
        }

        data[index] = e;

        size++;

    }

}
