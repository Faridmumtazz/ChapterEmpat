package mumtaz.binar.chapterempat.pertemuanlima

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import mumtaz.binar.chapterempat.R
import mumtaz.binar.chapterempat.pertemuanempat.tugas.LoginActivity


class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler().postDelayed(Runnable {
            Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_loginFragment)
        }, 2000)
    }


}