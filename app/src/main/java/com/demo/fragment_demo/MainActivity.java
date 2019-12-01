package com.demo.fragment_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        First_Fragment fragment = new First_Fragment();
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.framelayout,fragment);
        transaction.commit();

    }

    @Override
    public void onBackPressed() {
        int count = getSupportFragmentManager().getBackStackEntryCount();
        List<Fragment> frags = getSupportFragmentManager().getFragments();
        Fragment lastFrag = getLastNotNull(frags);
        //nothing else in back stack || nothing in back stack is instance of our interface
        if (count == 0 || !(lastFrag instanceof IOnBackPressed)) {
            super.onBackPressed();
        } else {
            ((IOnBackPressed) lastFrag).onClick();
        }


    }

    private Fragment getLastNotNull(List<Fragment> list){
        for (int i= list.size()-1;i>=0;i--){
            Fragment frag = list.get(i);
            if (frag != null){
                return frag;
            }
        }
        return null;
    }
}
