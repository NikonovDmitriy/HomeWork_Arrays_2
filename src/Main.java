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
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int all = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            all += arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.",all );


        //Задание 2
        System.out.println();
        System.out.println("Задание 2");
        int min = 0;
        int max = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                min+=arr[i];
            }
            if(arr[i]>arr[i+1]){
                max+=arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей.", min, max);



        //Задание 3
        System.out.println();
        System.out.println("Задание 3");
        int average = 0;
        average = all/arr.length-1;
        System.out.printf("Средняя сумма трат за месяц составила %d рублей.", average);



        //Задание 4
        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i= reverseFullName.length-1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}