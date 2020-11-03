package com.rivaphy.stuper.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class OnBoardingAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int = 3

    override fun getPageTitle(position: Int): CharSequence? {
        return null
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> OnBoardingFragment.newInstance(position)
            1 -> OnBoardingFragment.newInstance(position)
            else -> OnBoardingFragment.newInstance(position)
        }
    }
}