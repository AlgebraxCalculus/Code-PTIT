public class Company {
    private String id, name;
    private int so_sv;
    public Company (String id, String name, int so_sv) {
        this.id = id;
        this.name = name;
        this.so_sv = so_sv;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + so_sv;
    }
}
