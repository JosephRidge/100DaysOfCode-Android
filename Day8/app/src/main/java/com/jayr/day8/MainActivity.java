package com.jayr.day8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<Contact>contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    recyclerView = findViewById(R.id.contRecylView);
    recyclerViewAdapter = new RecyclerViewAdapter(this); //since we are in our activity we pass this
    contacts = new ArrayList<>();

    contacts.add(new Contact("Agent Cow Mc Cow ","cowmcow@yahoo.com","https://s3-wp-lyleprintingandp.netdna-ssl.com/wp-content/uploads/2018/01/09060054/cow-354428_1280.jpg"));
    contacts.add(new Contact("Agent Squirrel","squirelle.forest@yahoo.com","https://mlpnk72yciwc.i.optimole.com/cqhiHLc.WqA8~2eefa/w:600/h:890/q:75/https://bleedingcool.com/wp-content/uploads/2017/07/secret-squirrel-porter-didio-dc-comics-1009282.jpg"));
    contacts.add(new Contact("Agent Tom Cat","agentcat@scagent.com","https://zululandobserver.co.za/wp-content/uploads/sites/56/2015/09/zspycartoon.jpg"));
    contacts.add(new Contact("Super intendent Dawg","whoofwhoof@thepound.com","https://2h0uvg25cp471mr7n0oigg6z-wpengine.netdna-ssl.com/images/dog-inspector.jpg"));
    contacts.add(new Contact("Agent Bugz bunny","bugz@rabbitHelm.com","https://d2lv662meabn0u.cloudfront.net/boomerang/dynamic/video/00000006/6884/68582fbfa6afcd8f15539e82ca76b626378b0644_1573702001.jpg"));
    contacts.add(new Contact("The Amoeba Boyz","amoiba@germs.inc","https://i.pinimg.com/originals/51/ce/eb/51ceeb5b1493d9421177245ef9299bad.png"));

    recyclerViewAdapter.setContacts(contacts);
    recyclerView.setAdapter(recyclerViewAdapter);
//    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
//    recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }
}