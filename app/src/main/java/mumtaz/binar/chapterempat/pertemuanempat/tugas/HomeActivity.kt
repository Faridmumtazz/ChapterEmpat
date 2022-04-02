package mumtaz.binar.chapterempat.pertemuanempat.tugas

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_home.*
import mumtaz.binar.chapterempat.R

class HomeActivity : AppCompatActivity() {
    lateinit var prefs : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        prefs = getSharedPreferences("LATIHAN", Context.MODE_PRIVATE)

        val nama = prefs.getString("NAMA","")
        tv_username.text = nama

        btn_logouts.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Keluar")
                .setMessage("Yakin keluar?")
                .setIcon(R.drawable.binar)
                .setPositiveButton("Ya"){ p0, p1 ->
                    prefs.edit().clear().apply()
                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()
                }
                .setNegativeButton("Tidak"){p0, p1 ->
                }.show()
        }
    }
}