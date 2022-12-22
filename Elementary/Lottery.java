import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int successCount = 0;
        final int NUMBER_COUNT = 3;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter two number about two digits : ");
        String input = scanner.nextLine();
        String[] inputs = input.split("-");
        if (inputs.length < NUMBER_COUNT) {
            throw new IndexOutOfBoundsException("hata");
        }
        List<Integer> randomNumbers = new ArrayList<Integer>();

        for (int i = 0; i < NUMBER_COUNT; i++) {
            randomNumbers.add((int) (Math.random() * 100));
        }

        for (int i = 0; i < NUMBER_COUNT; i++) {
            if (randomNumbers.contains(Integer.parseInt(inputs[i]))) {
                successCount++;
            }
        }

        for (Object element : randomNumbers) {
            System.out.printf("%s ", element);
        }
        System.out.println();
        for (int i = 0; i < NUMBER_COUNT; i++) {
            System.out.printf("%s ", inputs[i]);
        }

    }
}
//This program coded by my friend. When i learn i will change all of that.