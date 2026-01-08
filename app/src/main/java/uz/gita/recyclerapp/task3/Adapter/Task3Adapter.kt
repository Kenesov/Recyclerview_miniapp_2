package uz.gita.recyclerapp.task3.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.view.marginEnd
import androidx.recyclerview.widget.RecyclerView
import uz.gita.recyclerapp.R
import uz.gita.recyclerapp.databinding.ItemTask3Binding
import uz.gita.recyclerapp.task3.data.Task3Data

class Task3Adapter(private val list: List<Task3Data>) :
    RecyclerView.Adapter<Task3Adapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemTask3Binding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Task3Data) {
            binding.container.setBackgroundResource(data.img)
            binding.textCityName.text = data.cityName
            binding.textInfo.text = data.info
            binding.textTime.text = data.range
            binding.textPrice.text = data.price

            binding.iconIsActiv.setImageResource(
                if (data.isAcitive) R.drawable.task3_saved_true
                else R.drawable.task3_saved_false
            )

            binding.containerStars.removeAllViews()

            repeat(data.startCount) {
                addStar(R.drawable.task3_icon_start_yellow)
            }

            repeat(5 - data.startCount) {
                addStar(R.drawable.task3_icon_start)
            }
        }

        private fun Int.dp(): Int =
            (this * binding.root.resources.displayMetrics.density).toInt()

        private fun addStar(icon: Int) {
            val image = ImageView(binding.root.context)
            image.setImageResource(icon)

            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )

            params.marginStart = 4.dp()
            params.marginEnd = 4.dp()

            image.layoutParams = params
            binding.containerStars.addView(image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemTask3Binding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size
}
