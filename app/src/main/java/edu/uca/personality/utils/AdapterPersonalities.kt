package edu.uca.personality.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import edu.uca.personality.R
import edu.uca.personality.model.Personalities
import kotlinx.android.synthetic.main.item_place.view.*

class AdapterPersonalities () : RecyclerView.Adapter<AdapterPersonalities.ViewHolder>() {

    lateinit var items: ArrayList<Personalities>

    fun setPlaces(items: List<Personalities>){
        this.items = items as ArrayList<Personalities>
        notifyDataSetChanged()
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each picture to
        val placeImage: ImageView = view.place_image
        val name: TextView = view.name
        val descripton: TextView = view.description
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model= items[position]
        holder.name.text = model.name
        holder.descripton.text = model.description
        Picasso.get()
            .load(model.url)
            .into(holder.placeImage)
    }

    override fun getItemCount(): Int {
        return if(::items.isInitialized){
            items.size
        }else{
            0
        }
    }
}