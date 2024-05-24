package ss4_OOP.stop.watch;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        Test test = new Test();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        test.selectionSort(arr);
        stopWatch.stop();
        System.out.println("Thoi gian sap xep la: " + stopWatch.getElapsedTime());
    }

    public void selectionSort(int[] arr) {
        int length = arr.length;
        int temp;
        int min = 0;
        for (int i = 0; i < length - 1; i++){
            for (int j = i +1; j < length; j++){
                if (arr[i] > arr[j]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
