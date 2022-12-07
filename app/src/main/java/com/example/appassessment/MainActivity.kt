package com.example.appassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var b1 = findViewById<Button>(R.id.button) // creating a variable name b1 for button

        //setting the 1st spinner
        val adapter = ElementAdapter(this, Elements.list!!)
        spinner.adapter = adapter

        //setting the 2nd spinner
        val adapter2 = ElementAdapter(this, Elements.list!!)
        spinner2.adapter = adapter2

        // setting the action for the button
        b1.setOnClickListener {
            if(((spinner.selectedItemPosition == 0) && (spinner2.selectedItemPosition == 1)) || ((spinner.selectedItemPosition == 1) && (spinner2.selectedItemPosition == 0))) // Vaporize
            {
                textView2.text = "Vaporize"
            }
            else if (spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==3 || spinner.selectedItemPosition==3 && spinner2.selectedItemPosition==0) // Overloaded
            {
                textView2.text = "Overloaded"
            }
            else if (spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==4 || spinner.selectedItemPosition==4 && spinner2.selectedItemPosition==0) // Burning
            {
                textView2.text = "Burning"
            }
            else if (spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==5 || spinner.selectedItemPosition==5 && spinner2.selectedItemPosition==0) // Melt
            {
                textView2.text = "Melt"
            }
            else if (spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==3 || spinner.selectedItemPosition==3 && spinner2.selectedItemPosition==1) // Electro-Charged
            {
                textView2.text = "Electro-Charged"
            }
            else if (spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==4 || spinner.selectedItemPosition==4 && spinner2.selectedItemPosition==1) // Bloom
            {
                textView2.text = "Bloom"
            }
            else if (spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==5 || spinner.selectedItemPosition==5 && spinner2.selectedItemPosition==1) // Frozen
            {
                textView2.text = "Frozen"
            }
            else if (spinner.selectedItemPosition==3 && spinner2.selectedItemPosition==4 || spinner.selectedItemPosition==4 && spinner2.selectedItemPosition==3) // Catalyze
            {
                textView2.text = "Catalyze"
            }
            else if (spinner.selectedItemPosition==3 && spinner2.selectedItemPosition==5 || spinner.selectedItemPosition==5 && spinner2.selectedItemPosition==3) // Superconduct
            {
                textView2.text = "Superconduct"
            }
            else if (spinner.selectedItemPosition==2 || spinner2.selectedItemPosition==2) // Swirl
            {
                textView2.text = "Swirl"
            }
            else if (spinner.selectedItemPosition==6 || spinner2.selectedItemPosition==6) // Crystallize
            {
                textView2.text = "Crystallize"
            }
            else
            {
                textView2.text = "No Reaction"
            }
        }
    }


}