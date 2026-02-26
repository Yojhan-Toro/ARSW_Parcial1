package edu.eci.arsw.math;
import static edu.eci.arsw.math.Main.bytesToHex;
public class HiloCalculador extends Thread  {

    int ini;
    int fin;
    public HiloCalculador(int ini, int fin){
        this.ini=ini;
        this.fin=fin;
    }

    public void run(){
        System.out.println(bytesToHex(PiDigits.getDigits(ini, fin)));
    }


}

