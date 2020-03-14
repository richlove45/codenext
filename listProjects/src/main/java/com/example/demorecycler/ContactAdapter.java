package com.example.demorecycler;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<Contact> {

    private Context myContext;
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public ContactAdapter (Context myContext,ArrayList<ContactsContract.Contacts> myContacts){

        super(myContext,0,myContacts);
        this.myContext = myContext;
        this.myContacts = myContacts;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(myContacts == null){

            convertView = LayoutInflater.from(myContext).inflate(R.layout.contact_items,parent,false);
        }

        Contact currentContact = myContacts.get(position);

        //we are starting linking

        ImageView profilepic = convertView.findViewById(R.id.profilepic);
        profilepic.setImageResource(currentContact.getProfilePic());

        TextView name = convertView.findViewById(R.id.name);
        name.setText(currentContact.getName());

        TextView phone = convertView.findViewById(R.id.number);
        phone.setText(currentContact.getNumber());

        return super.getView(position, convertView, parent);
    }
}
