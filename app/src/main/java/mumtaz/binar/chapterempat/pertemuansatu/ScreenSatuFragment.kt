package mumtaz.binar.chapterempat.pertemuansatu

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_latihan.*
import kotlinx.android.synthetic.main.fragment_screen_satu.*
import mumtaz.binar.chapterempat.MainActivity
import mumtaz.binar.chapterempat.R


class ScreenSatuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_nextt.setOnClickListener {
            val a = et_name.text.toString()
            Toast.makeText(requireContext(), "Selamat Datang $a", Toast.LENGTH_LONG).show()
        }

        btn_goo.setOnClickListener {
            Snackbar.make(it, "Pindah coba deh", Snackbar.LENGTH_INDEFINITE)
                .setAction("Gas") {
                    Navigation.findNavController(view).navigate(R.id.action_screenSatuFragment_to_screenDuaFragment)
                }
                .show()
        }
    }


}