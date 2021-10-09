package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Задаем кнопкам имена для дальнейшего использования
        val textView = findViewById(R.id.textView) as TextView
        val updateButton = findViewById(R.id.UpdateButton) as Button
        val runButton = findViewById(R.id.RunButton) as Button

        //Создаем переменную содержащую функцию IntCounter
        val ICount = IntCounter()
        textView.setText(ICount.numbers.joinToString ())

        updateButton.setOnClickListener {
            ICount.updateNumbers()
            val numbers = ICount.numbers
            textView.setText(numbers.joinToString())
        }

        runButton.setOnClickListener {
            val number: Int = ICount.IntCountOut()
            textView.setText("${ICount.numbers.joinToString()} \n" +
                    "Кол-во отличающихся от среднего на 5: ${number.toString()} \n" +
                    "Среднее значение: ${ICount.med.toString()}")
        }
    }
}