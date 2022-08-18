public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    //Задание 1
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int arr1 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arr1 += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + arr1 + " рублей");


        //Задание 2
        int arr2 = 0;
        int arr3 = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                arr2+=arr[i];
            }
            if(arr[i]>arr[i+1]){
                arr3+=arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ arr2 + " рублей. Максимальная сумма трат за день составила " + arr3 +" рублей.");



        //Задание 3
        int a = 0;
        a = arr1/arr.length-1;
        System.out.println("Средняя сумма трат за месяц составила "+a+" рублей.");
    }
}