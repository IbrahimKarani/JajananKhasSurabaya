package com.example.resepkhassurabaya

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_resep.*

class DetailMakanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.detail_resep)

        var intentThatStartedThisActivity = intent

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {

            showContent(intentThatStartedThisActivity)
        }
    }

    private fun showContent(intentThatStartedThisActivity: Intent) {
        var nameF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INTENT)
        var deskF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
        var deskS = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
        var deskL = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
        var deskH = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INDEX)
        var imgF = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)

        tv_name_detail.text = nameF
        tv_desc_detail.text = deskF
        tv_short_detail.text = deskS
        tv_lokasi_detail.text = deskL
        tv_harga_detail.text = deskH
        image_detail.contentDescription = nameF
        image_detail.setImageResource(imgF)
    }
}