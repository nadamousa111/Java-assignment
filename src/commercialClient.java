public class commercialClient extends Client {

    private String commercialID;

    public commercialClient(String name, String address, Account account, String nationalID, String phone, String commercialID) {
        super(name, address, account, nationalID, phone);
        this.commercialID = commercialID;
        nationalID = "00000000000000";
    }

    @Override
    public String toString() {
        return "commercialClient{" + "commercialID=" + commercialID + '}';
    }


    public void setcommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    public String getcommercialID() {
        return commercialID;
    }


}
