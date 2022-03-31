package mumtaz.binar.chapterempat.pertemuantiga.tugassatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_data_aplikasi.*
import kotlinx.android.synthetic.main.activity_data_mahasiswa.*
import mumtaz.binar.chapterempat.R
import mumtaz.binar.chapterempat.pertemuantiga.AdapterMahasiswa

class DataAplikasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_aplikasi)

        val dataplikasi = arrayListOf(
            DataApk("Binar Academy", "Lentera Bangsa Benderang","Education","85","185mb","200jt"),
            DataApk("Lintasi", "Lintasi Group","Education","75","105mb","200jt"),
            DataApk("Studio", "Studio Group","Education","85","185jt","200jt")
        )
        val adapter = AdapterAplikasi(dataplikasi)
        val laymanajer = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_apk.layoutManager = laymanajer
        rv_apk.adapter = adapter
    }
}