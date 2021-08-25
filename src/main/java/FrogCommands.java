public class FrogCommands implements FrogCommand {
    public static FrogCommand jumpRightCommand(Frog frog, int steps) {
        // возвращаете объект команды, у которого
        // если вызвать .do(), то лягушка её выполнит,
        // если вызвать .undo(), то лягушка её отменит
        return new FrogCommand();
    }

    @Override
    public boolean myDo() {
        return false;
    }

    @Override
    public boolean undo() {
        return false;
    }
}
