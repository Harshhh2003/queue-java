class ArrayImplementation {
    int arr[];
    int size;
 ArrayImplementation(int n) {
        arr = new int[n];
        size = 0;
    }
 void add(int value) {
        if (size < arr.length) {
            arr[size++] = value;
        } else {
            System.out.println("Array full");
        }
    }  void display() {
        if (size == 0) {
            System.out.println("Array empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    } public static void main(String[] args) {
        ArrayImplementation obj = new ArrayImplementation(5);
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.display();
        obj.add(40);
        obj.add(50);
        obj.add(60); // Array full hoga
        obj.display();
    }
}
