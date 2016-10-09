package com.pnworangecake.aquariumplantapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NameFragment extends Fragment {
    private NameCallbacks mCallbacks;

    @Override
    public View onCreateView(
        LayoutInflater inflater,
        ViewGroup container,
        Bundle savedInstanceState
    ) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_name, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;
        try {
            mCallbacks = (NameCallbacks) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity + " must implement DeckCallbacks");
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.common_name_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbacks.onCommonNameClick();
            }
        });
        view.findViewById(R.id.scientific_name_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbacks.onScientificNameClick();
            }
        });
    }

    interface NameCallbacks {
        void onCommonNameClick();
        void onScientificNameClick();
    }
}
