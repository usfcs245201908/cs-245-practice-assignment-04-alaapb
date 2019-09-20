public class BubbleSort implements SortingAlgorithm{
    public void sort(int [] a) {
        boolean done = false;
        while(done == false) {
            done = true;
            for(int j = 0; j < a.length - 1; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    done = false;
                }
            }
        }
    }

}
