package edu.itesm.djs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.djs_renglon.*
import kotlinx.android.synthetic.main.djs_renglon.estilo_dj
import kotlinx.android.synthetic.main.djs_renglon.foto_dj
import kotlinx.android.synthetic.main.djs_renglon.nombre_dj
import kotlinx.android.synthetic.main.djs_renglon.origen_dj
import kotlinx.android.synthetic.main.djs_renglon.plot_dj
import kotlinx.android.synthetic.main.fragment_dj.*

/**
 * A simple [Fragment] subclass.
 * Use the [DjFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DjFragment : Fragment() {

    private val args by navArgs<DjFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dj, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        foto_dj.setImageResource(args.dj.picture)
        nombre_dj.text = args.dj.name
        estilo_dj.text = args.dj.style
        origen_dj.text = args.dj.origin
        plot_dj.text = args.dj.plot

        // Toast
        val text = args.dj.secret
        val duration = Toast.LENGTH_LONG

        val toast = Toast.makeText(context, text, duration)
        toast.show()

    }
}