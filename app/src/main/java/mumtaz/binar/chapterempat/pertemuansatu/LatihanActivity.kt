package mumtaz.binar.chapterempat.pertemuansatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_latihan.*
import mumtaz.binar.chapterempat.MainActivity
import mumtaz.binar.chapterempat.R

class LatihanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan)

        btn_next.setOnClickListener {
            val a = et_nama.text.toString()
            Toast.makeText(this, "Selamat Datang $a", Toast.LENGTH_LONG).show()
        }

        btn_go.setOnClickListener {
            Snackbar.make(it, "Pindah coba deh", Snackbar.LENGTH_INDEFINITE)
                .setAction("Gas") {
                    startActivity(Intent(this, MainActivity::class.java))
                }
                .show()
        }
    }
}