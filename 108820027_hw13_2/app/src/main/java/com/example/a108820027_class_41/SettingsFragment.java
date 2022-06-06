package com.example.a108820027_class_41;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;




public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        setPreferencesFromResource(R.xml.preferences, s);
    }
}