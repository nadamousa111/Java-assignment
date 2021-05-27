import java.util.Scanner;




public class Main  {
    
   

    
    public static void main (String[] args){
        Account account=new Account();
        int num=0;
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        account.setBalance(num);
        System.out.println(account.getBalance());
    }
}
