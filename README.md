# Country Quiz App

Welcome to the Country Quiz App, a fun and interactive way to test your knowledge of countries around the world!

## Quiz Screen

![Quiz Screen](https://github.com/SOUMEN-PAL/Country-Quiz-App/assets/112452467/baa96f28-e721-4e48-b076-91f098d17937)

![Questions Screen](https://github.com/SOUMEN-PAL/Country-Quiz-App/assets/112452467/5f9d6029-4945-4b9f-bfaf-b65aa7db31d8)


The Quiz Screen presents questions as images. Users can select their answers from the provided options using the radio buttons. The interface is designed to be user-friendly and engaging.

### XML Layout (res/layout/activity_quiz.xml)

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:orientation="vertical"
    tools:context=".MainActivity"
    android:gravity="center"
    android:background="@drawable/ic_bg">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/Appname"
        android:textSize="25sp"
        android:textStyle="bold"
        android:gravity="center"
        android:textColor="@color/white"
        android:layout_marginBottom="30dp"

        />
    <com.google.android.material.card.MaterialCardView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginEnd="20dp"

        android:backgroundTint="@color/white"
        >

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="16dp"
            android:orientation="vertical"
            >
            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="@string/welcome"
                android:textSize="30sp"
                android:textStyle="bold"
                android:gravity="center"
                android:textColor="#363A43"

                />
            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="@string/please_enter_your_name"
                android:textSize="16sp"
                android:layout_marginTop="16dp"
                android:textStyle="bold"
                android:gravity="center"
                android:textColor="#7A8089"

                />

            <com.google.android.material.textfield.TextInputLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                style="@style/Widget.Material3.TextInputLayout.OutlinedBox"
                app:boxStrokeColor="#5F7BE6"
                android:layout_marginTop="20dp"
                >
                <androidx.appcompat.widget.AppCompatEditText
                    android:id="@+id/etName"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:hint="@string/eg_john"
                    android:inputType="textCapWords"
                    android:textColor="#363A43"
                    android:textColorHint="#7A8089"
                    >

                </androidx.appcompat.widget.AppCompatEditText>


            </com.google.android.material.textfield.TextInputLayout>
            <Button
                android:id="@+id/startButton"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:background="@drawable/round"
                app:backgroundTint="@color/topBlue"
                android:text="@string/Start"
                android:textColor="@color/white"
                android:textSize="18sp"
                />



        </LinearLayout>



    </com.google.android.material.card.MaterialCardView>


  </LinearLayout>

