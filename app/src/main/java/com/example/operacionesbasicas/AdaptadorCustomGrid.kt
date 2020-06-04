package com.example.operacionesbasicas

import android.content.Context
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class AdaptadorCustomGrid(var context: Context, items: ArrayList<Titulo_grid>) : BaseAdapter() {
    var items: ArrayList<Titulo_grid>? = null

    init {
        this.items = items
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var vista = convertView
        var holder: ViewHolder? = null
        if (vista == null) {
            vista = LayoutInflater.from(context).inflate(R.layout.grid_layout, null)
            holder = ViewHolder(vista)
            vista.tag = holder
        } else {
            holder = vista.tag as? ViewHolder
        }
        val item = items?.get(position) as? Titulo_grid
        holder?.titulo?.text = item?.titulo
        holder?.descripcion?.text = item?.descripcion

        holder?.imagen?.setImageResource(item?.img!!)

        return vista!!
    }

    override fun getItem(position: Int): Any {
        return items?.get(position)!!

    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return items?.count()!!
    }

    private class ViewHolder(vista: View) {
        var titulo: TextView? = null
        var descripcion: TextView? = null
        var imagen: ImageView? = null

        init {
            titulo = vista.findViewById(R.id.tvTitulo)
            descripcion = vista.findViewById(R.id.tvDescripcion)
            imagen = vista.findViewById(R.id.tvImage)
        }
    }

}