package uz.gita.recyclerapp.task2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.gita.recyclerapp.databinding.ItemTask2Binding
import uz.gita.recyclerapp.task2.data.Task2Data

class Task2Adapter(private val list: List<Task2Data>) :
    RecyclerView.Adapter<Task2Adapter.Task2ViewHolder>() {

    inner class Task2ViewHolder(private val binding: ItemTask2Binding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Task2Data) {
            binding.container.setBackgroundColor(item.color)
            binding.textBalance.text = item.balance
            binding.textCard.text = item.cartNumber
            binding.textCardDate.text = item.cartDate
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Task2ViewHolder {
        val binding = ItemTask2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Task2ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Task2ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}
