package com.example.demorecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contact>contacts;
    private ListView list;
    private ContactAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacts = new ArrayList<Contact>();
        list = findViewById(R.id.items);//items linked

        contacts.add(new Contact(R.drawable.ic_launcher_background, name: "Bob", number:"9292224663"));
        contacts.add(new Contact(R.drawable.ic_launcher_background, name: "Bob", number:"9292224663"));
        contacts.add(new Contact(R.drawable.ic_launcher_background, name: "Bob", number:"9292224663"));
        contacts.add(new Contact(R.drawable.ic_launcher_background, name: "Bob", number:"9292224663"));
        contacts.add(new Contact(R.drawable.ic_launcher_background, name: "Bob", number:"9292224663"));
        contacts.add(new Contact(R.drawable.ic_launcher_background, name: "Bob", number:"9292224663"));


        myAdapter = new ContactAdapter(myContacts: this,contacts);
        list.setAdapter((myAdapter));
    }
}
