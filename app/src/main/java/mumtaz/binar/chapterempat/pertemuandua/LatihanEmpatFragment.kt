package mumtaz.binar.chapterempat.pertemuandua

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_latihan_empat.*
import kotlinx.android.synthetic.main.fragment_latihan_empat.*
import kotlinx.android.synthetic.main.latihan_empat_custom.*
import kotlinx.android.synthetic.main.latihan_empat_custom.view.*
import mumtaz.binar.chapterempat.R


class LatihanEmpatFragment(val barang:String, val jumlah: String, val harga: String) : DialogFragment(R.layout.fragment_latihan_empat){


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_latihan_empat, container, false)
    }

    override fun onResume() {
        super.onResume()
        dialog?.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val total = jumlah.toInt() * harga.toInt()

        get_hasilsatu.append("Rp$total")

        btn_bayarsatu.setOnClickListener {
            val bayar = et_bayarsatu.text.toString().toInt()
            val txtbarang = "${(R.id.et_barang)} : $barang"
            val txtjumlah = "${(R.id.et_jumlah)} : $jumlah"
            val txtharga = "${(R.id.et_harga)} : $harga"
            val txttotal = "${(R.id.tv_total)} : $total"
            val txtkembalian = "${(R.id.tv_kembalian)} Rp${bayar - total}"

            if (bayar < total){
                Toast.makeText(requireContext(), "Uang bayar kurang", Toast.LENGTH_SHORT).show()
                et_bayar.setText("")
            }else{
                dismiss()
                requireActivity().tv_barang.text = txtbarang
                requireActivity().tv_jumlah.text = txtjumlah
                requireActivity().tv_harga.text = txtharga
                requireActivity().tv_total.text = txttotal
                requireActivity().tv_kembalian.text = txtkembalian
            }
        }
    }


}