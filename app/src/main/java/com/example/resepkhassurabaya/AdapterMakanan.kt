package com.example.resepkhassurabaya
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_makanan.view.*

class AdapterMakanan(private val itemFac: List<DataMakanan>,
                      private val clickListener: (DataMakanan) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_makanan, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemFac[position], clickListener)
    }

    override fun getItemCount() = itemFac.size

    class PartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(data : DataMakanan, clickListener: (DataMakanan) -> Unit){
            itemView.image_fak.setImageResource(data.imgMak)
            itemView.image_fak.contentDescription = data.nameMak
            itemView.tv_list_fac.text = data.nameMak
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}