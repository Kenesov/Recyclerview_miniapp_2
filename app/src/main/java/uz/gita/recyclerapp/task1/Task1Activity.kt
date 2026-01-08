package uz.gita.recyclerapp.task1

import android.os.Bundle
import android.text.Layout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.gita.recyclerapp.R
import uz.gita.recyclerapp.databinding.ActivityTask1Binding
import uz.gita.recyclerapp.task1.adapter.Task1Adapter
import uz.gita.recyclerapp.task1.data.Task1Data

class Task1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTask1Binding
    private lateinit var adapter: Task1Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTask1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val adapter = Task1Adapter(listAdd())
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun listAdd(): List<Task1Data> {
        return listOf(
            Task1Data(R.drawable.task1_img1, "Christina Alonso", "Check this out!", "12:01 PM", true),
            Task1Data(R.drawable.task1_img2, "Michael Smith", "Let's meet tomorrow.", "9:15 AM", false),
            Task1Data(R.drawable.task1_img3, "Jessica Lee", "I love this!", "10:45 AM", true),
            Task1Data(R.drawable.task1_img4, "Daniel Kim", "Can you send it?", "11:30 AM", false),
            Task1Data(R.drawable.task1_img5, "Olivia Brown", "See you soon!", "1:20 PM", true),
            Task1Data(R.drawable.task1_img6, "James Wilson", "Got it, thanks.", "2:10 PM", false),
            Task1Data(R.drawable.task1_img1, "Sophia Johnson", "Amazing photo!", "3:05 PM", true),
            Task1Data(R.drawable.task1_img2, "William Davis", "I'll call you.", "4:15 PM", false),
            Task1Data(R.drawable.task1_img4, "Ava Martinez", "Can't wait!", "5:00 PM", true),
            Task1Data(R.drawable.task1_img6, "Ethan Garcia", "What time?", "6:30 PM", false),
            Task1Data(R.drawable.task1_img1, "Isabella Hernandez", "LOL 😂", "7:45 PM", true),
            Task1Data(R.drawable.task1_img2, "Alexander Lopez", "Where are you?", "8:20 PM", false),
            Task1Data(R.drawable.task1_img3, "Mia Gonzalez", "Thanks a lot!", "9:10 PM", true),
            Task1Data(R.drawable.task1_img6, "Benjamin Perez", "Sure thing.", "10:05 PM", false),
            Task1Data(R.drawable.task1_img5, "Charlotte Clark", "On my way.", "11:15 PM", true),
            Task1Data(R.drawable.task1_img6, "Liam Lewis", "Good night!", "12:00 AM", false),
            Task1Data(R.drawable.task1_img3, "Amelia Walker", "See you tomorrow.", "1:05 AM", true),
            Task1Data(R.drawable.task1_img1, "Noah Hall", "Check your email.", "2:20 AM", false),
            Task1Data(R.drawable.task1_img4, "Harper Allen", "Let's go!", "3:30 AM", true),
            Task1Data(R.drawable.task1_img2, "Logan Young", "Call me.", "4:40 AM", false)
        )
    }

}