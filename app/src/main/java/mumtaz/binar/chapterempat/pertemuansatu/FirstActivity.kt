package mumtaz.binar.chapterempat.pertemuansatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_first.*
import mumtaz.binar.chapterempat.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        btn_toast.setOnClickListener {
            Toast.makeText(this, "This is an example toast", Toast.LENGTH_LONG).show()
        }

        btn_snackbar.setOnClickListener {
            Snackbar.make(it, "This is snackbar", Snackbar.LENGTH_LONG).show()
        }

        btn_snackbardua.setOnClickListener {
            Snackbar.make(it, "This is snackbar dua", Snackbar.LENGTH_INDEFINITE)
                .setAction("Show Toast") {
                    Toast.makeText(this, "Ini toast dari snakbar dua", Toast.LENGTH_LONG)
                        .show()
                }
                .show()
        }

        btn_snackbartiga.setOnClickListener {
           val aa =  Snackbar.make(it, "This is snackbar dua", Snackbar.LENGTH_INDEFINITE)
                   aa.setAction("Dismiss") {
                       aa.dismiss()
                   }
                aa.show()
        }


    }
}