package uz.gita.recyclerapp.task1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.gita.recyclerapp.databinding.ItemTask1Binding
import uz.gita.recyclerapp.task1.data.Task1Data

class Task1Adapter(private val list: List<Task1Data>): RecyclerView.Adapter<Task1Adapter.Task1ViewHolder>() {

    inner class Task1ViewHolder(private val binding: ItemTask1Binding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: Task1Data){
            binding.imgUser.setImageResource(item.image)
            binding.textName.text = item.name
            binding.textMessage.text = item.message
            binding.textTime.text = item.timer
            if (item.active){
                binding.statusActive.visibility = View.VISIBLE
            } else{
                binding.statusActive.visibility = View.GONE
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Task1ViewHolder {
        val binding = ItemTask1Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Task1ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: Task1ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}