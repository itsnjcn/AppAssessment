package com.example.appassessment

data class Element(val image: Int, val name: String, val color: String)

object Elements {

    private val images = intArrayOf(
        R.drawable.anemo,
        R.drawable.cryo,
        R.drawable.dendro,
        R.drawable.electro,
        R.drawable.geo,
        R.drawable.hydro,
        R.drawable.pyro
    )

    private val elements = arrayOf(
        "Anemo",
        "Cryo",
        "Dendro",
        "Electro",
        "Geo",
        "Hydro",
        "Pyro"
    )

    private val colors = arrayOf(
        "#23C18A",
        "#A0E9E5",
        "#23C18A",
        "#A757CB",
        "#E3B342",
        "#21E1EB",
        "#FE925D",
    )

    var list: ArrayList<Element>? = null
        get() {

            if (field != null) {
                return field
            }

            field = ArrayList()
            for (i in images.indices) {

                val imageId = images [i]
                val countryName = elements[i]
                val color = colors[i]

                val element = Element(imageId, countryName, color)
                field!!.add(element)
            }

            return field
        }
}