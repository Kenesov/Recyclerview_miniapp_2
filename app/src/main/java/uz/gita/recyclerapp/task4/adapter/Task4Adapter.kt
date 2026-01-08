package uz.gita.recyclerapp.task4.adapter

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import uz.gita.recyclerapp.R
import uz.gita.recyclerapp.databinding.ItemTask4Binding
import uz.gita.recyclerapp.task4.data.Task4Data

class Task4Adapter(private val list: List<Task4Data>) :
    RecyclerView.Adapter<Task4Adapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemTask4Binding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Task4Data) {
            binding.imgCity.setBackgroundResource(data.icon)
            binding.textName.text = data.name
            binding.textCityName.text = data.cityName
            binding.textTime.text = data.time

            binding.iconIsActiv.setImageResource(
                if (data.isActiv) R.drawable.task3_saved_true
                else R.drawable.task3_saved_false
            )

            binding.containerStars.removeAllViews()

            repeat(data.starCount) {
                addStar(R.drawable.task3_icon_start_yellow)
            }

            repeat(5 - data.starCount) {
                addStar(R.drawable.task3_icon_start)
            }
        }

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
        val binding = ItemTask4Binding.inflate(
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

private fun Int.dp(): Int =
    (this * Resources.getSystem().displayMetrics.density).toInt()
