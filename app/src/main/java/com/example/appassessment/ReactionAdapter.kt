package com.example.appassessment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.popup_window.view.*

class ReactionAdapter(context: Context, reactionList: List<Reaction>) : ArrayAdapter<Reaction>(context, 0, reactionList) {
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            return initView(position, parent)
        }

        private fun initView(position: Int, parent: ViewGroup): View {

            val reaction = getItem(position)

            val view = LayoutInflater.from(context).inflate(R.layout.popup_window, parent, false)

            view.title_reaction.text = reaction!!.title
            view.text_description.text = reaction.desc
            view.gif_reaction.setImageResource(reaction.gif)

            return view
        }
}