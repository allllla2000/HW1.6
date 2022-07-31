import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();


        int sum = 0;
        for (int dayExpenditure : arr) {
            sum += dayExpenditure;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        //задание 2
        System.out.println("Задание 2");
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } else if (max < arr[i]){
                max = arr[i];
            }


            }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. ");

        System.out.println("Максимальная сумма трат за день составила " + max + " рублей. ");
        System.out.println();
        //задание 3
        System.out.println("Задание 3");
        double average = (double) sum/arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей. ");
        System.out.println();
        //задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            
        }




    }








    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}