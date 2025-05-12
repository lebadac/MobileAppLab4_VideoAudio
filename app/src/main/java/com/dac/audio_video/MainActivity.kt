package com.dac.audio_video

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// Main activity that shows a list of movies and plays a video when clicked
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    // Called when the activity is first created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = MovieAdapter(MovieList.getMovies()) { movie ->
            val intent = Intent(this, VideoPlayerActivity::class.java)
            intent.putExtra("VIDEO_URL", movie.videoUrl)
            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }
}
