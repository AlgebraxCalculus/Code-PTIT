public class Employee {
    private String name, gender, dob, address, tax_id, contract_date;
    public Employee (String name, String gender, String dob, String address, String tax_id, String contract_date) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.tax_id = tax_id;
        this.contract_date = contract_date;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setTax_id(String tax_id) {
        this.tax_id = tax_id;
    }
    public void setContract_date(String contract_date) {
        this.contract_date = contract_date;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getDob() {
        return dob;
    }
    public String getAddress() {
        return address;
    }
    public String getTax_id() {
        return tax_id;
    }
    public String getContract_date() {
        return contract_date;
    }
    @Override
    public String toString() {
        return "00001" + " " + name + " " + gender + " " + dob + " " + address + " " + tax_id + " " + contract_date;
    }
}
