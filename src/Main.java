public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("Number of Elements in the Array: " + list.size()); // Print the number of elements in the array
        System.out.println("Array Capacity: " + list.getCapacity()); // Print the capacity of the array
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Number of Elements in the Array: " + list.size()); // Print the number of elements in the array
        System.out.println("Array Capacity: " + list.getCapacity()); // Print the capacity of the array
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Number of Elements in the Array: " + list.size()); // Print the number of elements in the array
        System.out.println("Array Capacity: " + list.getCapacity()); // Print the capacity of the array

        System.out.println("####################################");

        MyList<Integer> list2 = new MyList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println("Value at index 2: " + list2.get(2));
        list2.remove(2);
        list2.add(40);
        list2.set(0, 100);
        System.out.println("Value at index 2: " + list2.get(2));
        System.out.println(list2.toString());

        System.out.println("####################################");

        MyList<Integer> list3 = new MyList<>();
        System.out.println("List Status: " + (list3.isEmpty() ? "Empty" : "Not Empty")); // Print the status of the list3 (empty or not)
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(20);
        list3.add(50);
        list3.add(60);
        list3.add(70);
        System.out.println("List Status: " + (list3.isEmpty() ? "Empty" : "Not Empty")); // Print the status of the list3 (empty or not)
        System.out.println("Index: " + list3.indexOf(20)); // Print the index of the value 20
        System.out.println("Index: " + list3.indexOf(100)); // Print the index of the value 100
        System.out.println("Last Index: " + list3.lastIndexOf(20)); // Print the last index of the value 20
        Object[] array = list3.toArray();
        System.out.println("First element of the Object array: " + array[0]); // Print the first element of the Object array
        MyList<Integer> sublist = list3.subList(0, 3); // Create a sublist
        System.out.println(sublist.toString()); // Print the string representation of the sublist
        System.out.println("Contains 20? " + list3.contains(20)); // Print whether the list3 contains the value 20 or not
        System.out.println("Contains 120? " + list3.contains(120)); // Print whether the list3 contains the value 120 or not
        list3.clear(); // Clear the list3
        System.out.println(list3.toString()); // Print the string representation of the list3


    }
}
