public class Student {
    private String id, name, lop, email;
    public Student (String id, String name, String lop, String email) {
        this.id = id;
        this.name = name.trim();
        this.lop = lop;
        this.email = email;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLop() {
        return lop;
    }
    public String getEmail() {
        return email;
    }
    public String chuan_hoa() {
        String[] ss = name.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String i : ss) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return res;
    }
    @Override
    public String toString() {
        return id + " " + chuan_hoa() + lop + " " + email;
    }
}
