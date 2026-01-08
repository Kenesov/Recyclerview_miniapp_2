package uz.gita.recyclerapp.task4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import uz.gita.recyclerapp.R
import uz.gita.recyclerapp.databinding.ActivityTask4Binding
import uz.gita.recyclerapp.task4.adapter.Task4Adapter
import uz.gita.recyclerapp.task4.data.Task4Data

class Task4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTask4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTask4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val adapter = Task4Adapter(getList())
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
    private fun getList(): List<Task4Data> {
        return listOf(
            Task4Data(R.drawable.task3_img1, "Grand Tour of European", "Costa Rica", 4, "11 days", true),
            Task4Data(R.drawable.task3_img2, "Romantic Paris", "France", 5, "9 days", false),
            Task4Data(R.drawable.task3_img3, "Classic Italy", "Italy", 3, "7 days", true),
            Task4Data(R.drawable.task3_img4, "Discover Spain", "Spain", 4, "8 days", false),
            Task4Data(R.drawable.task3_img2, "Swiss Alps", "Switzerland", 5, "10 days", true),
            Task4Data(R.drawable.task3_img3, "Amazing Japan", "Japan", 4, "12 days", false),
            Task4Data(R.drawable.task3_img1, "Dubai Luxury", "UAE", 5, "6 days", true),
            Task4Data(R.drawable.task3_img2, "London Explorer", "UK", 3, "7 days", false),
            Task4Data(R.drawable.task3_img3, "New York City", "USA", 4, "9 days", true),
            Task4Data(R.drawable.task3_img4, "Istanbul Tour", "Turkey", 5, "8 days", false)
        )
    }

}