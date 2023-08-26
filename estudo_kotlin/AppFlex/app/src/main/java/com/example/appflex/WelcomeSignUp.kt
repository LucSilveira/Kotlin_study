package com.example.appflex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class WelcomeSignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_sign_up)

        setSupportActionBar( findViewById(R.id.main_toolbar) )
        supportActionBar?.title = null
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.signup_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}