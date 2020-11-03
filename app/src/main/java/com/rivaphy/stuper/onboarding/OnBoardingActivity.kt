package com.rivaphy.stuper.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rivaphy.stuper.MainActivity
import com.rivaphy.stuper.R
import kotlinx.android.synthetic.main.activity_on_boarding.*

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var adapter: OnBoardingAdapter
    private var currentItem: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)

        adapter = OnBoardingAdapter(supportFragmentManager)
        vp_on_boarding.adapter = adapter
        vp_on_boarding.currentItem = currentItem

        initView()

    }

    private fun initView() {
        currentItem = 0

        tl_indicator_on_boarding.setupWithViewPager(vp_on_boarding)

        btn_on_boarding.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}