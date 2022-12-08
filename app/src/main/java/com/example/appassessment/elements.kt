package com.example.appassessment

data class Element(val image: Int, val name: String, val color: String)

object Elements {

    private val images = intArrayOf( // array of images
        R.drawable.empty,
        R.drawable.pyro,
        R.drawable.hydro,
        R.drawable.anemo,
        R.drawable.electro,
        R.drawable.dendro,
        R.drawable.cryo,
        R.drawable.geo,
    )

    private val elements = arrayOf( // array of elements
        "Select Element", // 0
        "Pyro", // 1
        "Hydro", // 2
        "Anemo", // 3
        "Electro", // 4
        "Dendro", // 5
        "Cryo", // 6
        "Geo", // 7
    )

    private val colors = arrayOf( // array of colors
        "#FCE38A",
        "#FE925D",
        "#21E1EB",
        "#72E2C3",
        "#A757CB",
        "#23C18A",
        "#A0E9E5",
        "#E3B342",
    )

    var list: ArrayList<Element>? = null // creating a list of elements
        get() {

            if (field != null) { // if the list is not empty
                return field
            }

            field = ArrayList() // if the list is empty, create a new list
            for (i in images.indices) { // for loop to add the elements to the list

                val imageId = images [i]
                val elementName = elements[i]
                val colorId = colors[i]

                val element = Element(imageId, elementName, colorId)
                field!!.add(element)
            }

            return field
        }
}