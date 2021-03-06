package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
  ArrayAdapter<String>  mForecastAdapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);
        String [] forecastArray =
        {
        "Today-sunny- 87/56",
        "tomorrow-rainy-65/55",
        "tuesday-cloudy-78/67",
        "wednesday-muddy-98/89",
        "thursday-greeny-99/98",
        "friday_i need some help-99/88"
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList( forecastArray));
        mForecastAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,forecastArray);
        ListView listView = (ListView)rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);
        return rootView;

        }
        }
