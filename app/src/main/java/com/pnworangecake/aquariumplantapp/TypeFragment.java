package com.pnworangecake.aquariumplantapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TypeFragment extends Fragment {
    private TypeCallbacks mCallbacks;

    @Override
    public View onCreateView(
        LayoutInflater inflater,
        ViewGroup container,
        Bundle savedInstanceState
    ) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_type, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;
        try {
            mCallbacks = (TypeCallbacks) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity + " must implement DeckCallbacks");
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.rhizome_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbacks.onRhizomeClick();
            }
        });
        view.findViewById(R.id.stem_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbacks.onStemClick();
            }
        });
        view.findViewById(R.id.floating_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbacks.onFloatingClick();
            }
        });
        view.findViewById(R.id.crown_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbacks.onCrownClick();
            }
        });
        view.findViewById(R.id.moss_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbacks.onMossClick();
            }
        });
        view.findViewById(R.id.miscellaneous_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbacks.onMiscellaneousClick();
            }
        });
    }

    interface TypeCallbacks {
        void onRhizomeClick();
        void onStemClick();
        void onFloatingClick();
        void onCrownClick();
        void onMossClick();
        void onMiscellaneousClick();
    }
}
