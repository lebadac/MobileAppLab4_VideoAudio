package com.dac.audio_video

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView

// Activity for playing a video using ExoPlayer
class VideoPlayerActivity : AppCompatActivity() {

    private lateinit var player: ExoPlayer
    private lateinit var playerView: PlayerView

    // Called when the activity is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_player)

        playerView = findViewById(R.id.player_view)

        val videoUrl = intent.getStringExtra("VIDEO_URL") ?: return

        player = ExoPlayer.Builder(this).build()
        player.setMediaItem(MediaItem.fromUri(Uri.parse(videoUrl)))
        player.prepare()
        player.play()
        playerView.player = player
    }

    // Called when the activity is stopped
    override fun onStop() {
        super.onStop()
        player.release()
    }
}
