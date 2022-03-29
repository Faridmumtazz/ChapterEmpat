package mumtaz.binar.chapterempat.pertemuandua

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_latihan_tiga.*
import mumtaz.binar.chapterempat.R

class LatihanTigaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_tiga)

        btn_alert.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Title Example")
                .setMessage("Contoh pesan dari alert dialog standard")
                .setIcon(R.drawable.ic_baseline_home_24)
                .setCancelable(true)
                .show()
        }

        btn_jumlah.setOnClickListener {
            val a = et_angkasatu.text.toString().toInt()
            val b = et_angkadua.text.toString().toInt()
            val jumlah = a * b

            val ad = AlertDialog.Builder(this)
                val aa = ad.create()
                ad.setTitle("Hasil Perhitungan")
                ad.setMessage("Perhitungan $a dikali $b adalah $jumlah")
                ad.setNegativeButton("dismiss") { dialogInterface: DialogInterface, i: Int ->
                    aa.dismiss()
                }
                        ad.show()
        }
    }
}