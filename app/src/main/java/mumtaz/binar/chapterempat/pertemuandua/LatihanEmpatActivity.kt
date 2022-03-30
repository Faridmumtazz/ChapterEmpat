package mumtaz.binar.chapterempat.pertemuandua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_latihan_empat.*
import kotlinx.android.synthetic.main.latihan_empat_custom.view.*
import mumtaz.binar.chapterempat.R

class LatihanEmpatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_empat)



        submitsatu.setOnClickListener {
            val latihanCustomDialog = LayoutInflater.from(this).inflate(R.layout.latihan_empat_custom, null, false)

            val ab = AlertDialog.Builder(this)
            ab.setView(latihanCustomDialog)
            ab.create()

            val jumlah = et_jumlah.text.toString()
            val harga = et_harga.text.toString()
            val total = (harga.toInt() * jumlah.toInt())
            latihanCustomDialog.get_hasil.text = total.toString()


            latihanCustomDialog.btn_bayar.setOnClickListener {
                val barang = et_barang.text.toString()

                val jumlah = et_jumlah.text.toString()
                val harga = et_harga.text.toString()
                val total = (harga.toInt() * jumlah.toInt())

                val bayar = latihanCustomDialog.et_bayar.text.toString().toInt()
                val kembalian = bayar - total

                tv_barang.text = barang
                tv_jumlah.text = jumlah
                tv_harga.text = harga
                tv_total.text = total.toString()
                tv_kembalian.text = kembalian.toString()
            }
            ab.show()
        }

        submitdua.setOnClickListener {
            val jumlah = et_jumlah.text.toString().toInt()
            val harga = et_harga.text.toString().toInt()
            val barang = et_barang.text.toString()

            LatihanEmpatFragment(barang, jumlah.toString(), harga.toString()).show(supportFragmentManager, null)

        }
    }
}