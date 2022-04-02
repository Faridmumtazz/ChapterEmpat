package mumtaz.binar.chapterempat.pertemuanempat.tugas

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SharedMemory
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import mumtaz.binar.chapterempat.R

class LoginActivity : AppCompatActivity() {

    lateinit var prefs : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        prefs = getSharedPreferences("LATIHAN", Context.MODE_PRIVATE)

        login()
    }

    private fun login(){
        btn_logins.setOnClickListener {
            val nama = et_username.text.toString()
            val pw = et_password.text.toString()

            val sf = prefs.edit()
            sf.putString("NAMA", nama)
            sf.putString("PW", pw)
            sf.apply()

            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }
}