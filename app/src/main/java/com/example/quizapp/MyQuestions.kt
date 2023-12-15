package com.example.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MyQuestions : AppCompatActivity() , OnClickListener{

    private var mCurrentPosition: Int = 1
    private  var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0

    private  var progessBar : ProgressBar? = null
    private var tvProgess : TextView? = null
    private var tvQuestion : TextView? = null
    private var ivImage : ImageView? = null

    private var tvOptionOne : TextView? = null
    private var tvOptionTwo : TextView? = null
    private var tvOptionThree : TextView? = null
    private var tvOptionFour : TextView? = null
    private var btnSubmit : Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_questions)
        // Getting the id of the views //
        progessBar = findViewById(R.id.progessbar)
        tvProgess = findViewById(R.id.tvprogess)
        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.iv_image)

        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)
        mQuestionList = constance.getquestions()
        btnSubmit = findViewById(R.id.btn_submit)


        // making the text views clickable //
        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)

        btnSubmit?.setOnClickListener(this)

        setQuestion()


    }

    private fun setQuestion() {
        defaultOptionView()
        val question : Question = mQuestionList!![mCurrentPosition - 1]
        ivImage?.setImageResource(question.image)
        progessBar?.progress = mCurrentPosition
        tvProgess?.text = "$mCurrentPosition/${progessBar?.max}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.op1
        tvOptionTwo?.text = question.op2
        tvOptionThree?.text = question.op3
        tvOptionFour?.text = question.op4



        if(mCurrentPosition == mQuestionList!!.size){
            val fin = "FINISH"
            btnSubmit?.text = fin
        }else{
            val sub = "SUBMIT"
            btnSubmit?.text = sub
        }

    }

    private fun defaultOptionView()
    {
        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0 , it)
        }
        tvOptionTwo?.let {
            options.add(1 , it)
        }
        tvOptionThree?.let {
            options.add(2 , it)
        }
        tvOptionFour?.let {
            options.add(3 , it)
        }

        for(option in options)
        {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this ,
                R.drawable.dafault_button_bg)
        }
    }


    private fun selectedOptionView(tv: TextView , selectedOptionNum : Int)
    {
        defaultOptionView() // Phele sab ko default banao //
        mSelectedOptionPosition = selectedOptionNum

        /// Then selected option ko ke text view ko change karo //

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface , Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this ,
            R.drawable.selected_option_border_bg)
    }



    /*

    can also be done like this we are having a lot of listners
 private fun setOnClickListeners() {
    tvOptionOne?.setOnClickListener { handleOptionClick(1) }
    tvOptionTwo?.setOnClickListener { handleOptionClick(2) }
    tvOptionThree?.setOnClickListener { handleOptionClick(3) }
    tvOptionFour?.setOnClickListener { handleOptionClick(4 }
    btnSubmit?.setOnClickListener { handleSubmitClick() }
}

private fun handleOptionClick(selectedOption: Int) {
    when (selectedOption) {
        1 -> selectedOptionView(tvOptionOne, 1)
        2 -> selectedOptionView(tvOptionTwo, 2)
        3 -> selectedOptionView(tvOptionThree, 3)
        4 -> selectedOptionView(tvOptionFour, 4)
    }
}

private fun handleSumbitClick() {
    // TODO: Implement the logic for handling the Submit button click
}



     */
    override fun onClick(view: View?) {

        // Common onCLick function for all the setOnClick Listner
        //And on click is having the view means the context of the view actiity
        // Ans we are using the view?.id for checking which tv or button is clicked on
        // which we called the setOnCLickListner
        when(view?.id){
            R.id.tv_option_one ->{
                tvOptionOne?.let {
                    selectedOptionView(it , 1)
                }
            }

            R.id.tv_option_two ->{
                tvOptionTwo?.let {
                    selectedOptionView(it , 2)
                }
            }

            R.id.tv_option_three -> {
                tvOptionThree?.let {
                    selectedOptionView(it, 3)
                }
            }
            R.id.tv_option_four -> {
                tvOptionFour?.let {
                    selectedOptionView(it , 4)
                }
            }
// the teacher wanna make the same  submit button and the next button same thats why he used
            // a check at mSelectedOptionPosition == 0 so that when he press submit it hast to pressed
            // again to go to the next question.
            R.id.btn_submit -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++
                    when{
                        mCurrentPosition <= mQuestionList!!.size ->{
                            setQuestion()
                        }
                        else ->{
                            Toast.makeText(this , "You have successfully completed the quiz" , Toast.LENGTH_LONG).show()
                        }
                    }

                }
                else{
                    val question = mQuestionList?.get(mCurrentPosition - 1)
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition , R.drawable.wrong_option_border)
                    }
                    answerView(question.correctAnswer , R.drawable.correct_option_border)
                    if(mCurrentPosition == mQuestionList!!.size) {
                        val fin = "FINISH"
                        btnSubmit?.text = fin
                    }else{
                        val sub = "GO TO NEXT QUESTION"
                        btnSubmit?.text = sub
                    }

                    mSelectedOptionPosition = 0
                }
            }



        }
    }
    private fun answerView(answer:Int , drawableView:Int){
        when(answer) {
            1 -> {
                tvOptionOne?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            2 -> {
                tvOptionTwo?.background = ContextCompat.getDrawable(this ,
                    drawableView)
            }

            3 -> {
                tvOptionThree?.background = ContextCompat.getDrawable(this ,
                    drawableView)
            }
            4 -> {
                tvOptionFour?.background = ContextCompat.getDrawable(this ,
                    drawableView)
            }

        }
    }

}