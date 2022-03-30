package mumtaz.binar.chapterempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import mumtaz.binar.chapterempat.pertemuandua.AlertDialogActivity
import mumtaz.binar.chapterempat.pertemuandua.LatihanEmpatActivity
import mumtaz.binar.chapterempat.pertemuandua.LatihanTigaActivity
import mumtaz.binar.chapterempat.pertemuansatu.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_pertama.setOnClickListener {
            startActivity(Intent(this, LatihanEmpatActivity::class.java))
        }
    }
}