package com.example.nhanvien29072019;

import android.util.Log;

public class Nhanvien {

    private String ten;
    private Integer tuoi;
    private String calamviec;
    private Integer Giolamviec;

    public Nhanvien(String ten, Integer tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
        this.calamviec = calamviec;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getCalamviec() {
        return calamviec;
    }

    public void setCalamviec(String calamviec) {
        if(Giolamviec >= 8 && Giolamviec <= 17) {
            this.calamviec = "ca sang";
        }
        else if(Giolamviec >= 18 || Giolamviec <= 7){
            this.calamviec = "ca toi";
        }
    }

    public void setGiolamviec(Integer time){
        if(time >= 8 && time <= 17){
            this.calamviec = "ca sang";
        }

        else if(time >= 18 || time <= 7){
            this.calamviec = "ca toi";
        }
        this.Giolamviec = Giolamviec;

    }

}
