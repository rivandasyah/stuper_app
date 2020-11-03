package com.rivaphy.stuper.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import com.rivaphy.stuper.R

class OnBoardingFragment : Fragment() {

    private var position: Int = 0

    companion object {
        private const val ARG_POSITION = "position"

        fun newInstance(position: Int): OnBoardingFragment {
            val f = OnBoardingFragment()
            val b = Bundle()
            b.putInt(ARG_POSITION, position)
            f.arguments = b
            return f
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        position = arguments!!.getInt(ARG_POSITION)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_on_boarding, container, false)

        when (position) {
            0 -> {
//                iv_on_boarding.setImageResource(R.drawable.first_on_boarding)
//                btn_on_boarding.visibility = View.GONE
//                tv_desc_on_boarding.setText(R.string.text_discuss_together)
//                tv_sub_desc_on_boarding.setText(R.string.first_sub_desc_on_boarding)
            }
            1 -> {
//                iv_on_boarding.setImageResource(R.drawable.second_on_boarding)
//                tv_desc_on_boarding.setText(R.string.text_your_progress)
//                btn_on_boarding.visibility = View.GONE
//                tv_sub_desc_on_boarding.setText(R.string.second_sub_desc_on_boarding)
            }
            2 -> {
//                iv_on_boarding.setImageResource(R.drawable.third_on_boarding)
//                tv_desc_on_boarding.setText(R.string.text_task_reminder)
//                tv_sub_desc_on_boarding.setText(R.string.third_sub_desc_on_boarding)
            }
        }
        ViewCompat.setElevation(view, 50F)

        return view
    }

}