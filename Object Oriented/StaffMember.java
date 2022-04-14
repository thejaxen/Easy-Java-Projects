public abstract class StaffMember {
    String name;
    String address;
    String phone;
    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    abstract double pay();
    public String toString(){
        return name + "," + address + "," + phone;
    }
}