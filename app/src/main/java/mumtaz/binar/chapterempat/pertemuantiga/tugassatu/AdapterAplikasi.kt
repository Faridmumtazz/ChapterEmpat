package mumtaz.binar.chapterempat.pertemuantiga.tugassatu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_apk_adapter.view.*
import kotlinx.android.synthetic.main.item_mhs_adapter.view.*
import mumtaz.binar.chapterempat.R
import mumtaz.binar.chapterempat.pertemuantiga.AdapterMahasiswa

class AdapterAplikasi (val listdata : ArrayList<DataApk>):RecyclerView.Adapter<AdapterAplikasi.ViewHolder>() {

    class ViewHolder (layout: View): RecyclerView.ViewHolder(layout) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterAplikasi.ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_apk_adapter, parent, false)
        return AdapterAplikasi.ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: AdapterAplikasi.ViewHolder, position: Int) {
        holder.itemView.tv_namaapk.text = listdata[position].namaapk
        holder.itemView.tv_namapt.text = listdata[position].namapt
        holder.itemView.tv_kategori.text = listdata[position].kategori
        holder.itemView.tv_rate.text = listdata[position].rate
        holder.itemView.tv_dw.text = listdata[position].dw
        holder.itemView.tv_pengguna.text = listdata[position].pengguna
    }

    override fun getItemCount(): Int {
        return listdata.size
    }
}