package io.github.manuelernesto.meukumbu.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import io.github.manuelernesto.meukumbu.R
import io.github.manuelernesto.meukumbu.ui.home.HomeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        begin_btn.setOnClickListener { start() }
    }


    private fun start() {
        Intent(this, HomeActivity::class.java).also {
            it.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            it.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(it)
        }
    }
}