package com.pnworangecake.aquariumplantapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * This class is meant to display a list of selectable items to the user. This list is passed in
 * as a fragment's arguments. Once a plant is selected, the callbacks will return information
 * about the plant to the activity and it is decided how the activity will display the information.
 */
public class ListFragment extends Fragment {
    @Override
    public View onCreateView(
        LayoutInflater inflater,
        ViewGroup container,
        Bundle savedInstanceState
    ) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // From fragment's arguments, retrieve the list of plants to display onto the list view for
        // this fragment.
    }
}
