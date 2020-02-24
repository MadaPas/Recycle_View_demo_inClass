package com.madapas.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.madapas.recycleviewdemo.adapter.MyRecycleViewAdapter;
import com.madapas.recycleviewdemo.storage.FileStorage;
import com.madapas.recycleviewdemo.storage.NoteStorage;

import java.io.File;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NoteStorage.setFileStorage(new FileStorage(this));

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MyRecycleViewAdapter(getList()));

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("info", "onResume()...");
    }

    private ArrayList<String> getList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("the quick brown fox");
        list.add("jumped over the laizy dog");
        list.add("again and again");
        list.add("again and again");
        list.add("again and again");
        return list;
    }

}