package com.decathlon.vitamin.badges

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Rect
import android.os.Build
import android.view.View
import android.view.ViewTreeObserver
import android.widget.FrameLayout
import androidx.annotation.NonNull
import androidx.annotation.RequiresApi
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.badge.BadgeUtils

object VitaminBadgesDrawable {
    private const val VTMN_MAX_CHAR = 3

    //region accent
    fun accentNoText(context: Context, maxCharacterCount: Int = VTMN_MAX_CHAR) =
        vitaminBadgeImpl(context, maxCharacterCount, R.xml.vtmn_badge_accent_medium_style)

    fun accentMedium(context: Context, maxCharacterCount: Int = VTMN_MAX_CHAR) =
        vitaminBadgeImpl(context, maxCharacterCount, R.xml.vtmn_badge_accent_medium_style)

    //endregion
    //region alert
    fun alertNoText(context: Context, maxCharacterCount: Int = VTMN_MAX_CHAR) =
        vitaminBadgeImpl(context, maxCharacterCount, R.xml.vtmn_badge_alert_medium_style)

    fun alertMedium(context: Context, maxCharacterCount: Int = VTMN_MAX_CHAR) =
        vitaminBadgeImpl(context, maxCharacterCount, R.xml.vtmn_badge_alert_medium_style)

    //endregion

    //region brand
    fun brandNoText(context: Context, maxCharacterCount: Int = VTMN_MAX_CHAR) =
        vitaminBadgeImpl(context, maxCharacterCount, R.xml.vtmn_badge_brand_medium_style)

    fun brandMedium(context: Context, maxCharacterCount: Int = VTMN_MAX_CHAR) =
        vitaminBadgeImpl(context, maxCharacterCount, R.xml.vtmn_badge_brand_medium_style)

    //endregion

    //region default
    fun defaultNoText(context: Context, maxCharacterCount: Int = VTMN_MAX_CHAR) =
        vitaminBadgeImpl(context, maxCharacterCount, R.xml.vtmn_badge_default_medium_style)

    fun defaultMedium(context: Context, maxCharacterCount: Int = VTMN_MAX_CHAR) =
        vitaminBadgeImpl(context, maxCharacterCount, R.xml.vtmn_badge_default_medium_style)

    //endregion

    //region reversed
    fun reversedNoText(context: Context, maxCharacterCount: Int = VTMN_MAX_CHAR) =
        vitaminBadgeImpl(context, maxCharacterCount, R.xml.vtmn_badge_reversed_medium_style)

    fun reversedMedium(context: Context, maxCharacterCount: Int = VTMN_MAX_CHAR) =
        vitaminBadgeImpl(context, maxCharacterCount, R.xml.vtmn_badge_reversed_medium_style)

    //endregion
    private fun vitaminBadgeImpl(
        context: Context,
        maxCharacterCount: Int = VTMN_MAX_CHAR,
        resource: Int
    ) =
        BadgeDrawable.createFromResource(context, resource)
            .apply {
                this.maxCharacterCount = maxCharacterCount
            }

    @RequiresApi(Build.VERSION_CODES.M)
    fun BadgeDrawable.attachBadgeDrawable(@NonNull anchor: View, @NonNull parent: FrameLayout) {
        anchor.viewTreeObserver.addOnGlobalLayoutListener(object :
                ViewTreeObserver.OnGlobalLayoutListener {
                @SuppressLint("UnsafeExperimentalUsageError")
                override fun onGlobalLayout() {
                    val badgeBounds = Rect()
                    parent.getDrawingRect(badgeBounds)
                    this@attachBadgeDrawable.bounds = badgeBounds

                    BadgeUtils.attachBadgeDrawable(this@attachBadgeDrawable, anchor)
                    anchor.overlay.add(this@attachBadgeDrawable)
                    anchor.foreground = this@attachBadgeDrawable
                    anchor.viewTreeObserver.removeOnGlobalLayoutListener(this)
                }
            })
    }
}
