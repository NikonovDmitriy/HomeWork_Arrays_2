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
        for (int i = 0; i < arr.length-1; i++) {
            arr1 = arr1+arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+arr1+" рублей");
    }

    //Задание 2
}