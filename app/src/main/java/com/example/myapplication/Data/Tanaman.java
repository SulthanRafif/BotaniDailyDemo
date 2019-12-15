package com.example.myapplication.Data;

public class Tanaman {

    private String nama_tanaman;
    private String jenis_tanaman;
    private int priority;


    public Tanaman() {
    }

    public Tanaman(String nama_tanaman, String jenis_tanaman, int priority){
        this.nama_tanaman = nama_tanaman;
        this.jenis_tanaman = jenis_tanaman;
        this.priority = priority;
    }


    public String getNama_tanaman() {
        return nama_tanaman;
    }

    public String getJenis_tanaman() {
        return jenis_tanaman;
    }

    public int getPriority() {
        return priority;
    }
}
