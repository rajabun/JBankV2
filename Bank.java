
/**
 * class Bank berisi kumpulan method yang berfungsi untuk mengatur bank.
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
 * Modul 1 : Class Bank terbentuk. Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
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
public class Bank
{
    // instance variables - replace the example below with your own
    private double creditInterestRate;
    private String closeTime;
    private double investmentInterestRate;
    private int lastCustID;
    private int nextCustID;
    private String phone;
    private double premiumInterestRate;
    private String startTime;
    public String website;
    public String bankAddress = "1234 JavaStreet, AnyCity, ThisState, 34567";
    public int maxNumOfCustomers = 20;
    public String bankName = "JBANK";

    /**
     * Constructor for objects of class Bank
     */
    public Bank()
    {
        // initialise instance variables
    }
    
    /**
     * Method untuk menampilkan alamat
     * Ditambahkan saat modul 1
     * @return bankAddress Mengembalikan isi data dari instance variable bankAddress
     */
    public String getAddress()
    {
        return " ";
    }
    
    /**
     * Method untuk menampilkan credit rate
     * Ditambahkan saat modul 1
     * @return creditInterestRate Mengembalikan isi data dari instance variable creditInterestRate
     */
    public double getCreditRate()
    {
        return 0;
    }
    
    /**
     * Method untuk menampilkan investment rate
     * Ditambahkan saat modul 1
     * @return investmentInterestRate Mengembalikan isi data dari instance variable investmentInterestRate
     */
    public double getInvestmentRate()
    {
        return 0;
    }
    
    /**
     * Method untuk menampilkan jam operasi
     * Ditambahkan saat modul 1
     * @return time Mengembalikan isi data dari instance variable time
     */
    public String getHoursOfOperation()
    {
        return " ";
    }
    
    /**
     * Method untuk menampilkan id terakhir
     * Ditambahkan saat modul 1
     * @return lastCustID Mengembalikan isi data dari instance variable lastCustID
     */
    public int getLastID()
    {
        return 0;
    }
    
    /**
     * Method untuk menampilkan jumlah maksimal customer
     * Ditambahkan saat modul 1
     * @return maxNumOfCustomers Mengembalikan isi data dari instance variable maxNumOfCustomers
     */
    public int getMaxCustomers()
    {
        return 0;
    }
    
    /**
     * Method untuk menampilkan nama bank
     * Ditambahkan saat modul 1
     * @return bankName Mengembalikan isi data dari instance variable bankName
     */
    public String getName()
    {
        return " ";
    }
    
    /**
     * Method untuk menampilkan id selanjutnya
     * Ditambahkan saat modul 1
     * @return nextCustID Mengembalikan isi data dari instance variable nextCustID
     */
    public int getNextID()
    {
        return 0;
    }
    
    /**
     * Method untuk menampilkan nama website
     * Ditambahkan saat modul 1
     * @return website Mengembalikan isi data dari instance variable website
     */
    public String getWebsite()
    {
        return " ";
    }
    
    /**
     * Method untuk menampilkan premium rate
     * Ditambahkan saat modul 1
     * @return premiumInterestRate Mengembalikan isi data dari instance variable premiumInterestRate
     */
    public double getPremiumRate()
    {
        return 0;
    }
    
    /**
     * Method untuk menampilkan nomor telepon bank
     * Ditambahkan saat modul 1
     * @return phone Mengembalikan isi data dari instance variable phone
     */
    public String getPhone()
    {
        return " ";
    }
    
    /**
     * Method untuk memasukkan credit rate
     * Ditambahkan saat modul 1
     * @param rate Parameter dari method setCreditRate dalam bentuk double
     */
    public void setCreditRate(double rate)
    {
        
    }
    
    /**
     * Method untuk memasukkan investment rate
     * Ditambahkan saat modul 1
     * @param rate Parameter dari method setInvestmentRate dalam bentuk double
     */
    public void setInvestmentRate(double rate)
    {
        
    }
    
    /**
     * Method untuk memasukkan premium rate
     * Ditambahkan saat modul 1
     * @param rate Parameter dari method setPremium dalam bentuk double
     */
    public void setPremium(double rate)
    {
        
    }
}