package com.example.calender

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        calendarView.setOnDateChangeListener{calendarView,i3,i2,i ->

        Toast.makeText(this,"Date is $i3/$i2/$i",Toast.LENGTH_LONG).show()
        }





    }

}