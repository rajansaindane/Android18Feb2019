package com.melayer.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listOfTechnologies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOfTechnologies=findViewById(R.id.listOfTechnologies);
        showList();
    }


    void showList()
    {

        String[] technologies={"C",
                "Cpp",
                "Java",
                "Android",
                "HTML",
                "CSS","JS","AngularJs","Hadoop","C",
                "Cpp",
                "Java",
                "Android",
                "HTML",
                "CSS","JS","AngularJs","Hadoop"};

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.single_technology,R.id.textView,technologies);
        listOfTechnologies.setAdapter(adapter);

        listOfTechnologies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });


    }

}
