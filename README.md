# MyList Project

This project implements a dynamic array structure named `MyList` using Java generics.

## Features

- Dynamic resizing of the array, doubling its size when needed.
- Two constructors: default constructor with an initial capacity of 10, and a custom constructor allowing specification of the initial capacity.
- Methods for adding, getting, removing, and modifying elements.
- Additional utility methods like obtaining sublist, checking if the list is empty, finding indices of elements, and more.

## Usage

1. Create a `MyList` instance specifying the data type, e.g., `MyList<Integer> list = new MyList<>();`.
2. Add elements using `add` method: `list.add(10);`.
3. Perform various operations on the list using provided methods.

## Example

```java
public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        
        System.out.println("Size of the list: " + list.size());
        System.out.println("Capacity of the list: " + list.getCapacity());
        System.out.println("Element at index 1: " + list.get(1));
    }
}
