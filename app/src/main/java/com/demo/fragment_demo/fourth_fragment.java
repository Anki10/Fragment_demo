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
public class fourth_fragment extends Fragment implements IOnBackPressed {

    private Button btn_fourFragment;

    private View view;

    FragmentManager fragmentManager;


    public fourth_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_fourth_fragment, container, false);

        btn_fourFragment = (Button) view.findViewById(R.id.btn_fourFragment);

        fragmentManager = getFragmentManager();

        btn_fourFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fivth_fragment fivth_fragment = new fivth_fragment();

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.framelayout,fivth_fragment);
                transaction.addToBackStack("addD");
                transaction.commit();


            }
        });

        return view;
    }


    @Override
    public void onClick() {
        fragmentManager.popBackStack("addA",FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
}
