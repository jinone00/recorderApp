package com.example.part2.chapter2

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class WaveformView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): View(context, attrs, defStyleAttr) {

    val rectF = RectF(20f, 30f, 20f + 30f, 30f + 60f)
    val redPaint = Paint().apply{
        color = Color.RED
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawRect(rectF, redPaint)
    }

    fun addAmplitude(maxAmplitude: Float){
        rectF.top = 0f
        rectF.bottom = maxAmplitude
        rectF.left = 0f
        rectF.right = rectF.left + 20f

        invalidate()
    }


}