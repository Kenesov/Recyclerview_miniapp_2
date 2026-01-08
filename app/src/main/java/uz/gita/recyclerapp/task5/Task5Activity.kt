package uz.gita.recyclerapp.task5

import android.graphics.Color
import android.os.Binder
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.gita.recyclerapp.R
import uz.gita.recyclerapp.databinding.ActivityTask5Binding
import uz.gita.recyclerapp.task4.data.Task4Data
import uz.gita.recyclerapp.task5.adapter.Task5Adapter
import uz.gita.recyclerapp.task5.data.Task5Data

class Task5Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTask5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTask5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val adapter = Task5Adapter(getTask5List())
        binding.recyclerView.adapter = adapter
        binding.btnSearch.setColorFilter(Color.BLACK)
    }
    private fun getTask5List(): List<Task5Data> {
        return listOf(
            Task5Data(R.drawable.burger, "Bacon Burger"),
            Task5Data(R.drawable.grilled_chicken, "Grilled Chicken"),
            Task5Data(R.drawable.salad, "Cheese Pizza"),
            Task5Data(R.drawable.burger, "Veggie Sandwich"),
            Task5Data(R.drawable.grilled_chicken, "Spicy Tacos"),
            Task5Data(R.drawable.salad, "Pasta Carbonara"),
            Task5Data(R.drawable.burger, "Sushi Platter"),
            Task5Data(R.drawable.grilled_chicken, "BBQ Ribs"),
            Task5Data(R.drawable.salad, "Caesar Salad"),
            Task5Data(R.drawable.burger, "Chocolate Cake")
        )
    }

}