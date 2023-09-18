public class Main {
    public static void main(String[] args) {
        // Array creation
        int[] predefinedSizeArray = new int[10];
        int size = 5;
        int[] variableSizeArray = new int[size];
        int[] literalArray = {1, 4, 2, 8, 5};

        double[] doubleArray = {1.5, 2.7, 3.2};
        String[] stringArray = {"apple", "banana", "cherry"};
        char[] charArray = {'A', 'B', 'C'};
        boolean[] booleanArray = {true, false, true};

        // Accessing array elements
        predefinedSizeArray[4] = 45;
        System.out.println("5th element value: " + predefinedSizeArray[4]);

        // Error: Accessing array element by non-existing index
        try {
            System.out.println(variableSizeArray[1000]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Iterating over arrays
        System.out.println("Iterating using for loop:");
        for (int i = 0; i < literalArray.length; i++) {
            System.out.println("Element at index " + i + ": " + literalArray[i]);
        }

        System.out.println("Iterating using enhanced for loop:");
        for (double value : doubleArray) {
            System.out.println("Value: " + value);
        }

        System.out.println("Iterating using while loop:");
        int index = 0;
        while (index < stringArray.length) {
            System.out.println("Element at index " + index + ": " + stringArray[index]);
            index++;
        }
    }
}
