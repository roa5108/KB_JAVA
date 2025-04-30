package command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Command[] commands = {
                new AddCommand(),
                new ExitCommand()
        };

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1: Add, 2: Open, 3: Print, 4: Exit");
            System.out.println("선택: ");
            int sel = scanner.nextInt();

            commands[sel - 1].execute();
        }
    }
}
