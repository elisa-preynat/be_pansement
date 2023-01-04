package fr.isen.preynat.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NavigationBar : AppCompatActivity() {

    private lateinit var binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_bar)
    }
}