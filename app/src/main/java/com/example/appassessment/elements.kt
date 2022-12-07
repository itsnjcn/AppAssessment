package com.example.appassessment

data class Element(val image: Int, val name: String, val color: String)

object Elements {

    private val images = intArrayOf(
        R.drawable.pyro,
        R.drawable.hydro,
        R.drawable.anemo,
        R.drawable.electro,
        R.drawable.dendro,
        R.drawable.cryo,
        R.drawable.geo,
    )

    private val elements = arrayOf(
        "Pyro",
        "Hydro",
        "Anemo",
        "Electro",
        "Dendro",
        "Cryo",
        "Geo",
    )

    private val colors = arrayOf(
        "#FE925D",
        "#21E1EB",
        "#72E2C3",
        "#A757CB",
        "#23C18A",
        "#A0E9E5",
        "#E3B342",
    )

    var list: ArrayList<Element>? = null
        get() {

            if (field != null) {
                return field
            }

            field = ArrayList()
            for (i in images.indices) {

                val imageId = images [i]
                val elementName = elements[i]
                val colorId = colors[i]

                val element = Element(imageId, elementName, colorId)
                field!!.add(element)
            }

            return field
        }
}