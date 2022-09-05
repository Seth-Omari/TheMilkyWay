package com.seth.themilkywayandroidtask.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.seth.themilkywayandroidtask.R
import com.seth.themilkywayandroidtask.databinding.FragmentMilkyWayDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MilkyWayDetailsFragment : Fragment(R.layout.fragment_milky_way_details) {

    private lateinit var binding: FragmentMilkyWayDetailsBinding
    private val args = MilkyWayDetailsFragmentArgs

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMilkyWayDetailsBinding.bind(view)
        val argument = arguments?.let { args.fromBundle(it) }
        val milkyWayImage = argument?.milkyWayImage
        val toolbar = binding.toolbar as Toolbar
        toolbar.elevation = 0.0F
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        (activity as AppCompatActivity).supportActionBar!!.setHomeButtonEnabled(true)

        toolbar.setNavigationOnClickListener {
            binding.root.findNavController().navigateUp()
        }
        binding.apply {
            Glide.with(root)
                .load(milkyWayImage?.imageUrl)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(milkyWayItemImage)
        }

        binding.milkyWayImageTitleTv.text = milkyWayImage?.title
        binding.milkyWayImageDescriptionTv.text = milkyWayImage?.description
        binding.centerTv.text = milkyWayImage?.center
        binding.dateCreatedTv.text = milkyWayImage?.date

    }
}