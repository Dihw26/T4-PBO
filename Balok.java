package bangunruang;


public class Balok {
   int panjang;
   int lebar;
   int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
   
    
   
   public float luas(){
       return this.lebar * this.tinggi * this. panjang;
   }
}
    

