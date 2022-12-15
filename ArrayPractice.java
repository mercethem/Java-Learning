public class ArrayPractice {
    public static void main(String[] args) {
        int numbers1[] = new int[10];

        int numbers2[] = {1, 2, 3, 4, 5};
        numbers2[2] = 15;

        int numbers3[];
        numbers3 = new int[10];
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        System.out.println();

        for (int i = 0; i <numbers2.length ; i++) {
            System.out.println(numbers2[i]++);
        }
        for (int x:numbers2){
            System.out.println(x);
        }
    }
}
