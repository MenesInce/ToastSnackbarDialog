package com.menesince.alerts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import com.menesince.alerts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonToast.setOnClickListener {
            Toast.makeText(this,"Merhaba",Toast.LENGTH_LONG).show()
        }

        binding.buttonSnackbar.setOnClickListener {
            Snackbar.make(it,"Silmek istiyor musunuz?",Snackbar.LENGTH_SHORT)
                .setAction("EVET"){
                    Snackbar.make(it,"SİLİNDİ",Snackbar.LENGTH_SHORT)
                        .setBackgroundTint(Color.WHITE)
                        .setTextColor(Color.BLUE)
                        .show()
                }
                .setBackgroundTint(Color.WHITE)
                .setTextColor(Color.BLUE)
                .setActionTextColor(Color.RED)
                .show()
        }

        binding.buttonDialog.setOnClickListener {
            MaterialAlertDialogBuilder(this@MainActivity)
                .setTitle("Başlık")
                .setMessage("Message")
                .setPositiveButton("Tamam") {d,i ->
                    Toast.makeText(this,"Tamam Seçildi",Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("İptal") {d,i ->
                    Toast.makeText(this,"İptal Edildi",Toast.LENGTH_LONG).show()
                }
                .show()
        }
    }
}