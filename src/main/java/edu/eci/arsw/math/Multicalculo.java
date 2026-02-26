package edu.eci.arsw.math;



public class Multicalculo{

    int numeroHilos;
    int numeroCalcular;

    public Multicalculo(int numeroHilos, int numeroCalcular){

        this.numeroCalcular =numeroCalcular;

        if(numeroHilos <= numeroDigitos()){
            this.numeroHilos = numeroDigitos();
        }else {
            this.numeroHilos=numeroHilos;
        }
    }

    public void inicio(){

    }

    public int numeroDigitos(){
        int cont = 0;
        int num = numeroCalcular;
        while (num != 0){
            num = num / 10;
            cont += 1;
        }
        return cont;
    }
}
