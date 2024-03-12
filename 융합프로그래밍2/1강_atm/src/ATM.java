import java.util.Scanner;

public class ATM {
    private static int balance = 0; // 잔액 변수

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*******************************");
            System.out.println("****         ATM기         ****");
            System.out.println("****       1. 예금         ****");
            System.out.println("****       2. 출금         ****");
            System.out.println("****       3. 조회         ****");
            System.out.println("****       4. 종료         ****");
            System.out.println("*******************************");
            System.out.print("menu > ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    deposit(scanner);
                    break;
                case "2":
                    withdraw(scanner);
                    break;
                case "3":
                    displayBalance();
                    break;
                case "4":
                    System.out.println("ATM기를 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 선택");
                    break;
            }
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.print("예금(만원) > ");
        int amount = scanner.nextInt();
        balance += amount;
        scanner.nextLine(); // 버퍼 비우기
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("출금(만원) > ");
        int amount = scanner.nextInt();
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        scanner.nextLine(); // 버퍼 비우기
    }

    private static void displayBalance() {
        System.out.println("잔액 " + balance + "만원.");
    }
}
