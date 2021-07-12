package com.example.foodly.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.foodly.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        postDelay()
    }


    fun postDelay() {

             sharedPreferences = this.getSharedPreferences(
                getString(R.string.shared_preferences),
                Context.MODE_PRIVATE
            )

            val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)


            if (isLoggedIn) {
                get_started.visibility = View.GONE
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                get_started.setOnClickListener {
                    val startAct = Intent(this@SplashActivity, LoginActivity::class.java)
                    startActivity(startAct)
                    finish()
                }
            }
        }

    }

