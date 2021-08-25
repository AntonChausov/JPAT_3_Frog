import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        List<FrogCommands> commands = new ArrayList<>();
        int curCommand = -1;

        while (true) {
            System.out.println("Введите команду");
            input = scanner.nextLine();

            if (input.equals("<<")) {
                if (curCommand < 0) {
                    System.out.println("Нечего отменять!");
                } else {
                    commands.get(curCommand).undo();
                    curCommand--;
                }
            } else if (/*пользователь хочет повторить действие*/) {
                if (curCommand == commands.size() - 1) {
                    System.out.println("Нечего отменять!");
                } else {
                    curCommand++;
                    commands.get(curCommand).myDo();
                }
            } else { //пользователь ввёл новое движение для лягушки
                if (curCommand != commands.size() - 1) {
                    //удаляем все команды которые были отменены
                }
                FrogCommand cmd = ...
                curCommand++;
                commands.add(cmd);
                cmd.myDo();
            }

            //рисуем поле после команды
        }
    }

}
