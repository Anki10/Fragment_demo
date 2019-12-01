package com.demo.fragment_demo;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class First_Fragment extends Fragment implements IOnBackPressed{

    private Button btn_firstFragment;

    private View view;


    public First_Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.d("fragment1","onAttach");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("fragment1","onCreate");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Log.d("fragment1","onCreateView");
        view =  inflater.inflate(R.layout.fragment_first_, container, false);

        btn_firstFragment = (Button) view.findViewById(R.id.btn_firstFragment);

        btn_firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Second_Fragment fragment = new Second_Fragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.framelayout,fragment);
                transaction.addToBackStack("addA");
                transaction.commit();


            }
        });
        return view;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.d("fragment1","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.d("fragment1","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.d("fragment1","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.d("fragment1","onPause");

    }

    @Override
    public void onStop() {
        super.onStop();

        Log.d("fragment1","onStop");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Log.d("fragment1","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d("fragment1","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Log.d("fragment1","onDetach");

    }


    @Override
    public void onClick() {
        System.out.println("xxxx");
    }
}
