package com.avashshrestha14.restaurantmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AppetizerFragment extends Fragment{
    private RadioGroup radioGroup;
    private RadioButton radioButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_appetizer, container, false);

        radioGroup = (RadioGroup) myView.findViewById(R.id.radioGroup);
        int selectedID = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) myView.findViewById(selectedID);

        return myView;
    }
}
