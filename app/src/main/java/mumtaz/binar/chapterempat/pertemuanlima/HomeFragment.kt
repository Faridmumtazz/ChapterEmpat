package mumtaz.binar.chapterempat.pertemuanlima

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_home.*
import mumtaz.binar.chapterempat.R
import mumtaz.binar.chapterempat.pertemuanempat.tugas.LoginActivity


class HomeFragment : Fragment() {

    private lateinit var prefs: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        prefs = requireContext().getSharedPreferences("login", Context.MODE_PRIVATE)

        val tvnama = "Halo, ${prefs.getString("nama", "")}"
        tv_namaa.text = tvnama

        btn_keluar.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("Keluar")
                .setMessage("Yakin keluar?")
                .setIcon(R.drawable.binar)
                .setPositiveButton("Ya"){ p0, p1 ->
                    prefs.edit().clear().apply()
                    it.findNavController().navigate(R.id.action_homeFragment_to_loginFragment)
                }.setNegativeButton("Tidak"){p0, p1 ->
                }.show()
        }
    }


}