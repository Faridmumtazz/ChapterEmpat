package mumtaz.binar.chapterempat.pertemuantiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_data_mahasiswa.*
import mumtaz.binar.chapterempat.R

class DataMahasiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_mahasiswa)

        val datamahasiswa = arrayListOf(
            DataMhs("Ani", "23", R.drawable.satu),
            DataMhs("Budi", "21", R.drawable.satu),
            DataMhs("Bidu", "22", R.drawable.satu),
            DataMhs("Andi", "23", R.drawable.satu),
            DataMhs("Ando", "24", R.drawable.satu),
            DataMhs("Aci", "26", R.drawable.satu),
            DataMhs("Aco", "28", R.drawable.satu),
            DataMhs("Ana", "20", R.drawable.satu)
        )
        val adapter = AdapterMahasiswa(datamahasiswa)
        val laymanajer = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_mhs.layoutManager = laymanajer
        rv_mhs.adapter = adapter
    }
}