package com.sznowicki.homebrewblgdilutioncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var inputReceivedBlg: TextInputLayout
    private lateinit var inputWantedBlg: TextInputLayout
    private lateinit var inputWotVolume: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputReceivedBlg = findViewById(R.id.input_received_blg)
        inputWantedBlg = findViewById(R.id.input_wanted_blg)
        inputWotVolume = findViewById(R.id.input_wot_volume)

        // TODO: Read value from text field
        val receivedBlg = inputReceivedBlg.editText?.text.toString()
    }
}
