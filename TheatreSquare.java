import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split("\\s+");
        scanner.close();
        Long[] size = new Long[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            size[i] = Long.parseLong(inputArray[i]);
        }

        Long result = TheatreSquareResult(size[0], size[1], size[2]);
        System.out.println(result);
    }

    public static Long TheatreSquareResult(Long n, Long m, Long  a){
        return ((m+a-1)/a) * ((n+a-1)/a);
    }
}