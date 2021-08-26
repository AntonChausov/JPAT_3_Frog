public class Frog {
    public static final int MIN_POSITION = 0;
    public static final int MAX_POSITION = 10;

    protected int position;

    public Frog() {
        position = 5;
    }

    public boolean jump(int steps) {
        int newPosition = steps + position;
        if (newPosition < MIN_POSITION || newPosition > MAX_POSITION) {
            System.out.println("Не могу туда прыгнуть :(");
            return false;
        }
        position = newPosition;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = MIN_POSITION; i <= MAX_POSITION; i++) {
            stringBuilder.append(i == position ? 'O' : '-');
        }
        return stringBuilder.toString();
    }
}
