import java.util.Arrays;

public class MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size;

    // Constructor: Default capacity
    @SuppressWarnings("unchecked")
    public MyList() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Constructor: Custom capacity
    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative.");
        }
        array = (T[]) new Object[capacity];
        size = 0;
    }

    // Method: Return the size of the list
    public int size() {
        return size;
    }

    // Method: Return the current capacity of the list
    public int getCapacity() {
        return array.length;
    }

    // Method: Add an element to the list
    public void add(T data) {
        if (size == array.length) {
            expandArray();
        }
        array[size] = data;
        size++;
    }

    // Method: Expand the internal array (when needed)
    private void expandArray() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }

    // Method: Return a string representation of the list
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < size - 1; i++) {
                sb.append(array[i]).append(", ");
            }
            sb.append(array[size - 1]).append(']');
            return sb.toString();
        }
    }

    // Method: Get an element at a specific index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
        return array[index];
    }

    // Method: Remove an element at a specific index
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }

        T removedItem = array[index];

        // Shift elements to the left to fill the gap
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size - 1] = null;  // Clear the last element
        size--;

        return removedItem;
    }
    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }

        T previousElement = array[index];
        array[index] = data;
        return previousElement;
    }

    // Method: Clear the list
    public void clear() {
        Arrays.fill(array, 0, size, null);
        size = 0;
    }

    // Method: Get sublist from start index (inclusive) to finish index (exclusive)
    public MyList<T> subList(int start, int finish) {
        if (start < 0 || start >= size || finish < start || finish > size) {
            throw new IndexOutOfBoundsException("Invalid start or finish index.");
        }
        MyList<T> subList = new MyList<>(finish - start);

        for (int i = start; i < finish; i++) {
            subList.add(array[i]);
        }

        return subList;
    }

    // Method: Return the index of the first occurrence of the specified element
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Method: Return the index of the last occurrence of the specified element
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Method: Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method: Check if the list contains the specified element
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    // Method: Convert the list to an array
    public T[] toArray() {
        return Arrays.copyOf(array, size);
    }
}
