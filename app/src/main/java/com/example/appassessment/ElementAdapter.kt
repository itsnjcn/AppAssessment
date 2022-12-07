package com.example.appassessment

import android.widget.ArrayAdapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.spinner_item.view.*

class ElementAdapter(context: Context, elementList: List<Element>) : ArrayAdapter<Element>(context, 0, elementList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    private fun initView(position: Int, convertView: View?, parent: ViewGroup): View {

        val element = getItem(position)

        val view = LayoutInflater.from(context).inflate(R.layout.spinner_item, parent, false)

        view.elementImage.setImageResource(element!!.image)
        view.elementName.text = element.name
        view.elementName.setTextColor(android.graphics.Color.parseColor(element.color))

        return view
    }
}