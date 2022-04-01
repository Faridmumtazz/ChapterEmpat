package mumtaz.binar.chapterempat.pertemuanempat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_shared_preference_dua.*
import mumtaz.binar.chapterempat.R

class MainSharedPreferenceDuaActivity : AppCompatActivity() {

    lateinit var sf : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_shared_preference_dua)

        sf = getSharedPreferences("contoh", Context.MODE_PRIVATE)
        val getnama = sf.getString("NAMA","")

        tv_namasf.text = getnama

        btn_logout.setOnClickListener {
            logout()
        }
    }

    fun logout(){
        val logoutsf = sf.edit()
        logoutsf.clear()
        logoutsf.apply()

        startActivity(Intent(this, MainSharedPreferenceActivity::class.java))
        finish()
    }
}