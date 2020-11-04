package com.rivaphy.stuper.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
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

        btn_next_on_boarding.setOnClickListener {
            if (vp_on_boarding.currentItem != vp_on_boarding.adapter!!.count - 1 ) {
                vp_on_boarding.currentItem = vp_on_boarding.currentItem + 1
            }
        }

        btn_skip_on_boarding.setOnClickListener {
            if (vp_on_boarding.currentItem == 0) {
                vp_on_boarding.currentItem = vp_on_boarding.currentItem + 2
            } else {
                vp_on_boarding.currentItem = vp_on_boarding.currentItem + 1
            }
        }

        setPageChange()
    }

    private fun setPageChange() {

        vp_on_boarding.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
                if (vp_on_boarding.currentItem == vp_on_boarding.adapter!!.count - 1) {
                    btn_on_boarding.visibility = View.VISIBLE
                    btn_next_on_boarding.visibility = View.INVISIBLE
                    btn_skip_on_boarding.visibility = View.INVISIBLE
                } else {
                    btn_on_boarding.visibility = View.INVISIBLE
                }
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
            }

        })
    }
}