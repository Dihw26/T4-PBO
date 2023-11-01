/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author LENOVO
 */
public class kubus {
     int sisi;
    
    public kubus(int sisi) {
        this.sisi = sisi;
    }
    
    
    public float volume() {
        return this.sisi* this.sisi* this.sisi;
    }
    
    public float luas(){
        return this.sisi * 6;
    }
}
    

