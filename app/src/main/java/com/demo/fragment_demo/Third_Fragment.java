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
public class Third_Fragment extends Fragment implements IOnBackPressed {

    private Button btn_thirdFragment;

    private View view;


    public Third_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_third_, container, false);

        btn_thirdFragment = (Button) view.findViewById(R.id.btn_thirdFragment);

        btn_thirdFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fourth_fragment fourth_fragment = new fourth_fragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.framelayout,fourth_fragment);
                transaction.addToBackStack("addC");
                transaction.commit();
            }
        });

        return view;
    }

    @Override
    public void onClick() {

    }
}
