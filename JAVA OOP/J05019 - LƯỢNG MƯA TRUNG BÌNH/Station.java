public class Station {
    private static int cnt = 1;
    private String id, name, bd, kt;
    private int amount, time;

    public Station(String name, String bd, String kt, int amount) {
        this.id = String.format("T%02d", cnt++);
        this.name = name;
        this.bd = bd;
        this.kt = kt;
        this.amount = amount;
        this.time = changeTime(bd, kt);
    }

    private static int changeTime(String bd, String kt) {
        String[] st = bd.split(":");
        String[] en = kt.split(":");
        int h1 = Integer.parseInt(st[0]), m1 = Integer.parseInt(st[1]);
        int h2 = Integer.parseInt(en[0]), m2 = Integer.parseInt(en[1]);
        return (h2 * 60 + m2) - (h1 * 60 + m1);
    }
    
    public void addTimeAmount(String bd, String kt, int amount) {
        this.time += changeTime(bd, kt);
        this.amount += amount;
    }
    
    @Override
    public String toString() {
        double average = (double) amount / time * 60;
        return String.format("%s %s %.2f", id, name, average);
    }
}
