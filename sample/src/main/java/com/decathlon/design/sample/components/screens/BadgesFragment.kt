package com.decathlon.design.sample.components.screens

import android.os.Build
import android.os.Bundle
import android.view.*
import com.decathlon.design.sample.R
import com.decathlon.design.sample.databinding.FragmentBadgesBinding
import com.decathlon.vitamin.badges.VitaminBadgesDrawable
import com.decathlon.vitamin.badges.VitaminBadgesDrawable.attachBadgeDrawable
import com.google.android.material.badge.BadgeUtils

class BadgesFragment : ComponentFragment() {

    private lateinit var binding: FragmentBadgesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBadgesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_topbar, menu)
    }

    @com.google.android.material.badge.ExperimentalBadgeUtils
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val accentBadge = VitaminBadgesDrawable.accentMedium(requireContext())
        BadgeUtils.attachBadgeDrawable(accentBadge, binding.accentTopBar, R.id.no_text_notification)
        val alertBadge = VitaminBadgesDrawable.defaultMedium(requireContext()).apply { number = 10 }
        BadgeUtils.attachBadgeDrawable(alertBadge, binding.accentTopBar, R.id.small_notification)
        val brandBadge = VitaminBadgesDrawable.brandMedium(requireContext()).apply { number = 100 }
        BadgeUtils.attachBadgeDrawable(brandBadge, binding.accentTopBar, R.id.medium_notification)
        val defaultBadge = VitaminBadgesDrawable.alertMedium(requireContext()).apply { number = 1 }
        BadgeUtils.attachBadgeDrawable(defaultBadge, binding.accentTopBar, R.id.large_notification)

        setupAccentBadges()
        setupBrandBadges()
        setupAlertBadges()
        setupDefaultBadges()
        setupReversedBadges()
    }

    private fun setupAccentBadges() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            val accentLarge = VitaminBadgesDrawable.accentLarge(requireContext()).apply { number = 100 }
//            accentLarge.attachStandaloneTo(
//                binding.accentLarge.iconImageView,
//                binding.accentLarge.parentFrame
//            )

            val accentMedium = VitaminBadgesDrawable.accentMedium(requireContext()).apply { number = 10 }
            accentMedium.attachBadgeDrawable(
                binding.accentMedium.iconImageView,
                binding.accentMedium.parentFrame
            )

//            val accentSmall = VitaminBadgesDrawable.accentSmall(requireContext()).apply { number = 1 }
//            accentSmall.attachStandaloneTo(
//                binding.accentSmall.iconImageView,
//                binding.accentSmall.parentFrame
//            )

            val accentNoText = VitaminBadgesDrawable.accentNoText(requireContext())
            accentNoText.attachBadgeDrawable(
                binding.accentNotText.iconImageView,
                binding.accentNotText.parentFrame
            )
        }
    }

    private fun setupBrandBadges() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            val brandLarge = VitaminBadgesDrawable.brandLarge(requireContext()).apply { number = 100 }
//            brandLarge.attachStandaloneTo(
//                binding.brandLarge.iconImageView,
//                binding.brandLarge.parentFrame
//            )

            val brandMedium = VitaminBadgesDrawable.brandMedium(requireContext()).apply { number = 10 }
            brandMedium.attachBadgeDrawable(
                binding.brandMedium.iconImageView,
                binding.brandMedium.parentFrame
            )

//            val brandSmall = VitaminBadgesDrawable.brandSmall(requireContext()).apply { number = 1 }
//            brandSmall.attachStandaloneTo(
//                binding.brandSmall.iconImageView,
//                binding.brandSmall.parentFrame
//            )

            val brandNoText = VitaminBadgesDrawable.brandNoText(requireContext())
            brandNoText.attachBadgeDrawable(
                binding.brandNotText.iconImageView,
                binding.brandNotText.parentFrame
            )
        }
    }

    private fun setupAlertBadges() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            val alertLarge = VitaminBadgesDrawable.alertLarge(requireContext()).apply { number = 100 }
//            alertLarge.attachStandaloneTo(
//                binding.alertLarge.iconImageView,
//                binding.alertLarge.parentFrame
//            )

            val alertMedium = VitaminBadgesDrawable.alertMedium(requireContext()).apply { number = 10 }
            alertMedium.attachBadgeDrawable(
                binding.alertMedium.iconImageView,
                binding.alertMedium.parentFrame
            )

//            val alertSmall = VitaminBadgesDrawable.alertSmall(requireContext()).apply { number = 1 }
//            alertSmall.attachStandaloneTo(
//                binding.alertSmall.iconImageView,
//                binding.alertSmall.parentFrame
//            )

            val alertNoText = VitaminBadgesDrawable.alertNoText(requireContext())
            alertNoText.attachBadgeDrawable(
                binding.alertNotText.iconImageView,
                binding.alertNotText.parentFrame
            )
        }
    }

    private fun setupDefaultBadges() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            val defaultLarge = VitaminBadgesDrawable.defaultLarge(requireContext()).apply { number = 100 }
//            defaultLarge.attachStandaloneTo(
//                binding.defaultLarge.iconImageView,
//                binding.defaultLarge.parentFrame
//            )

            val defaultMedium = VitaminBadgesDrawable.defaultMedium(requireContext()).apply { number = 10 }
            defaultMedium.attachBadgeDrawable(
                binding.defaultMedium.iconImageView,
                binding.defaultMedium.parentFrame
            )

//            val defaultSmall = VitaminBadgesDrawable.defaultSmall(requireContext()).apply { number = 1 }
//            defaultSmall.attachStandaloneTo(
//                binding.defaultSmall.iconImageView,
//                binding.defaultSmall.parentFrame
//            )

            val defaultNoText = VitaminBadgesDrawable.defaultNoText(requireContext())
            defaultNoText.attachBadgeDrawable(
                binding.defaultNotText.iconImageView,
                binding.defaultNotText.parentFrame
            )
        }
    }

    private fun setupReversedBadges() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            val reversedLarge = VitaminBadgesDrawable.reversedLarge(requireContext()).apply { number = 100 }
//            reversedLarge.attachStandaloneTo(
//                binding.reversedLarge.iconImageView,
//                binding.reversedLarge.parentFrame
//            )

            val reversedMedium = VitaminBadgesDrawable.reversedMedium(requireContext()).apply { number = 10 }
            reversedMedium.attachBadgeDrawable(
                binding.reversedMedium.iconImageView,
                binding.reversedMedium.parentFrame
            )

//            val reversedSmall = VitaminBadgesDrawable.reversedSmall(requireContext()).apply { number = 1 }
//            reversedSmall.attachStandaloneTo(
//                binding.reversedSmall.iconImageView,
//                binding.reversedSmall.parentFrame
//            )

            val reversedNoText = VitaminBadgesDrawable.reversedNoText(requireContext())
            reversedNoText.attachBadgeDrawable(
                binding.reversedNotText.iconImageView,
                binding.reversedNotText.parentFrame
            )
        }
    }
}
