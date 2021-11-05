package com.example.utsrizkydwisaputra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androit.os.contect.Intent
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(
                DataModel(
                        R.drawable.c, "c", "c", "bahasa pemrograman tingkat tinggi dan general-purpose yang digunakan dalam sehari-hari"
                )
        )

        data?.add(
                DataModel(
                        R.drawable.html, "html", "html", "bahasa yang digunakan untuk membuat halaman web. Bagi yang berkecimpung di dunia perangkat gadget dan ilmu komputer, pasti sudah tidak asing lagi dengan berbagai kode di dalamnya."
                )
        )

        data?.add(
                DataModel(
                        R.drawable.php, "php", "php", "Bagian dari Bahasa Pemrograman, Berikut Penjelasan Selengkapnya. ... PHP adalah singkatan rekursif untuk \"PHP: Hypertext Preprocessor\", yaitu bahasa pemrograman yang digunakan secara luas untuk penanganan pembuatan dan pengembangan sebuah situs web dan bisa digunakan bersamaan dengan HTML."
                )
        )

        data?.add(
                DataModel(
                        R.drawable.pytho, "python", "python", "salah satu bahasa pemrograman yang dapat melakukan eksekusi sejumlah instruksi multi guna secara langsung (interpretatif) dengan metode orientasi objek."
                )
        )

        data?.add(
                DataModel(
                        R.drawable.pytho, "python", "python", "salah satu bahasa pemrograman yang dapat melakukan eksekusi sejumlah instruksi multi guna secara langsung (interpretatif) dengan metode orientasi objek."
                )
        )

        data?.add(
                DataModel(
                        R.drawable.java, "java", "java", "pemrograman tingkat tinggi yang berorientasi objek dan program java tersusun dari bagian yang disebut kelas."
                )
        )
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Detail Bahasa Pemograman"

        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.python-2048x2039))
        textViewNamaDetail.text = intent.getStringExtra("nama")
        textViewKetDetail.text = intent.getStringExtra("keterangan")

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}