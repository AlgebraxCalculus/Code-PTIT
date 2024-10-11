public class Team {
    private static int cnt = 1;
    private String ma, ten_team, ten_truong;
    public Team (String ten_team, String ten_truong) {
        this.ma = String.format("Team%02d", cnt++);
        this.ten_team = ten_team;
        this.ten_truong = ten_truong;
    }
    public String getMa() {
        return ma;
    }
    public String getTen_team() {
        return ten_team;
    }
    public String getTen_truong() {
        return ten_truong;
    }
}
