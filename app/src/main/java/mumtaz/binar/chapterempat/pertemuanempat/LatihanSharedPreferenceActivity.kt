package mumtaz.binar.chapterempat.pertemuanempat

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_latihan_shared_preference.*
import mumtaz.binar.chapterempat.R

class LatihanSharedPreferenceActivity : AppCompatActivity() {

    lateinit var prefs : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_shared_preference)

        prefs = getSharedPreferences("latihan", Context.MODE_PRIVATE)

        btn_save.setOnClickListener {
            val id = et_id.text.toString()
            val name = et_namaid.text.toString()
            prefs.edit().putString("id", id).putString("name", name).apply()
            Toast.makeText(this, "Data disimpan", Toast.LENGTH_SHORT).show()
            et_id.setText("")
            et_namaid.setText("")
        }

        btn_view.setOnClickListener {
            val tvnamaid = "Nama ${prefs.getString("name","")}"
            val tvid = "Id ${prefs.getString("id","")}"

            if (prefs.contains("name")){
                tv_namaid.text = tvnamaid
                tv_id.text = tvid
            }else{
                Toast.makeText(this, "Data tidak ada", Toast.LENGTH_SHORT).show()
            }
        }

        btn_clear.setOnClickListener {
            val tvnamaid = "Namamu"
            val tvid = "Idmu"

            prefs.edit().clear().apply()

            tv_id.text = tvid
            tv_namaid.text = tvnamaid

            Toast.makeText(this, "Data Dihapus", Toast.LENGTH_SHORT).show()
        }


    }


}