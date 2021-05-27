
public class Oop {

    public static void main(String[] args) {
        Account a=new Account(50000.0,"015");
        Account x = new SpecialAccount (70000.0,"16");
        //Client c= new Client();
       Client z= new commercialClient("ali","ali",x,"abcd","1234","12");
        Bank b=new Bank("ahli","dokki","123642");
       // b.add(c);
        b.add(z);
        b.display();
        b.displayAccounts();
        
        
        

    }
    
}
