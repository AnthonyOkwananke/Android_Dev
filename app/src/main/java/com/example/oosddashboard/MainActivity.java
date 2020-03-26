package com.example.oosddashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*ListView lvCourseInformation;
    private Object android;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*lvCourseInformation = (ListView)findViewById(R.id.lvCourseInformation);

        //make an array list
        ArrayList<String> arrayList = new ArrayList<>();

        // add information to the array list
        arrayList.add("CMPP2644");
        arrayList.add("Java Programming");
        arrayList.add("16 March, 2020");
        arrayList.add("30 days");

        //make an array adapter
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.android.R.layout.course_Information_List_Item_1.arrayList);

        ListView.setAdapter(arrayAdapter);*/
    }

}
