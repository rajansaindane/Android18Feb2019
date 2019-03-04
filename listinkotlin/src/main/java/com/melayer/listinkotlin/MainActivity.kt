package com.melayer.listinkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showList()
    }

    private fun showList() {

        val technologies = arrayOf("C", "Cpp", "Java", "Android", "HTML", "CSS", "JS", "AngularJs", "Hadoop", "C", "Cpp", "Java", "Android", "HTML", "CSS", "JS", "AngularJs", "Hadoop")
        val adapter = ArrayAdapter(this, R.layout.single_technology, R.id.textView, technologies)
        listOfTechnologies.adapter=adapter

        listOfTechnologies.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            // Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_SHORT).show();
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
        }
    }

}
