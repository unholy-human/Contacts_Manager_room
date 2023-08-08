package com.example.contactsmanager.db;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.contactsmanager.db.entity.Contact;

import java.util.ArrayList;

@Dao
public interface contactDAO {

    @Insert
    public long addContact(Contact contact);

    @Update
    public void updateContact(Contact contact);

    @Delete
    public void deleteContact(Contact contact);


    @Query("SELECT * FROM contacts")
    public ArrayList<Contact> getAllContacts();

    @Query("SELECT * FROM contacts WHERE contact_id =:contactID")
    public Contact getContact(long contactID);
}
