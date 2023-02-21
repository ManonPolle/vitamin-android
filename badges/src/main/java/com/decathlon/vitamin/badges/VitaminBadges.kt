package com.decathlon.vitamin.badges

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel
import com.google.android.material.textview.MaterialTextView


open class VitaminBadge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnBadgeBrandMediumStyle
) : MaterialTextView(context, attrs, defStyleAttr) {
    init {
        val shapeAppearanceModel = ShapeAppearanceModel()
            .toBuilder()
            .setAllCorners(
                CornerFamily.ROUNDED,
                context.resources.getDimension(R.dimen.vtmn_radius_200)
            )
            .build()
        val shapeDrawable = MaterialShapeDrawable(shapeAppearanceModel)
    }
}
