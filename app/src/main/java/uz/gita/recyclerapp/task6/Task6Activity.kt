package uz.gita.recyclerapp.task6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.gita.recyclerapp.R
import uz.gita.recyclerapp.databinding.ActivityTask6Binding
import uz.gita.recyclerapp.task6.adapter.Task6Adapter
import uz.gita.recyclerapp.task6.data.Task6Data

class Task6Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTask6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTask6Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val adapter = Task6Adapter(getTask6List())
        binding.recyclerView.adapter = adapter

    }
    private fun getTask6List(): List<Task6Data> {
        return listOf(
            Task6Data(
                image = R.drawable.img_1,
                dec = "Swiping right for everything",
                name = "Miranda West",
                nickName = "@miranda",
                userImage = R.drawable.task1_img2
            ),
            Task6Data(
                image = R.drawable.img_3,
                dec = "Today sunset was so beautiful",
                name = "Carly Jones",
                nickName = "@carlyjo",
                userImage = R.drawable.task1_img1
            ),
            Task6Data(
                image = R.drawable.img_2,
                dec = "You can always lean on me",
                name = "LindaYSL",
                nickName = "@linda",
                userImage = R.drawable.task1_img3
            ),
            Task6Data(
                image = R.drawable.img_4,
                dec = "Ready for this summer 😎",
                name = "Jane Alexis",
                nickName = "@jane",
                userImage = R.drawable.task1_img4
            ),
            Task6Data(
                image = R.drawable.img_1,
                dec = "Shopping spree today!",
                name = "Emily Clark",
                nickName = "@emilyc",
                userImage = R.drawable.task1_img6
            ),
            Task6Data(
                image = R.drawable.img_2,
                dec = "Best coffee in town ☕",
                name = "Tom Hardy",
                nickName = "@tommy",
                userImage = R.drawable.task1_img3
            )
        )
    }

}