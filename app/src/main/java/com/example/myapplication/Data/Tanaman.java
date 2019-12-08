package com.example.myapplication.Data;

public class Tanaman {


    private long id;
    private String nama_tanaman;
    private String jenis_tanaman;

    public Tanaman(){

    }

    public String getJenis_tanaman() {
        return jenis_tanaman;
    }

    public void setJenis_tanaman(String jenis_tanaman) {
        this.jenis_tanaman = jenis_tanaman;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama_tanaman() {
        return nama_tanaman;
    }

    public void setNama_tanaman(String nama_tanaman) {
        this.nama_tanaman = nama_tanaman;
    }

    @Override
    public String toString(){
        return "Tanaman " + nama_tanaman + " " + jenis_tanaman;
    }

}
