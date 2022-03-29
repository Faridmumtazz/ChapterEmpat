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
import kotlinx.android.synthetic.main.fragment_first.*
import mumtaz.binar.chapterempat.MainActivity
import mumtaz.binar.chapterempat.R


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_toastsatu.setOnClickListener {
            Toast.makeText(requireContext(), "This is an example toast", Toast.LENGTH_LONG).show()
        }

        btn_snackbarsatu.setOnClickListener {
            Snackbar.make(it, "Pindah yok", Snackbar.LENGTH_INDEFINITE)
                .setAction("Gas") {

                }
                .show()
        }
    }


}