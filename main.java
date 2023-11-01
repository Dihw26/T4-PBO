package bangunruang;


public class main {
     public static void main(String[] args) {
        
        BangunRuang bangunruang= new Bangunruang();
        Kubus kubus = new kubus(5);
        Balok Balok = new Balok(6, 3);
      
        
       
        bangunRuang.volume();
        bangunRuang.luas();
        
        System.out.println("volume kubus: " + kubus.volume());
        System.out.println("luas kubus: " + kubus.luas());
        System.out.println("volume balok:"+ balok. volume());
        System.out.println("Luas balok:"+ balok. luas());
    }
    
}
