package com.example.sharedpreferencesingletoneclass;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;




public class SharedPreference {

    private static final String SHARED_NAME="ascii";
    private SharedPreferences sharedPreference;
    private SharedPreferences.Editor editor;
    private static Preference mInstancePreference;


    private static final String firstName="First Name";
    private static final String lastName="Last Name";
    private static final String Email="Email";
    private static final String islogin="islogin";

   public SharedPreference(Context mcontext){
       sharedPreference= PreferenceManager.getDefaultSharedPreferences(mcontext);
       editor=sharedPreference.edit();
       editor.putInt(SHARED_NAME,0);
       editor.apply();
   }

   public static Preference getmInstancePreference(Context mcontext){
       if(mInstancePreference==null){
           mInstancePreference= new Preference(mcontext);

           }

        return mInstancePreference;
       }

       public void setFirstName(String fNAME){
          editor.putString(firstName,fNAME).commit();
       }

       public String getFirstName(){
          return sharedPreference.getString(firstName,"");
       }

       public void setLastName(String lName){
         editor.putString(lastName,lName).commit();
       }

       public String getLastName(){
          return sharedPreference.getString(lastName,"");
       }

       public void setEmail(String email){
          editor.putString(Email,email).commit();
       }

       public String getEmail(){
         return sharedPreference.getString(Email,"");
       }

       public void setIslogin(boolean login){
          editor.putBoolean(islogin,login).commit();
       }

       public boolean getIslogin(){
          return sharedPreference.getBoolean(islogin,false);
       }
   }




