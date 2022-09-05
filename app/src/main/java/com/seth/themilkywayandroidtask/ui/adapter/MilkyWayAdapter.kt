package com.seth.themilkywayandroidtask.ui.adapter

import android.graphics.drawable.Drawable
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.seth.themilkywayandroidtask.R
import com.seth.themilkywayandroidtask.databinding.MilkywayItemBinding
import com.seth.themilkywayandroidtask.model.MilkyWayImage
import com.seth.themilkywayandroidtask.utils.formatDate

class MilkyWayAdapter(private val navigate: (MilkyWayImage) -> Unit) :
    RecyclerView.Adapter<MilkyWayAdapter.MilkyWayViewHolder>() {

    var milkyWayImages: List<MilkyWayImage> = emptyList()
        set(value) {
            field = value

            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MilkyWayViewHolder {
        val withDataBinding: MilkywayItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.milkyway_item,
            parent,
            false
        )
        return MilkyWayViewHolder(withDataBinding)
    }

    override fun getItemCount() = milkyWayImages.size


    override fun onBindViewHolder(holder: MilkyWayViewHolder, position: Int) {
        holder.viewDataBinding.also {
            milkyWayImages[position]
        }
        holder.bind(milkyWayImages[position])

    }


    inner class MilkyWayViewHolder(val viewDataBinding: MilkywayItemBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root) {

        fun bind(milkyWayImage: MilkyWayImage) {
            viewDataBinding.apply {
                milkyWayTitleTv.text = milkyWayImage.title
                milkyWayCenterTv.text = milkyWayImage.center
                milkyWayDateTv.text = milkyWayImage.date
                loadImage(this, milkyWayImage)
                root.setOnClickListener {
                    navigate.invoke(milkyWayImage)
                }
            }

        }

        private fun loadImage(binding: MilkywayItemBinding, milkyWayImageRes: MilkyWayImage) {

            val picture = milkyWayImageRes.imageUrl

            binding.apply {
                Glide.with(root)
                    .load(picture)
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .listener(object : RequestListener<Drawable> {
                        override fun onLoadFailed(
                            e: GlideException?,
                            model: Any?,
                            target: Target<Drawable>?,
                            isFirstResource: Boolean
                        ): Boolean {
                            progressCircular.isVisible = false
                            return false
                        }

                        override fun onResourceReady(
                            resource: Drawable?,
                            model: Any?,
                            target: Target<Drawable>?,
                            dataSource: DataSource?,
                            isFirstResource: Boolean
                        ): Boolean {
                            progressCircular.isVisible = false
                            return false
                        }

                    })
                    .into(milkyWayImage)

            }
        }

    }
}