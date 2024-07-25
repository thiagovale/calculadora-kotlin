package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculadora.ui.theme.CalculadoraTheme

class MainActivity : ComponentActivity() {
    lateinit var buttonAdd:Button;
    lateinit var buttonSub:Button;
    lateinit var buttonMul:Button;
    lateinit var buttonDiv:Button;
    lateinit var editText1: EditText;
    lateinit var editText2: EditText;
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd = findViewById(R.id.btn_add)
        buttonSub = findViewById(R.id.btn_sub)
        buttonMul = findViewById(R.id.btn_mul)
        buttonDiv = findViewById(R.id.btn_div)
        editText1 = findViewById(R.id.num1)
        editText2 = findViewById(R.id.num2)
        textView = findViewById(R.id.answer)

        buttonAdd.setOnClickListener{addHandler()}
        buttonSub.setOnClickListener{subHandler()}
        buttonMul.setOnClickListener{mulHandler()}
        buttonDiv.setOnClickListener{divHandler()}
    }

    fun addHandler() {
        val num1 = Integer.parseInt(editText1.text.toString());
        val num2 = Integer.parseInt(editText2.text.toString());
        val result = num1 + num2;

        textView.setText(result.toString())
        editText1.setText(result.toString())
        editText2.setText(null)
    }
    fun subHandler() {
        val num1 = Integer.parseInt(editText1.text.toString());
        val num2 = Integer.parseInt(editText2.text.toString());
        val result = num1 - num2;

        textView.setText(result.toString())
        editText1.setText(result.toString())
        editText2.setText(null)

    }
    fun mulHandler() {
        val num1 = Integer.parseInt(editText1.text.toString());
        val num2 = Integer.parseInt(editText2.text.toString());
        val result = num1 * num2;

        textView.setText(result.toString())
        editText1.setText(result.toString())
        editText2.setText(null)

    }
    fun divHandler() {
        val num1 = Integer.parseInt(editText1.text.toString());
        val num2 = Integer.parseInt(editText2.text.toString());
        val result = num1 / num2;

        textView.setText(result.toString())
        editText1.setText(result.toString())
        editText2.setText(null)

    }
}
