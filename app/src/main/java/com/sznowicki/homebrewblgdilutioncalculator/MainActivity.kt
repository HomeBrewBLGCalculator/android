package com.sznowicki.homebrewblgdilutioncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var inputReceivedBlg: TextInputLayout
    private lateinit var inputWantedBlg: TextInputLayout
    private lateinit var inputWotVolume: TextInputLayout
    private lateinit var textResult: TextView

    private fun showResult() {
        val receivedBlg = inputReceivedBlg.editText?.text.toString().toFloat()
        val wantedBlg = inputWantedBlg.editText?.text.toString().toFloat()
        val wotVolume = inputWotVolume.editText?.text.toString().toFloat()

        if (receivedBlg < 1 || wantedBlg < 1 || wotVolume < 1) {
            return
        }

        var result = ((receivedBlg - wantedBlg) * wotVolume) / wantedBlg

        val resultText = getResources().getString(R.string.result, result)

        textResult.setText(resultText)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputReceivedBlg = findViewById(R.id.input_received_blg)
        inputWantedBlg = findViewById(R.id.input_wanted_blg)
        inputWotVolume = findViewById(R.id.input_wot_volume)
        textResult = findViewById(R.id.result)

        inputReceivedBlg.editText?.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                showResult()
            }
        })

        inputWantedBlg.editText?.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                showResult()
            }
        })

        inputWotVolume.editText?.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                showResult()
            }
        })
    }
}
