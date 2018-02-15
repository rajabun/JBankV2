import java.util.regex.Matcher; //ditambahkan saat modul 2
import java.util.regex.Pattern; //ditambahkan saat modul 2

/**
 * class Customer berisi kumpulan method yang berfungsi untuk mengatur customer.
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
 * Modul 1 : Class Customer terbentuk. Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
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
public class Customer
{
    // instance variables - replace the example below with your own
    private Account accounts = new Account();
    private String cityAddress;
    private int custId;
    private String dateOfBirth;
    private String email;
    private String firstName;
    private String lastName;
    private int numberOfCurrentAccounts;
    private String streetAddress;
    private String phoneNumber;
    private String zipOrPostalCode;
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
    }

    /**
     * Method untuk menampilkan customer
     * Ditambahkan saat modul 1
     * @param fname Parameter dari method Account dalam bentuk String 
     * @param lastName Parameter dari method Account dalam bentuk String
     * @param dob Parameter dari method Account dalam bentuk String
     */
    public Customer(String fname, String lname, String dob)
    {
        
    }
    
    /**
     * Method untuk menampilkan customer
     * Ditambahkan saat modul 1
     * @param firstName Parameter dari method Account dalam bentuk String 
     * @param lname Parameter dari method Account dalam bentuk String
     * @param dateOfBirth Parameter dari method Account dalam bentuk String
     * @param custId Parameter dari method Account dalam bentuk Integer (numerik)
     */
    public Customer(String firstName, String lastName, String dateOfBirth, int custId)
    {
        
    }
    
    /**
     * Method untuk menampilkan alamat
     * Ditambahkan saat modul 1
     * @return address Mengembalikan isi data dari instance variable address
     */
    private String getAddress()
    {
        //return " ";
        return streetAddress + ", " + cityAddress + ", " + zipOrPostalCode; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk menampilkan akun
     * Ditambahkan saat modul 1
     * @return accounts Mengembalikan isi data dari instance variable accounts
     */
    //private String getAccount() //bekas modul 1
    public Account getAccount() //diubah nama method sementara untuk pengujian di modul 2
    //private Account getAccount() //aslinya di modul 2
    {
        //return " ";
        return accounts; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk menampilkan id customer
     * Ditambahkan saat modul 1
     * @return custId Mengembalikan isi data dari instance variable custId
     */
    private int getCustomerId()
    {
        //return 0;
        return custId; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk menampilkan email
     * Ditambahkan saat modul 1
     * @return email Mengembalikan isi data dari instance variable email
     */
    private String getEmail()
    {
        //return " ";
        return email; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk menampilkan nama customer
     * Ditambahkan saat modul 1
     * @return name Mengembalikan isi data dari instance variable name
     */
    //private String getCustomerName()
    public String getName() //diubah nama methodnya sementara untuk pengujian di modul 2    
    //private String getName() //diubah nama methodnya di modul 2 //aslinya di modul 2
    {
        //return " ";
        return lastName + ";" + firstName; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk menampilkan nomor akun customer
     * Ditambahkan saat modul 1
     * @return numberOfCurrentAccounts Mengembalikan isi data dari instance variable numberOfCurrentAccounts
     */
    public int getNumOfAccounts()
    {
        //return 0;
        return numberOfCurrentAccounts; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk menampilkan nomor telepon
     * Ditambahkan saat modul 1
     * @return phoneNumber Mengembalikan isi data dari instance variable phoneNumber
     */
    private String getPhoneNumber()
    {
        //return " ";
        return phoneNumber; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk memasukkan alamat customer
     * Ditambahkan saat modul 1
     * @param street Parameter dari method setAddress dalam bentuk String
     * @param city Parameter dari method setAddress dalam bentuk String
     * @param code Parameter dari method setAddress dalam bentuk String
     */
    private void setAddress(String street, String city, String code)
    {
        streetAddress = street; //ditambahkan saat modul 2
        cityAddress = city; //ditambahkan saat modul 2
        zipOrPostalCode = code; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk memasukkan email customer
     * Ditambahkan saat modul 1
     * @param emailAddress Parameter dari method setAddress dalam bentuk String
     */
    //private void setEmail(String emailAddress)
    private boolean setEmail(String emailAddress) //diubah di modul 2
    {
        
        // ^ : Matches the beginning of the line
        // (re) : Grouping
        // . : Any character (may or may not match line terminators)
        // re+ : Matches 1 or more of the previous thing
        // @ : untuk @ dalam format email
        // $ : Matches the end of the line
        // ^(.+)@(.+)$ berarti abcde,123@abcde.com
        
        String regex = "^(.+)@(.+)$"; //membuat string yang akan digunakan pada class Pattern
        
        //A regular expression, specified as a string, must first be compiled into an instance of this class
        Pattern pattern = Pattern.compile(regex); 
        //The resulting pattern can then be used to create a Matcher object that can match arbitrary character sequences against the regular expression.
        Matcher matcher = pattern.matcher((CharSequence) emailAddress);
        
        if(matcher.matches() == true)
        {
            email = emailAddress; //ditambahkan saat modul 2
            //All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern.
            System.out.println(email + " : " + matcher.matches() + "\n");
        }
        
        else if(matcher.matches() == false)
        {
            //All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern.
            System.out.println("Maaf format email yang anda masukan salah" + " : "+ matcher.matches() + "\n");            
        }
        return matcher.matches(); //mengembalikan hasil validasi apakah true atau false
    }
    
    /**
     * Method untuk memasukkan nama customer
     * Ditambahkan saat modul 1
     * @param lname Parameter dari method setAddress dalam bentuk String
     * @param fname Parameter dari method setAddress dalam bentuk String
     */
    //private void setCustomerName(String lname, String fname)
    public void setName(String lname, String fname) //diubah nama methodnya di modul 2, buat pengujian
    //private void setName(String lname, String fname) //diubah nama methodnya di modul 2 //aslinya di modul 2
    {
        firstName = fname; //ditambahkan saat modul 2
        lastName = lname; //ditambahkan saat modul 2        
    }
    
    /**
     * Method untuk memasukkan nomor telepon customer
     * Ditambahkan saat modul 1
     * @param phoneNum Parameter dari method setAddress dalam bentuk String
     */
    private void setPhoneNumber(String phoneNum)
    {
        phoneNumber = phoneNum; //ditambahkan saat modul 2
    }
    
    /**
     * Method untuk memasukkan akun customer
     * Ditambahkan saat modul 2
     * @param accounts Parameter dari method setAccount yang merujuk ke class Account
     */
    public void setAccount(Account accounts) //diubah nama method sementara untuk pengujian di modul 2
    //private void setAccount(Account accounts) //aslinya di modul 2
    {
        this.accounts = accounts; //ditambahkan saat modul 2
    }
}
