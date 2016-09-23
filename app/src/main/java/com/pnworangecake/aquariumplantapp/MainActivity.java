package com.pnworangecake.aquariumplantapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
    implements MainFragment.MainCallbacks,
    NameFragment.NameCallbacks,
    TypeFragment.TypeCallbacks,
    PlacementFragment.PlacementCallbacks {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceFragment(new MainFragment());
    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(
            R.id.fragment_container,
            fragment
        ).addToBackStack("").commit();
    }

    @Override
    public void onNameClick() {
        replaceFragment(new NameFragment());
    }

    @Override
    public void onTypeClick() {
        replaceFragment(new TypeFragment());
    }

    @Override
    public void onPlacementClick() {
        replaceFragment(new PlacementFragment());
    }

    @Override
    public void onRandomClick() {
    }

    @Override
    public void onCommonNameClick() {
        replaceFragment(new ListFragment());
    }

    @Override
    public void onScientificNameClick() {
        replaceFragment(new ListFragment());
    }

    @Override
    public void onRhizomeClick() {
        replaceFragment(new ListFragment());
    }

    @Override
    public void onStemClick() {
        replaceFragment(new ListFragment());
    }

    @Override
    public void onFloatingClick() {
        replaceFragment(new ListFragment());
    }

    @Override
    public void onCrownClick() {
        replaceFragment(new ListFragment());
    }

    @Override
    public void onMossClick() {
        replaceFragment(new ListFragment());
    }

    @Override
    public void onMiscellaneousClick() {
        replaceFragment(new ListFragment());
    }

    @Override
    public void onForegroundClick() {
        replaceFragment(new ListFragment());
    }

    @Override
    public void onMidgroundClick() {
        replaceFragment(new ListFragment());
    }

    @Override
    public void onBackgroundClick() {
        replaceFragment(new ListFragment());
    }

    @Override
    public void onSurfaceClick() {
        replaceFragment(new ListFragment());
    }
}
