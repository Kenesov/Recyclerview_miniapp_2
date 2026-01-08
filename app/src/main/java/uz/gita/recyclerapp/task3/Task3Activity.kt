package uz.gita.recyclerapp.task3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import uz.gita.recyclerapp.R
import uz.gita.recyclerapp.databinding.ActivityTask3Binding
import uz.gita.recyclerapp.task3.Adapter.Task3Adapter
import uz.gita.recyclerapp.task3.data.Task3Data

class Task3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTask3Binding
    private lateinit var adapter: Task3Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTask3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        adapter = Task3Adapter(listAdd())
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun listAdd(): List<Task3Data> {
        return listOf(
            Task3Data(
                R.drawable.task3_img1,
                "Costa Rica",
                "Grand Tour of European",
                "11 days - 4 days",
                4,
                "$ 125.00",
                true
            ),
            Task3Data(
                R.drawable.task3_img2,
                "Paris",
                "Romantic Europe",
                "9 days - 3 days",
                5,
                "$ 210.00",
                false
            ),
            Task3Data(
                R.drawable.task3_img3,
                "Italy",
                "Classic Italy",
                "7 days - 2 days",
                3,
                "$ 180.00",
                true
            ),
            Task3Data(
                R.drawable.task3_img4,
                "Costa Rica",
                "Grand Tour of European",
                "11 days - 4 days",
                4,
                "$ 125.00",
                true
            ),
            Task3Data(
                R.drawable.task3_img3,
                "Paris",
                "Romantic Europe",
                "9 days - 3 days",
                5,
                "$ 210.00",
                false
            ),
            Task3Data(
                R.drawable.task3_img3,
                "Italy",
                "Classic Italy",
                "7 days - 2 days",
                3,
                "$ 180.00",
                true
            ),
            Task3Data(
                R.drawable.task3_img1,
                "Costa Rica",
                "Grand Tour of European",
                "11 days - 4 days",
                4,
                "$ 125.00",
                true
            ),
            Task3Data(
                R.drawable.task3_img2,
                "Paris",
                "Romantic Europe",
                "9 days - 3 days",
                5,
                "$ 210.00",
                false
            ),
            Task3Data(
                R.drawable.task3_img3,
                "Italy",
                "Classic Italy",
                "7 days - 2 days",
                3,
                "$ 180.00",
                true
            )
        )
    }
}