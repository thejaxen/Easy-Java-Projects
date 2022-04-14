public class Employee extends StaffMember {
    String socialSecurityNumber;
    double payRate;
    public Employee(String name, String address, String phone,String socialSecurityNumber,double payRate){
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }
    @Override
    double pay() {
        // TODO Auto-generated method stub
        return payRate;
    }
    public String toString(){
        return super.toString() + "," + socialSecurityNumber + ","+ payRate;
    }
    
}
