package com.example.appassessment

data class Reaction(val title: String, val desc: String, val gif: Int)

object Reactions {


    private val titles = arrayOf( // array of images
        "Vaporize", // 0
        "Overload", // 1
        "Electro-Charged", // 2
        "Melt", // 3
        "Frozen", // 4
        "Superconduct", // 5
        "Burning", // 6
        "Bloom", // 7
        "Quicken", // 8
        "Swirl", // 9
        "Crystallize", // 10
        "None??", // 11
    )

    private val descs = arrayOf( // array of elements
        "This reaction increases the damage of the Hydro or Pyro attack that triggers the reaction." +
                "If the reaction is triggered by a Pyro attack, the damage is multiplied by 1.5; If " +
                "the reaction is triggered by a Hydro attack, the damage is multiplied by 2.",
        "Overloaded is the Elemental Reaction triggered by inflicting Electro on a target that is already" +
                " affected by Pyro or vice versa. This reaction causes an explosion that deals AoE Pyro DMG in a 5m radius. The explosion causes significant knockback.",
        "Electro-Charged is the Elemental Reaction triggered by inflicting Electro on a target that is " +
                "already affected by Hydro or vice versa. This reaction deals Electro DMG over time to " +
                "both the Electro-Charged target and any nearby targets that are Wet.",
        "Melt is the Elemental Reaction triggered by inflicting Pyro on a target that is already affected " +
                "by Cryo or vice versa. This reaction increases the damage of the Pyro or Cryo attack " +
                "that triggers the reaction. If the reaction is triggered by a Cryo attack, the damage " +
                "is multiplied by 1.5; If the reaction is triggered by a Pyro attack, the damage is " +
                "multiplied by 2.",
        "Frozen is the Elemental Reaction triggered by inflicting Cryo on a target that is already affected" +
                " by Hydro or vice versa. Frozen by itself deals no damage. Instead, this reaction " +
                "immobilizes enemies and applies a Frozen status for a certain period of time.",
        "Superconduct is the Elemental Reaction triggered by inflicting Electro on a target that is " +
                "already affected by Cryo or vice versa. This reaction deals AoE Cryo DMG in a 5m radius" +
                " and reduces the Physical RES of all enemies in the AoE by 40% for 12 seconds.",
        "Burning is the Elemental Reaction triggered by inflicting Pyro on a target that is already " +
                "affected by Dendro or vice versa. This reaction deals AoE Pyro DMG and applies 1 gauge" +
                " unit of Pyro in a 1m radius to both players and enemies.",
        "Bloom is the Elemental Reaction triggered by inflicting Dendro on a target that is already " +
                "affected by Hydro or vice versa. This reaction produces a Dendro Core, which stays " +
                "on the field for up to 6 seconds, and has different effects based on if Pyro, Electro" +
                " or neither is applied to it before its duration expires.",
        "Quicken is triggered by inflicting Dendro on a target that is already affected by Electro or" +
                " vice-versa. This reaction deals no DMG, but applies a Quicken Aura to the target " +
                "affected that decays over time.",
        "Swirl is the Elemental Reaction triggered by inflicting Anemo on a target that is already " +
                "affected by Pyro/Electro/Hydro/Cryo or vice versa. This reaction deals Elemental DMG" +
                " of the non-Anemo element involved and applies said element to targets within a 6m " +
                "radius.",
        "Crystallize deals no DMG. Instead, this reaction generates a matching Pyro, Electro, Hydro, " +
                "or Cryo Elemental Shard that can be picked up to gain an elemental shield of the " +
                "corresponding element.",
        "Seems like there is no reaction with these combination of elements. Please try again with a different element.",
    )

    private val gifs = intArrayOf( // array of colors
        R.drawable.vaporize,
        R.drawable.overload,
        R.drawable.electro_charged,
        R.drawable.melt,
        R.drawable.frozen,
        R.drawable.superconduct,
        R.drawable.burning,
        R.drawable.bloom,
        R.drawable.quickened,
        R.drawable.swirl,
        R.drawable.crystallize,
        R.drawable.paimon,
    )

    var list: ArrayList<Reaction>? = null // creating a list of elements
        get() {

            if (field != null) { // if the list is not empty
                return field
            }

            field = ArrayList() // if the list is empty, create a new list
            for (i in gifs.indices) { // for loop to add the elements to the list

                val title = titles [i]
                val description = descs[i]
                val gifId = gifs[i]

                val reaction = Reaction(title, description, gifId)
                field!!.add(reaction)
            }

            return field
        }


}