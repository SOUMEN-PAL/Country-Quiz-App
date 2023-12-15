# Country Quiz App

Welcome to the Country Quiz App, a fun and interactive way to test your knowledge of countries around the world!

## Quiz Screen

![Quiz Screen](https://github.com/SOUMEN-PAL/Country-Quiz-App/assets/112452467/baa96f28-e721-4e48-b076-91f098d17937)

The Quiz Screen presents questions as images. Users can select their answers from the provided options using the radio buttons. The interface is designed to be user-friendly and engaging.

### XML Layout (res/layout/activity_quiz.xml)

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <!-- ImageView for displaying the question image -->
    <ImageView
        android:id="@+id/questionImage"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:src="@drawable/default_image" <!-- Set a default image -->
        android:scaleType="centerCrop"
        android:layout_marginTop="16dp"/>

    <!-- RadioGroup for answer options -->
    <RadioGroup
        android:id="@+id/answerOptions"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/questionImage"
        android:layout_marginTop="16dp">

        <!-- Add RadioButtons for answer options -->

    </RadioGroup>

    <!-- Button for submitting the answer -->
    <Button
        android:id="@+id/submitButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/answerOptions"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="16dp"
        android:text="Submit"/>

</RelativeLayout>
Kotlin Code (src/QuizActivity.kt)
kotlin
Copy code
class QuizActivity : AppCompatActivity() {

    private lateinit var questionImage: ImageView
    private lateinit var answerOptions: RadioGroup
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        questionImage = findViewById(R.id.questionImage)
        answerOptions = findViewById(R.id.answerOptions)
        submitButton = findViewById(R.id.submitButton)

        // Load questions and set the default image
        loadQuestion(0)

        submitButton.setOnClickListener {
            // Handle answer submission
            val selectedAnswerId = answerOptions.checkedRadioButtonId
            if (selectedAnswerId != -1) {
                val selectedAnswer = findViewById<RadioButton>(selectedAnswerId).text
                // Check the selected answer and proceed accordingly
            } else {
                // No answer selected, display a message
                Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Add functions for loading questions and other logic
}
Another View
Another View
