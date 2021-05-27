import java.util.ArrayList;

public class Bank {
    private String name;
    private String Address;
    private String phone;
    private ArrayList<Client> arrClient = new ArrayList<Client>();
    private ArrayList<Account> arrAccount = new ArrayList<Account>();


    public Bank(String name, String Address, String phone) {
        this.name = name;
        this.Address = Address;
        this.phone = phone;


    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return phone;
    }

    public Client add(Client c) {
        arrClient.add(c);
        arrAccount.add(c.getaccount());
        return c;
    }

    public void display() {
        System.out.println(arrClient);


    }

    public void displayAccounts() {
        System.out.println(arrAccount);


    }


}
