package fr.isen.preynat.myapplication.ble

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.isen.preynat.myapplication.R

class BleScanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ble_scan)
    }
}