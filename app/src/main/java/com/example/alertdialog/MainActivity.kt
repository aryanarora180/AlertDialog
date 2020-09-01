package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<MaterialButton>(R.id.show_dialog_button).setOnClickListener {
            MaterialAlertDialogBuilder(this).apply {
                setTitle("Dialog title")
                setMessage("Dialog body")
                setPositiveButton("Agree and continue") { _, _ ->

                }
                setNeutralButton("No") { _, _ ->

                }
                show()
            }
        }
    }
}