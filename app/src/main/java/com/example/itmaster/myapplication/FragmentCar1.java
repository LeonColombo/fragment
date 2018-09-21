package com.example.itmaster.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentCar1 extends Fragment {

    private TextView autoNombre, caracteristicas, autoCaracteristicas;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment_car1, container, false); //cambia return x view

        caracteristicas = view.findViewById(R.id.caracteristicasFerrari);

        return view; //pongo return al final

    }


}
