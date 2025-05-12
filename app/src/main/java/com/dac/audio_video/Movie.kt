package com.dac.audio_video

// Data class representing a Movie
data class Movie(
    val title: String,
    val studio: String,
    val description: String,
    val videoUrl: String,
    val imageUrl: String
)

// Object that holds a list of movies
object MovieList {
    fun getMovies(): List<Movie> = listOf(
        Movie(
            title = "Big Buck Bunny",
            studio = "Blender Foundation",
            description = "A giant rabbit takes revenge on bullying creatures.",
            videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
            imageUrl = "https://peach.blender.org/wp-content/uploads/title_anouncement.jpg"
        ),
        Movie(
            title = "Sintel",
            studio = "Blender Institute",
            description = "A girl named Sintel goes on a quest to find her pet dragon.",
            videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4",
            imageUrl = "https://resizing.flixster.com/lwylYKMnTXTpfziN5lzxWbSzrGQ=/fit-in/705x460/v2/https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/p10892939_v_h9_aa.jpg"
        ),
        Movie(
            title = "Tears of Steel",
            studio = "Blender Institute",
            description = "A sci-fi team attempts to save the world from robots.",
            videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/TearsOfSteel.mp4",
            imageUrl = "https://m.media-amazon.com/images/M/MV5BNzJmMjQwOTUtZDg5OC00NDcxLTg3YzktNTU2YTIxYTRkMjA0XkEyXkFqcGc@._V1_.jpg"
        ),
        Movie(
            title = "Elephants Dream",
            studio = "Blender Foundation",
            description = "Two characters explore a strange and abstract dream world.",
            videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4",
            imageUrl = "https://i1.sndcdn.com/artworks-000005010194-jwzy1c-t500x500.jpg"
        ),
        Movie(
            title = "For Bigger Fun",
            studio = "Google",
            description = "Another sample video for fun and testing players.",
            videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4",
            imageUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/ForBiggerFun.jpg"
        )
    )
}


