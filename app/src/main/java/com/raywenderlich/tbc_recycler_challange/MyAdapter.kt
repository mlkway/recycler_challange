package com.raywenderlich.tbc_recycler_challange

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.tbc_recycler_challange.databinding.AnimalItemsBinding

class MyAdapter(private val dataSet: MutableList<Animal>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = AnimalItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return  ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData()
    }

    override fun getItemCount() = dataSet.size


    inner class ViewHolder(val binding: AnimalItemsBinding ) : RecyclerView.ViewHolder(binding.root) {
        fun setData(){
            val animal = dataSet[position]
            binding.apply {
                imageView.setImageResource(animal.id)
                nameTextView.text = animal.name
                descriptionTextView.text = animal.description
            }
        }
    }


}