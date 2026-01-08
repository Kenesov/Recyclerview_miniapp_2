package uz.gita.recyclerapp.task2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import uz.gita.recyclerapp.R
import uz.gita.recyclerapp.databinding.ActivityTask2Binding
import uz.gita.recyclerapp.task2.adapter.Task2Adapter
import uz.gita.recyclerapp.task2.data.Task2Data

class Task2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTask2Binding
    private lateinit var adapter: Task2Adapter
    private val list = ArrayList<Task2Data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTask2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        addList()

        adapter = Task2Adapter(list)
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = adapter
    }

    private fun addList() {
        val colors = listOf(
            ContextCompat.getColor(this, R.color.task2_cart1_color),
            ContextCompat.getColor(this, R.color.task2_cart2_color),
            ContextCompat.getColor(this, R.color.task2_cart3_color)
        )

        list.add(Task2Data(colors[0], "XXXX    XXXX    XXXX    3213", "23/12", "$350"))
        list.add(Task2Data(colors[1], "XXXX    XXXX    XXXX    6543", "24/12", "$420"))
        list.add(Task2Data(colors[2], "XXXX    XXXX    XXXX    9876", "25/12", "$510"))
        list.add(Task2Data(colors[0], "XXXX    XXXX    XXXX    4321", "26/12", "$300"))
        list.add(Task2Data(colors[1], "XXXX    XXXX    XXXX    8765", "27/12", "$600"))
        list.add(Task2Data(colors[2], "XXXX    XXXX    XXXX    1357", "28/12", "$450"))
        list.add(Task2Data(colors[0], "XXXX    XXXX    XXXX    2468", "29/12", "$390"))
        list.add(Task2Data(colors[1], "XXXX    XXXX    XXXX    9753", "30/12", "$720"))
        list.add(Task2Data(colors[2], "XXXX    XXXX    XXXX    8642", "31/12", "$580"))
        list.add(Task2Data(colors[0], "XXXX    XXXX    XXXX    1597", "01/01", "$310"))
    }
}
