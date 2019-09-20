public class SelectionSort implements SortingAlgorithm{
    public void sort(int [] a) {
        boolean done = false;
        int counter = 0;
        int min;
        for(int i = 0; i < a.length-1; i++) {
            min = i;
            for(int j = i+1; j < a.length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
}
