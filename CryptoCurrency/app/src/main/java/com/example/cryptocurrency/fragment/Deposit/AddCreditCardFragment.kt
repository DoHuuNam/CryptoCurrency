package com.example.cryptocurrency.Fragment.Deposit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cryptocurrency.R

class AddCreditCardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_add_credit_card, container, false)
    }

    // Bạn có thể thêm logic cần thiết trong fragment này (như ánh xạ views, xử lý sự kiện...)
}
