package mumtaz.binar.chapterempat.pertemuandua

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.LayoutDirection
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.view.*
import mumtaz.binar.chapterempat.R

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        alertsatu.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Title Example")
                .setMessage("Contoh pesan dari alert dialog standard")
                .setIcon(R.drawable.ic_baseline_home_24)
                .setCancelable(true)
                .show()
        }

        alertdua.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Hapus Data")
                .setMessage("Yakin hapus data ?")
                .setCancelable(false)
                .setPositiveButton("ya"){ dialogInterface: DialogInterface, i: Int ->
                    Toast.makeText(this, "Data Anda Terhapus", Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("tidak"){ dialogInterface: DialogInterface, i: Int ->
                    Toast.makeText(this, "Data Anda Aman", Toast.LENGTH_LONG).show()
                }
                .show()
        }

        alertduaa.setOnClickListener {
            val ad = AlertDialog.Builder(this)
                val aa = ad.create()
                ad.setTitle("Example Dismiss")
                ad.setMessage("Isi massage dari dismiss")
                ad.setPositiveButton("ya"){ dialogInterface: DialogInterface, i: Int ->
                    Toast.makeText(this, "Toast ya", Toast.LENGTH_LONG).show()
                }
                ad.setNegativeButton("dismiss"){ dialogInterface: DialogInterface, i: Int ->
                    aa.dismiss()
                }
                    .show()
        }

        alerttiga.setOnClickListener {
            val customdialog = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null, false)
            val ab = AlertDialog.Builder(this)
                .setView(customdialog)
                .create()


            customdialog.btn_ok.setOnClickListener {
                val nama = customdialog.et_namaa.text.toString()
                get_nama.text = nama
                Toast.makeText(this, "Selamat Datang $nama", Toast.LENGTH_LONG).show()
                ab.dismiss()
            }
            ab.show()

        }

        alertempat.setOnClickListener {
            AlertDialogFragment().show(supportFragmentManager, "abc")
        }
    }
}