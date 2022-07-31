package case_study.model;

public class Customer extends Person{
    private String idCustomer;
    private String customerType;
    private String address;

    public Customer(){

    }

    public Customer(String idCustomer, String customerType, String address) {
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, String dateOfBirth, String sex, int idNumber, String numberPhone,
                    String email, String idCustomer, String customerType, String address) {
        super(name, dateOfBirth, sex, idNumber, numberPhone, email);
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "idCustomer='" + idCustomer + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
