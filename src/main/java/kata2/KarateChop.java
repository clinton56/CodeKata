package kata2;

public class KarateChop {

    static int chopIterative(int number, int[] array) {
        int left = 0;
        int right = array.length - 1;
        int index = -1;
        if (array.length == 0 || number < array[left] || number > array[right]) {
            return index;
        }
        while (left <= right) {
            int pivot = left + (right - left) / 2;
            if (number < array[pivot]) {
                right = pivot - 1;
            } else if (number > array[pivot]) {
                left = pivot + 1;
            } else {
                index = pivot;
                break;
            }
        }
        return index;
    }

    static int chopRecursive(int number, int[] array) {
        return chopIt(number, array, 0, array.length - 1);
    }

    private static int chopIt(int number, int[] array, int left, int right) {
        if (array.length == 0 || number < array[left] || number > array[right]) {
            return -1;
        }
        int pivot = left + (right - left) / 2;
        if (number < array[pivot]) {
            return chopIt(number, array, left, pivot - 1);
        }
        if (number > array[pivot]) {
            return chopIt(number, array, pivot + 1, right);
        }
        return pivot;
    }

}