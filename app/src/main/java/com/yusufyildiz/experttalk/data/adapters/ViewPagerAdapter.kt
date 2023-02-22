package com.yusufyildiz.experttalk.data.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.animation.fadeIn
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.yusufyildiz.experttalk.R
import com.yusufyildiz.experttalk.data.model.IntroPageModel
import com.yusufyildiz.experttalk.databinding.ItemViewPagerBinding

class ViewPagerAdapter(
    val introPageModelList: ArrayList<IntroPageModel>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    class ViewPagerViewHolder(val binding: ItemViewPagerBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val binding =
            ItemViewPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewPagerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return introPageModelList.size
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val currentImage = introPageModelList[position].image
        if(position == 0){

        }
        with(holder.binding) {
            imageView.setImageResource(currentImage)
            titleTextView.text = introPageModelList[position].title.toString()
            descriptionTextView.text = introPageModelList[position].description.toString()
        }
    }

    fun updateItems(newList: ArrayList<IntroPageModel>){
        introPageModelList.clear()
        introPageModelList.addAll(newList)
        notifyDataSetChanged()
    }


}