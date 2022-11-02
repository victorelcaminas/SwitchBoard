public class MainSwitchBoard {
    public static void main(String[] args) {
        SwitchBoard switchBoard = new SwitchBoard();
        Call c = new Call("12121343", "+34 1233434",
                20, Call.PROVINCIAL, (byte)2);
        switchBoard.registerCall(c);
        c = new Call("12121343", "+34 1233434",
                10, Call.PROVINCIAL, (byte)1);
        switchBoard.registerCall(c);
        c = new Call("15656343", "+34 1343434",
                20, Call.LOCAL, (byte)0);
        switchBoard.registerCall(c);
        c = new Call("12121343", "+30 1235534",
                40, Call.LOCAL, (byte)0);
        switchBoard.registerCall(c);
        c = new Call("121245643", "+25 1233434",
                35, Call.PROVINCIAL, (byte)2);
        switchBoard.registerCall(c);
        switchBoard.print();
        System.out.println("Total number of calls = " + switchBoard.getNunmCalls());
        System.out.println("Total turnover = " + switchBoard.getTurnover());
    }
}