package com.example.lectura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lectura {
    static long FECHA[]={1288122023000L, 1288122023000L, 1288122223000L, 1288122223000L,
            1288122223000L, 1288122623000L, 1288122623000L, 1288122623000L };
    static String HABITACION[] = {"cocina", "baño", "cocina", "baño",
            "comedor", "cocina", "baño", "comedor"};
    static int TEMPERATURA[] = {18, 19, 17, 19,
            17, 19, 22, 22};


    private double tiempo;
    private String habitacion;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    private double distancia;

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    private double temperatura;
    public Lectura (double tiempo,String habitacion,double distancia){
        this.tiempo = tiempo;
        this.habitacion = habitacion;
        this.distancia = distancia;
    }

    public static void main(String[] args) {
        double cocina = 0;
        double baño = 0;
        double comedor = 0;
        int c1=0;
        int c2=0;
        int c3=0;
        List<Lectura> lista = new ArrayList<>();
        Set<String> habitaciones = new HashSet<>();
        for(int n = 0; n<TEMPERATURA.length ; n++){
            lista.add(new Lectura(FECHA[n], HABITACION[n], TEMPERATURA[n]));
            habitaciones.add(HABITACION[n]);
        }
        System.out.println(habitaciones);

        for (int i =0; i<TEMPERATURA.length; i++){

            if (HABITACION[i] == "cocina"){
                cocina += TEMPERATURA[i];
                c1++;
            }else if (HABITACION[i] == "baño"){
                baño += TEMPERATURA[i];
                c2++;
            }else{
                comedor += TEMPERATURA[i];
                c3++;
            }
        }
        comedor = comedor/c3;
        baño = baño/c2;
        cocina = cocina/c1;

        System.out.println("Media 1 comedor = " + comedor);
        System.out.println("Media 1 baño = " + baño);
        System.out.println("Media 1 cocina = " + cocina);
    }
}
/*
public class Lectura {
    static long FECHA[] = {1288122023000L, 1288122023000L, 1288122223000L, 1288122223000L,
            1288122223000L, 1288122623000L, 1288122623000L, 1288122623000L};
    static String HABITACION[] = {"cocina", "baño", "cocina", "baño", "comedor", "cocina", "baño", "comedor"};
    static int TEMPERATURA[] = {18, 19, 17, 19, 17, 19, 22, 22};


    private long tiempo;
    private String habitacion;
    private int temperatura;

    //getters y setters
    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    //Constructor
    public Lectura(long tiempo, String habitacion, int temperatura) {
        this.tiempo = tiempo;
        this.habitacion = habitacion;
        this.temperatura = temperatura;
    }


    public static void main(String[] args) {
        List<Lectura> lecturas = new ArrayList<>();
        double contador = 0;
        double total = 0;

        for(int n=0; n<FECHA.length; n++){
            lecturas.add(new Lectura(FECHA[n],HABITACION[n],TEMPERATURA[n]));
        }


        Set<String> habitaciones = new HashSet<String>();
        for(Lectura lectura : lecturas){
            habitaciones.add(lectura.getHabitacion());
        }
        System.out.println(habitaciones.toString());

        for (String habitacion : habitaciones){
            total = 0;
            contador = 0;
            for(Lectura lectura : lecturas){
                if(lectura.getHabitacion().equals(habitacion)){
                    total += lectura.getTemperatura();
                    contador++;
                }
            }
            System.out.println("Media 1 " + habitacion + " = " + total / contador);
        }


    }

}
 */
