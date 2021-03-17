package edu.itesm.djs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class DjsAdapter(private val djs : List<Dj>) : RecyclerView.Adapter<DjsAdapter.DjsViewHolder>() {

    inner class DjsViewHolder(renglon: View): RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.nombre_dj)
        var origen = renglon.findViewById<TextView>(R.id.origen_dj)
        var estilo = renglon.findViewById<TextView>(R.id.estilo_dj)
        var plot = renglon.findViewById<TextView>(R.id.plot_dj)
        var foto = renglon.findViewById<ImageView>(R.id.foto_dj)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DjsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.djs_renglon,parent, false)
        return DjsViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: DjsViewHolder, position: Int) {
        val dj = djs[position]
        holder.foto.setImageResource(dj.picture)
        holder.nombre.text = dj.name
        holder.origen.text = dj.origin
        holder.estilo.text = dj.style
        holder.plot.text = dj.plot

        holder.itemView.setOnClickListener {
            val action = DjsFragmentDirections.actionDjsFragmentToDjFragment(dj)
            holder.itemView.findNavController().navigate(action)
        }


    }

    override fun getItemCount(): Int {
        return djs.size
    }
}