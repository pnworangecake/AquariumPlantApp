package com.pnworangecake.aquariumplantapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlacementFragment extends Fragment {
    private PlacementCallbacks mCallbacks;

    @Override
    public View onCreateView(
        LayoutInflater inflater,
        ViewGroup container,
        Bundle savedInstanceState
    ) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;
        try {
            mCallbacks = (PlacementCallbacks) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity + " must implement DeckCallbacks");
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.name_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbacks.onForegroundClick();
            }
        });
        view.findViewById(R.id.type_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbacks.onMidgroundClick();
            }
        });
        view.findViewById(R.id.placement_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbacks.onBackgroundClick();
            }
        });
        view.findViewById(R.id.random_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallbacks.onSurfaceClick();
            }
        });
    }

    interface PlacementCallbacks {
        void onForegroundClick();
        void onMidgroundClick();
        void onBackgroundClick();
        void onSurfaceClick();
    }
}
