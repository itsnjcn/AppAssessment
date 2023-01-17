package com.example.appassessment

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "Which does not reduce the HP of the Electro Hypostasis' Prisms",

           "Pyro",
           "Hydro",
           "Cryo",
           "Geo",
           2
       )
       var question2 = QuestionData(
           2,
           "Which of the following elements is the most efficient at breaking a Hydro Abyss Mage's shield?",

           "Pyro",
           "Hydro",
           "Cryo",
           "Dendro",
           3
       )
       var question3 = QuestionData(
           3,
           "When the Golden Wolflord has summoned three Rifthound Skulls to perform a coordinated attack, what elemental attack can be used to quickly defeat them?",

           "Pyro",
           "Hydro",
           "Cryo",
           "Geo",
           4
       )
       var question4 = QuestionData(
           4,
           "What reaction will occur when a pyro elemental attack is used against Anemo Hypostasis: Beth?",

           "Hydro",
           "Geo",
           "Swirl",
           "Aggregate",
           3
       )

       var question5 = QuestionData(
           5,
           "Which of the following elemental reaction damage is the Thunder Manifestation immunte to?",

           "Electro-Charged",
           "Crystallize",
           "Vaporize",
           "Frozen",
           4
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}