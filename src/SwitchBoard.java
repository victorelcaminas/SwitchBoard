import javax.swing.plaf.PanelUI;

public class SwitchBoard {

    private final static int MAX_CALLS = 1000;
    private Call[] calls = new Call[MAX_CALLS];
    private int count;

    public SwitchBoard() {
        count = 0;
    }

    public void registerCall(Call c) {
        calls[count] = c;
        count++;
    }

    public void print() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            System.out.println(calls[i]);
        }
    }

    public int getTurnover() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += calls[i].getCost();
        }
        return total;
    }

    public int getNunmCalls() {
        return count;
    }
}

