
/**
 * class Account berisi kumpulan method yang berfungsi untuk mengatur akun.
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
 * Modul 1 : Class Account terbentuk. Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
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
public class Account
{
    // instance variables - replace the example below with your own
    private char acctType;
    private double balance;
    private String id;
    
    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
        // initialise instance variables
    }

    /**
     * Method untuk menampilkan akun
     * Ditambahkan saat modul 1
     * @param type Parameter dari method Account dalam bentuk char 
     * @param amount Parameter dari method Account dalam bentuk double
     */
    public Account (char type, double amount)
    {
        
    }
    
    /**
     * Method untuk mengambil uang (deposit)
     * Ditambahkan saat modul 1
     * @param amount Parameter dari method Account dalam bentuk double
     */
    //private void deposit (double amount) //bekas modul 1
    //public void deposit (double amount) //bekas awal modul 2
    public boolean deposit (double amount)
    {
        System.out.println("Saldo saat ini : " + getBalance() + "\n");
        
        if (balance>=0)
        {
            balance = balance + amount;
            System.out.println("Saldo setelah deposit : " + getBalance() + "\n");            
        }
        
        if (balance<0)
        {
            System.out.println("Saldo dalam keadaan negatif ! " + "\n");
            return false;
        }
        return true;
    }
    
    /**
     * Method untuk menampilkan tipe akun
     * Ditambahkan saat modul 1
     * @return acctType Mengembalikan isi data dari instance variable acctType
     */
    public char getAcctType()
    {
        //return 0;
        return acctType; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk menampilkan keadaan balance akun
     * Ditambahkan saat modul 1
     * @return balance Mengembalikan isi data dari instance variable balance
     */
    public double getBalance() //diubah nama method sementara untuk pengujian di modul 2
    //private double getBalance() //aslinya di modul 2
    {
        //return 0;
        return balance; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk menampilkan id
     * Ditambahkan saat modul 1
     * @return id Mengembalikan isi data dari instance variable id
     */
    public String getId()
    {
        //return " ";
        return id; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk memasukkan keadaan balance akun
     * Ditambahkan saat modul 1
     * @param amount Parameter dari method setBalance dalam bentuk double
     */
    public void setBalance(double amount) //diubah nama method sementara untuk pengujian di modul 2
    //private void setBalance(double amount) //aslinya di modul 2
    {
        balance = amount; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk memasukkan id
     * Ditambahkan saat modul 1
     * @param acctId Parameter dari method setID dalam bentuk String
     */
    public void setID(String acctId)
    {
        id = acctId; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk memasukkan tipe akun
     * Ditambahkan saat modul 1
     * @param type Parameter dari method setAcctType dalam bentuk char
     */
    public void setAcctType(char type)
    {
        acctType = type; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk mengambil uang (withdraw)
     * Ditambahkan saat modul 1
     * @param amount Parameter dari method withdraw dalam bentuk double
     */
    //private void withdraw(double amount) //bekas awal modul 2
    public boolean withdraw(double amount)
    {       
        System.out.println("Saldo saat ini : " + getBalance() + "\n");
        
        if (balance>=0)
        {
            balance = balance - amount;
            System.out.println("Saldo setelah deposit : " + getBalance() + "\n");
            if (balance<0)
            {
                System.out.println("Saldo dalam keadaan negatif ! " + "\n");
                balance = balance + amount;
                System.out.println("Saldo saat ini : " + getBalance() + "\n");
                return false;
            }
        }
        
        if (balance<0)
        {
            System.out.println("Saldo dalam keadaan negatif ! " + "\n");
            return false;
        }
        return true;
    }
    
}
