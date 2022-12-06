package com.example.appassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupCustomSpinner()

        var b1=findViewById(R.id.button) as Button

        override fun onNothingSelected(parent: AdapterView<*>?) {
        }
        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
        {
            if(spinner.selectedItemPosition==0) 
            {
                textView.setText(" " + spinner.selectedItem)
            }
        }
    }

    private fun setupCustomSpinner() {
        val adapter = ElementAdapter(this, Elements.list!!)
        spinner.adapter = adapter
        spinner2.adapter = adapter
    }


}