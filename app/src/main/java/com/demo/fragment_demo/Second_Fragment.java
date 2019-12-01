package com.demo.fragment_demo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Second_Fragment extends Fragment implements IOnBackPressed{

    private Button btn_SecondFragment;

    private View view;

    FragmentManager fragmentManager;

    public Second_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_second_, container, false);

        btn_SecondFragment = (Button) view.findViewById(R.id.btn_SecondFragment);

        btn_SecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Third_Fragment fragment = new Third_Fragment();
                fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.framelayout,fragment);
                transaction.addToBackStack("addB");
                transaction.commit();
            }
        });

        return view;
    }

    @Override
    public void onClick() {
        fragmentManager.popBackStack();
    }
}
