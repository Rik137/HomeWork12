import java.util.*;

class Main {
    public static void main(String[] args) throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> flor = new LinkedList<>();
        while (true) {
            System.out.println("введи номер этожа от 1 до 25 или 0 для выхода");
            try {
                String input = scanner.nextLine();
                if (input.equals("0")) {
                    for (Integer s : flor) {
                        System.out.print(s + " -> ");
                    }
                    System.out.println(" 0");
                    break;
                } else {
                    Integer numberFlor = Integer.parseInt(input);
                    if (numberFlor < 0 || numberFlor > 25) {
                        System.out.println("такого этажа нет");
                    } else {
                        flor.offer(numberFlor);
                    }
                }
            } catch (RuntimeException e) {
                System.out.println("некорректный ввод");
            }
        }
    }
}
