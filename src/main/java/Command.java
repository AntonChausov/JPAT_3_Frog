public class Command implements FrogCommand{
    @Override
    public boolean myDo() {
        return false;
    }

    @Override
    public boolean undo() {
        return false;
    }
}
