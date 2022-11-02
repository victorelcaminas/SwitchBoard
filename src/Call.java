import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

public class Call {

    public static final byte LOCAL = 0;
    public static final byte PROVINCIAL = 1;
    public static final int LOCAL_COST = 15;
    public static final int TYPE1_COST = 20;
    public static final int TYPE2_COST = 25;
    public static final int TYPE3_COST = 30;
    private String sourceCall;
    private String destinationCall;
    private int duration;
    private int location;
    private byte feeType; // 1, 2 or 3
    private int cost;
    Call(String sc, String dc, int dur, int loc, byte fee) {
        sourceCall = sc;
        destinationCall = dc;
        duration = dur;
        location = loc;
        feeType = fee;
        if (location == LOCAL) {
            cost = duration * LOCAL_COST;
        } else { //Provincial
            switch (feeType) {
                case 1: cost = duration * TYPE1_COST;
                    break;
                case 2: cost = duration * TYPE2_COST;
                    break;
                case 3: cost = duration * TYPE3_COST;
                    break;
                default:
                    cost = duration * LOCAL_COST;
                    break;
            }
        }
    }
    @Override
    public String toString() {
        return sourceCall + " - " + destinationCall +
                " | " + duration+" seconds";
    }
    public int getCost() {
        return cost;
    }
}

