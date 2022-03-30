package mumtaz.binar.chapterempat.pertemuandua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_latihan_empat.*
import kotlinx.android.synthetic.main.activity_latihan_empat.view.*
import kotlinx.android.synthetic.main.latihan_empat_custom.*
import kotlinx.android.synthetic.main.latihan_empat_custom.view.*
import mumtaz.binar.chapterempat.R

class LatihanEmpatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_empat)



        submitsatu.setOnClickListener {

            val latihanCustomDialog = LayoutInflater.from(this).inflate(R.layout.latihan_empat_custom, null)
            val ab = AlertDialog.Builder(this)
                ab.setView(latihanCustomDialog)
                ab.create()

                ab.show()


            latihanCustomDialog.btn_bayar.setOnClickListener {
                val barang = et_barang.text.toString()
                val jumlah = latihanCustomDialog.et_jumlah.text.toString().toInt()
                val harga = latihanCustomDialog.et_harga.text.toString().toInt()
                val total = (harga * jumlah)
                get_hasil.text = total.toString()

                val bayar = latihanCustomDialog.et_bayar.text.toString().toInt()
                val kembalian = bayar - total




            }




        }
    }
}