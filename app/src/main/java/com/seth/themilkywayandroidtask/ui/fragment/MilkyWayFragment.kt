package com.seth.themilkywayandroidtask.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.seth.themilkywayandroidtask.R
import com.seth.themilkywayandroidtask.databinding.FragmentMilkyWayBinding
import com.seth.themilkywayandroidtask.model.Item
import com.seth.themilkywayandroidtask.model.MilkyWayImage
import com.seth.themilkywayandroidtask.ui.adapter.MilkyWayAdapter
import com.seth.themilkywayandroidtask.ui.viewmodel.MilkyWayViewModel
import com.seth.themilkywayandroidtask.utils.NetworkResource
import com.seth.themilkywayandroidtask.utils.toast
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MilkyWayFragment : Fragment(R.layout.fragment_milky_way) {

    private lateinit var binding: FragmentMilkyWayBinding
    private val viewModel: MilkyWayViewModel by viewModels()
    private var milkWayAdapter =
        MilkyWayAdapter { milkyWayImage: MilkyWayImage ->
            navigate(
                milkyWayImage
            )
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMilkyWayBinding.bind(view)
        lifecycleScope.launch {
            viewModel.getMilkyWayImages().collectLatest { it ->
                when (it) {
                    is NetworkResource.Success -> {
                        binding.progressCircular.isVisible = false
                        binding.apply {
                            val milkyWayImageList = ArrayList<MilkyWayImage>()

                            val itemsList: List<Item> = it.value.collection.items.map {
                                Item(
                                    data = it.data,
                                    href = it.href,
                                    links = it.links
                                )
                            }
                            for (item in itemsList) {
                                val milkyWayImage = MilkyWayImage(
                                    description = item.data[0].description,
                                    title = item.data[0].title,
                                    imageUrl = item.links[0].href,
                                    date = item.data[0].date_created,
                                    center = item.data[0].center
                                )
                                milkyWayImageList.add(milkyWayImage)
                            }
                            binding.milkyWayImageList.layoutManager = LinearLayoutManager(context)
                            binding.milkyWayImageList.adapter = milkWayAdapter
                            milkWayAdapter.milkyWayImages = milkyWayImageList
                        }
                    }
                    is NetworkResource.Failure -> {
                        binding.progressCircular.isVisible = false
                        requireContext().toast("There was an error loading the milky way Images, please check your connection")
                    }
                    is NetworkResource.Loading -> {
                        binding.progressCircular.isVisible = true
                    }
                }

            }
        }
    }

    private fun navigate(milkyWayImage: MilkyWayImage) {
        binding.root.findNavController()
            .navigate(
                MilkyWayFragmentDirections.toMilkyWayDetailsFragment(
                    milkyWayImage
                )
            )
    }


}