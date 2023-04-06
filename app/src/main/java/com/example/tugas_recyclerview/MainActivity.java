package com.example.tugas_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BPAdapter.OnClickShowListener{
RecyclerView recBPList;
List<BP> BPlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBPList();

        recBPList= findViewById(R.id.BPlist);
        BPAdapter bpAdapter= new BPAdapter(this,BPlist,this);

        recBPList.setAdapter(bpAdapter);
        recBPList.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initBPList() {
        BPlist = new ArrayList<>();
        BPlist.add(new BP("Java","Bahasa pemrograman yang berorientasi objek yang digunakan untuk membangun aplikasi berbasis desktop, web, dan mobile.",R.drawable.java));
        BPlist.add(new BP("Phyton","Bahasa pemrograman tingkat tinggi yang digunakan untuk membangun aplikasi web, sains data, dan kecerdasan buatan.",R.drawable.phyton));
        BPlist.add(new BP("JavaScript","Bahasa pemrograman yang digunakan untuk membangun aplikasi web interaktif dan dinamis.",R.drawable.js));
        BPlist.add(new BP("C+"," Bahasa pemrograman yang digunakan untuk membangun aplikasi sistem, game, dan kecerdasan buatan.",R.drawable.c));
        BPlist.add(new BP("GO","Bahasa pemrograman yang diciptakan oleh Google dan digunakan untuk membangun aplikasi skala besar dan backend web.",R.drawable.go));
        BPlist.add(new BP("Swift","Bahasa pemrograman Apple yang digunakan untuk membangun aplikasi iOS, macOS, watchOS, dan tvOS.",R.drawable.swift));
        BPlist.add(new BP("Ruby","Bahasa pemrograman yang populer untuk membangun aplikasi web, terutama melalui kerangka kerja Ruby on Rails..",R.drawable.ruby));

    }

    @Override
    public void onClickShowListener(int position) {
        String name = BPlist.get(position).getName();
        String  S =BPlist.get(position).getS();
        int logo =BPlist.get(position).getLogo();

        Intent intent = new Intent(this,ShowActivity.class);
        intent.putExtra("name",name);
        intent.putExtra("s",S);
        intent.putExtra("logo",logo);
        startActivity(intent);
    }
}