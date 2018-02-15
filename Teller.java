import java.lang.reflect.*;

/**
 * class Teller berisi method main yang berfungsi sebagai main program dari aplikasi JBank.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.8, 2018
 * @version 0.7, 2018
 * @version 0.6, 2018
 * @version 0.5, 2018
 * @version 0.4, 2018
 * @version 0.4, 2018
 * @version 0.3, 2018
 * @version 0.2, 2018
 * @since 0.1, 03 Februari 2018
 * 
 * Modul 1 : Class Teller terbentuk. Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
 *           menjadi tipe method String dengan nilai return value-nya String kosong.
 * Modul 2 : 
 * Modul 3 :
 * Modul 4 :
 * Modul 5 :
 * Modul 6 :
 * Modul 7 :
 * Modul 8 :
 * Modul 9 :
 */
public class Teller
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class Teller
     */
    public Teller()
    {
        // initialise instance variables
        
    }

    /**
     * Method utama untuk menjalankan program JBank
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main (String args[])
    {
        // put your code here
        
        //Pengujian modul 2
        
        Customer c1 = new Customer();
        c1.setName("Sanadhi","Sutandi");
        System.out.println("Nama Customer :" + " " + c1.getName() + "\n");
        
        Account a1 = new Account();
        a1.setBalance(10000);
        c1.setAccount(a1);
        System.out.println("Saldo :" + " " + c1.getAccount().getBalance() + "\n");
        
        /*
        Method a = Customer.class.getDeclaredMethod("setName"); 
        a.setAccessible(true);
        a.invoke("Sanadhi","Sutandi");
                     
        Method b = Account.class.getDeclaredMethod("setBalance"); 
        b.setAccessible(true);
        
        b.setBalance(10000);
        c1.setAccount(a1);
        */
    }
}
