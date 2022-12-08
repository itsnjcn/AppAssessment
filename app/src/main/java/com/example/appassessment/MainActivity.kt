package com.example.appassessment

import android.annotation.SuppressLint
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.popup_window.view.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("InflateParams", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 = findViewById<Button>(R.id.button) // creating a variable name b1 for button

        //setting the 1st spinner
        val adapter = ElementAdapter(this, Elements.list!!)
        spinner.adapter = adapter

        //setting the 2nd spinner
        val adapter2 = ElementAdapter(this, Elements.list!!)
        spinner2.adapter = adapter2

        //setting the results
        val adapter3 = ReactionAdapter(this, Reactions.list!!)

        // setting the action for the button
        b1.setOnClickListener {
            val popup = layoutInflater.inflate(R.layout.popup_window, null)

            val popupWindow = Dialog(this)
            popupWindow.setContentView(popup)

            popupWindow.window?.setBackgroundDrawableResource(android.R.color.transparent)
            popupWindow.show()

            val closebtn = popup.findViewById<Button>(R.id.goBack)
            closebtn.setOnClickListener {
                popupWindow.dismiss()
            }

            // getting the selected items from the spinners
            val sp1 = spinner.selectedItemPosition
            val sp2 = spinner2.selectedItemPosition

            if (sp1==1 && sp2==2 || sp1==2 && sp2==1) // Vaporize
            {

                textView2.text = "Vaporize"
                popup.title_reaction.text = adapter3.getItem(0)!!.title
                popup.text_description.text = adapter3.getItem(0)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(0)!!.gif)
            }
            else if (sp1==1 && sp2==4 || sp1==4 && sp2==1) // Overloaded
            {
                textView2.text = "Overloaded"
                popup.title_reaction.text = adapter3.getItem(1)!!.title
                popup.text_description.text = adapter3.getItem(1)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(1)!!.gif)
            }
            else if (sp1==1 && sp2==5 || sp1==5 && sp2==1) // Burning
            {
                textView2.text = "Burning"
                popup.title_reaction.text = adapter3.getItem(6)!!.title
                popup.text_description.text = adapter3.getItem(6)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(6)!!.gif)
            }
            else if (sp1==1 && sp2==6 || sp1==6 && sp2==1) // Melt
            {
                textView2.text = "Melt"
                popup.title_reaction.text = adapter3.getItem(3)!!.title
                popup.text_description.text = adapter3.getItem(3)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(3)!!.gif)
            }
            else if (sp1==2 && sp2==4 || sp1==4 && sp2==2) // Electro-Charged
            {
                textView2.text = "Electro-Charged"
                popup.title_reaction.text = adapter3.getItem(2)!!.title
                popup.text_description.text = adapter3.getItem(2)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(2)!!.gif)
            }
            else if (sp1==2 && sp2==5 || sp1==5 && sp2==2) // Bloom
            {
                textView2.text = "Bloom"
                popup.title_reaction.text = adapter3.getItem(7)!!.title
                popup.text_description.text = adapter3.getItem(7)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(7)!!.gif)
            }
            else if (sp1==2 && sp2==6 || sp1==6 && sp2==2) // Frozen
            {
                textView2.text = "Frozen"
                popup.title_reaction.text = adapter3.getItem(4)!!.title
                popup.text_description.text = adapter3.getItem(4)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(4)!!.gif)
            }
            else if (sp1==4 && sp2==5 || sp1==5 && sp2==4) // Catalyze
            {
                textView2.text = "Catalyze/Quicken"
                popup.title_reaction.text = adapter3.getItem(8)!!.title
                popup.text_description.text = adapter3.getItem(8)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(8)!!.gif)
            }
            else if (sp1==4 && sp2==6 || sp1==6 && sp2==4) // Superconduct
            {
                textView2.text = "Superconduct"
                popup.title_reaction.text = adapter3.getItem(5)!!.title
                popup.text_description.text = adapter3.getItem(5)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(5)!!.gif)

            }
            else if (sp1==1 && sp2==3 || sp1==3 && sp2==1
                ||   sp1==2 && sp2==3 || sp1==3 && sp2==2
                ||   sp1==3 && sp2==3
                ||   sp1==4 && sp2==3 || sp1==3 && sp2==4
                ||   sp1==6 && sp2==3 || sp1==3 && sp2==6) // Swirl
            {
                textView2.text = "Swirl"
                popup.title_reaction.text = adapter3.getItem(9)!!.title
                popup.text_description.text = adapter3.getItem(9)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(9)!!.gif)
            }
            else if (sp1==1 && sp2==7 || sp1==7 && sp2==1
                ||   sp1==2 && sp2==7 || sp1==7 && sp2==2
                ||   sp1==7 && sp2==7
                ||   sp1==4 && sp2==7 || sp1==7 && sp2==4
                ||   sp1==6 && sp2==7 || sp1==7 && sp2==6) // Crystallize
            {
                textView2.text = "Crystallize"
                popup.title_reaction.text = adapter3.getItem(10)!!.title
                popup.text_description.text = adapter3.getItem(10)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(10)!!.gif)
            }
            else if (sp1==1 && sp2==0 || sp1==0 && sp2==1
                ||   sp1==2 && sp2==0 || sp1==0 && sp2==2
                ||   sp1==0 && sp2==0
                ||   sp1==4 && sp2==0 || sp1==0 && sp2==4
                ||   sp1==6 && sp2==0 || sp1==0 && sp2==6) // None
            {
                textView2.text = "No Reaction"
                popup.title_reaction.text = adapter3.getItem(11)!!.title
                popup.text_description.text = adapter3.getItem(11)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(11)!!.gif)
            }
            else
            {
                textView2.text = "No Reaction"
                popup.title_reaction.text = adapter3.getItem(11)!!.title
                popup.text_description.text = adapter3.getItem(11)!!.desc
                popup.gif_reaction.setImageResource(adapter3.getItem(11)!!.gif)
            }
        }
    }
}