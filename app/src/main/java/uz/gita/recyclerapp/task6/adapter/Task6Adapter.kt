package uz.gita.recyclerapp.task6.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.gita.recyclerapp.databinding.ItemTask6Binding
import uz.gita.recyclerapp.task6.data.Task6Data

class Task6Adapter(private val list: List<Task6Data>): RecyclerView.Adapter<Task6Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemTask6Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(private val binding: ItemTask6Binding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: Task6Data) {
            binding.image.setImageResource(data.image)
            binding.dec.text = data.dec
            binding.name.text = data.name
            binding.nikName.text = data.nickName
            binding.imgUser.setImageResource(data.userImage)
        }
    }
}