package uz.gita.recyclerapp.task5.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.gita.recyclerapp.databinding.ItemTask5Binding
import uz.gita.recyclerapp.task5.data.Task5Data

class Task5Adapter(private val list: List<Task5Data>): RecyclerView.Adapter<Task5Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemTask5Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(private val binding: ItemTask5Binding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: Task5Data){
            binding.img.setImageResource(data.img)
            binding.textName.text = data.name
        }
    }
}