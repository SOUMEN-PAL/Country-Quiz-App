package com.example.quizapp

object constance {
    fun getquestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country thus this flag belongs to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina" , "Australia" ,
            "Armenia" , "Austria",
            1
        )
        questionList.add(que1)
        val que2 = Question(
            1, "What country thus this flag belongs to?",
            R.drawable.ic_flag_of_australia,
            "Brazil" , "Australia" ,
            "Armenia" , "India",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            1, "What country thus this flag belongs to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina" , "Australia" ,
            "Armenia" , "Belgium",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            1, "What country thus this flag belongs to?",
            R.drawable.ic_flag_of_brazil,
            "Singapore" , "India" ,
            "Brazil" , "Belgium",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            1, "What country thus this flag belongs to?",
            R.drawable.ic_flag_of_denmark,
            "China" , "Denmark" ,
            "Kuwait" , "Belgium",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            1, "What country thus this flag belongs to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji" , "India" ,
            "Brazil" , "Belgium",
            1
        )
        questionList.add(que6)

        val que7 = Question(
            1, "What country thus this flag belongs to?",
            R.drawable.ic_flag_of_germany,
            "Singapore" , "India" ,
            "Germany" , "Belgium",
            3
        )
        questionList.add(que7)

        val que8 = Question(
            1, "What country thus this flag belongs to?",
            R.drawable.ic_flag_of_india,
            "Argentina" , "Australia" ,
            "Armenia" , "India",
            4
        )
        questionList.add(que8)

        val que9 = Question(
            1, "What country thus this flag belongs to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait" , "Australia" ,
            "Armenia" , "None of these",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            1, "What country thus this flag belongs to?",
            R.drawable.ic_flag_of_new_zealand,
            "Singapore" , "Jordan" ,
            "New Zealand" , "Belgium",
            3
        )
        questionList.add(que10)




        return questionList
    }

}