package com.example.nhanvien29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nhanvien nv1 = new Nhanvien("Nguyen Vu Luan",23);
        Nhanvien nv2 = new Nhanvien("Nguyen Vu Hoang",28);
        nv1.setGiolamviec(7);
        nv2.setGiolamviec(8);

        Log.d("NGUYENVULUAN","ten: " + nv1.getTen() + ", tuoi: " + nv1.getTuoi() + ", ca lam viec: " + nv1.getCalamviec());
        Log.d("NGUYENVULUAN","ten: " + nv2.getTen() + ", tuoi: " + nv2.getTuoi() + ", ca lam viec: " + nv2.getCalamviec());

    }

}
