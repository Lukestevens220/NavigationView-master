package com.android4dev.navigationview.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by TheAppExperts on 06/10/2016.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "contactsManager";

    // Contacts table name
    private static final String TABLE_CONTACTS = "contacts";

    // Contacts Table Columns names
    private static final String KEY_NAME = "name";
    private static final String KEY_NATIONALNUMBER = "nationalNumber";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_RE_PASSWORD = "re_password";
    private static final String KEY_NATION = "nation";
    private final ArrayList<Contact> contact_list = new ArrayList<Contact>();

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS + "("
                + KEY_NAME + " TEXT ," + KEY_NATIONALNUMBER + " TEXT ,"
                + KEY_PASSWORD + " TEXT,"
                + KEY_RE_PASSWORD + " TEXT ," + KEY_NATION + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

        // Create tables again
        onCreate(db);
    }

    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */

    // Adding new contact
    public void Add_Contact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, contact.get_name()); // Contact Name
        values.put(KEY_NATIONALNUMBER, contact.getNationalNumber());
        values.put(KEY_PASSWORD, contact.getPassword());
        values.put(KEY_RE_PASSWORD, contact.getRePassword()); // Contact Phone
        values.put(KEY_NATION, contact.getNation()); // Contact Email
        // Inserting Row
        db.insert(TABLE_CONTACTS, null, values);
        db.close(); // Closing database connection
    }

    // Getting single contact
    Contact Get_Contact(Contact cont) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_CONTACTS, new String[]{KEY_NAME, KEY_NATIONALNUMBER, KEY_PASSWORD, KEY_PASSWORD, KEY_PASSWORD}, KEY_NAME + "=?",
                new String[]{String.valueOf(cont.get_name())}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Contact contact = new Contact(cursor.getString(0),
                cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
        // return contact
        cursor.close();
        db.close();

        return contact;
    }

    // Getting All Contacts
    public ArrayList<Contact> Get_Contacts() {
        try {
            contact_list.clear();

            // Select All Query
            String selectQuery = "SELECT  * FROM " + TABLE_CONTACTS;

            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery(selectQuery, null);

            // looping through all rows and adding to list
            if (cursor.moveToFirst()) {
                do {
                    Contact contact = new Contact();
                    contact.set_name(cursor.getString(0));
                    contact.setNationalNumber(cursor.getString(1));
                    contact.setPassword(cursor.getString(2));
                    contact.setRePassword(cursor.getString(3));
                    contact.setNation(cursor.getString(4));
                    // Adding contact to list
                    contact_list.add(contact);
                } while (cursor.moveToNext());
            }

            // return contact list
            cursor.close();
            db.close();
            return contact_list;
        } catch (Exception e) {
            // TODO: handle exception
            Log.e("all_contact", "" + e);
        }

        return contact_list;
    }

    // Updating single contact
    public int Update_Contact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, contact.get_name()); // Contact Name
        values.put(KEY_NATIONALNUMBER, contact.getNationalNumber()); // Contact Nationality
        values.put(KEY_PASSWORD, contact.getPassword()); // Contact Phone
        values.put(KEY_RE_PASSWORD, contact.getRePassword()); // Contact Address
        values.put(KEY_NATION, contact.getNation()); // Contact Email

        // updating row
        return db.update(TABLE_CONTACTS, values, KEY_NAME + " = ?",
                new String[]{String.valueOf(contact.get_name())});
    }

    // Deleting single contact
    public void Delete_Contact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_CONTACTS, KEY_NAME + " = ?",
                new String[]{String.valueOf(contact.get_name())});
        db.close();
    }

    // Getting contacts Count
    public int Get_Total_Contacts() {
        String countQuery = "SELECT  * FROM " + TABLE_CONTACTS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        //cursor.close();

        // return count
        return cursor.getCount();
    }
}