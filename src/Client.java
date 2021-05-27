public class Client extends Account {

    private String name;
    private String Address;
    private String nationalID, phone;
    private Account account;

    public Client(String name, String address, Account account, String nationalID, String phone) {
        this.name = "";
        this.Address = "";
        this.phone = "";
        this.nationalID = "";
        this.account = null;
    }

    public Client(String name, String address, String nationalID, String phone, Account account, double balance_, String accountNumber_) {
        super(balance_, accountNumber_);
        this.name = name;
        this.Address = address;
        this.nationalID = nationalID;
        this.phone = phone;
        this.account = account;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", Address=" + Address + ", account=" + account + ", nationalID=" + nationalID + ", phone=" + phone + '}';
    }


    public void setname(String name) {
        this.name = name;
    }

    public void setaddress(String Address) {
        this.Address = Address;
    }

    public void setaccount(Account account) {
        this.account = account;
    }

    public void setnationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getname() {
        return name;
    }

    public String getaddress() {
        return Address;
    }

    public Account getaccount() {
        return account;
    }

    public String getnationalID() {
        return name;
    }

    public String getphone() {
        return phone;
    }
}




