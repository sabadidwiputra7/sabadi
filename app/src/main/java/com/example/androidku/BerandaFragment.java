package com.example.androidku;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//20-mei-2019
// Nim 10116314
// nama : Sabadi Dwiputra
// kelas : IF-7
/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {


    public BerandaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beranda, container, false);
    }

}
