package com.example.jarviz.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ChatModel> lstChat = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //call method
        setUpMessage();


        ListView lstView = (ListView) findViewById((R.id.listview));
        CustomAdapter adapter = new CustomAdapter(lstChat,this);
        lstView.setAdapter(adapter);
    }

    private void setUpMessage() {
        lstChat.add(new ChatModel("taph taph?",true));
        lstChat.add(new ChatModel("kamusta?",false));
        lstChat.add(new ChatModel("agik",true));
        lstChat.add(new ChatModel("ginagawa mu?",false));

    }


}
