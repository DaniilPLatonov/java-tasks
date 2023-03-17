package JetBrains_tasks;

import java.util.Scanner;

public class Main2 {

    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        boolean check = false;
        if (operation == Operation.DEPOSIT) {
            account.setBalance(account.getBalance() + sum);
            check = true;
        }
        if (operation == Operation.WITHDRAW) {
            if (sum > account.getBalance()) {
                System.out.println("Not enough money to withdraw.");
            } else {
                account.setBalance(account.getBalance() - sum);
                check = true;
            }
        }
        return check;
    }

    enum Operation {

        DEPOSIT,
        WITHDRAW
    }

    static class Account {

        private String code;
        private Long balance;

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public void setBalance(Long balance) {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }
    }
}
