public class BinarySearch {
    public static Integer binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == item) {
                return mid;
            }

            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};
        int itemToFind = 8;

        Integer result = binarySearch(myList, itemToFind);

        if (result != null) {
            System.out.println("Item found at index: " + result);
        } else {
            System.out.println("Item not found in the list.");
        }
    }
}
