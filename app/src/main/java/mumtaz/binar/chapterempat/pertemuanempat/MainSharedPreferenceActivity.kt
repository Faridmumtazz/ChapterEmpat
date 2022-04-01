package mumtaz.binar.chapterempat.pertemuanempat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_shared_preference.*
import mumtaz.binar.chapterempat.R

class MainSharedPreferenceActivity : AppCompatActivity() {
//    Membuat Variable Global
    lateinit var prefs : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_shared_preference)

//        Untuk cek apakah data sudah di shared preferences, jika sudah ada data nama
//        maka dia pindah ke halaman yang ingin dituju

        if (getSharedPreferences("contoh", Context.MODE_PRIVATE).contains("NAMA")){
            startActivity(Intent(this, MainSharedPreferenceDuaActivity::class.java))
            finish()
        }

//        Initialize isi dari variable global

        prefs = getSharedPreferences("contoh", Context.MODE_PRIVATE)
        SharedPrefExample()
    }

    fun SharedPrefExample(){
        btn_login.setOnClickListener {

//            Langkah Memasukkan Data ke Shared Preferences

            val datanama = et_namasf.text.toString()
            val sf = prefs.edit()
            sf.putString("NAMA",datanama)
            sf.apply()

//            Memulai activity tujuan

            startActivity(Intent(this, MainSharedPreferenceDuaActivity::class.java))
            finish()


        }
    }
}