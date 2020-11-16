package com.example.resepkhassurabaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = CreateMakanan()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = AdapterMakanan(data, { onItem: DataMakanan -> onItemClicked(onItem) })
    }

    private fun onItemClicked(onItem: DataMakanan) {
        val showDetailActivityIntent = Intent(this, DetailMakanan::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgMak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_INTENT, onItem.nameMak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameMak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descMak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.lokasiMak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_INDEX, onItem.hargaMak)
        startActivity(showDetailActivityIntent)
    }

}
