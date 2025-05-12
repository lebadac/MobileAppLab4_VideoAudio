package com.dac.audio_video

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dac.audio_video.databinding.ItemMovieBinding
import com.squareup.picasso.Picasso

// Adapter class for displaying movies in a RecyclerView
class MovieAdapter(
    private val movies: List<Movie>,
    private val onClick: (Movie) -> Unit
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root)

    // Called when a new view holder is created. It inflates the item layout (ItemMovieBinding)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    // Called to bind data to a view holder at a specific position
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.binding.title.text = movie.title
        holder.binding.studio.text = movie.studio
        holder.binding.description.text = movie.description
        Picasso.get().load(movie.imageUrl).into(holder.binding.thumbnail)
        holder.itemView.setOnClickListener { onClick(movie) }
    }

    // Returns the number of items in the movies list
    override fun getItemCount(): Int = movies.size
}
