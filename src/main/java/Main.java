import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int inputSteps;
        Frog frog = new Frog();

        List<FrogCommand> commands = new ArrayList<>();
        int curCommand = -1;

        while (true) {
            System.out.println("Введите команду");
            input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            } else if (input.equals("<<")) {
                if (curCommand < 0) {
                    System.out.println("Нечего отменять!");
                } else {
                    commands.get(curCommand).undo();
                    curCommand--;
                }
            } else if (input.equals(">>")) {
                if (curCommand == commands.size() - 1) {
                    System.out.println("Нечего повторить!");
                } else {
                    curCommand++;
                    commands.get(curCommand).myDo();
                }
            } else { //пользователь ввёл новое движение для лягушки
                if (curCommand < commands.size() - 1 && curCommand > 0) {
                    //удаляем все команды которые были отменены
                    for (int i = curCommand; i <= commands.size(); i++) {
                        commands.remove(i);
                    }
                }
                FrogCommand cmd = FrogCommands.emptyCommand();
                if (input.startsWith("+")) {
                    inputSteps = Integer.parseInt(input.substring(1));
                    cmd = FrogCommands.jumpRightCommand(frog, inputSteps);
                } else if (input.startsWith("-")) {
                    inputSteps = Integer.parseInt(input.substring(1));
                    cmd = FrogCommands.jumpLeftCommand(frog, inputSteps);
                } else if (input.equals("!!")) {
                    cmd = commands.get(curCommand);
                }
                curCommand++;
                commands.add(cmd);
                cmd.myDo();
            }

            System.out.println(frog);

        }
    }

}
