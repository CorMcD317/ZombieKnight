package com.example.zombieknight.game

import androidx.core.view.ViewCompat
import kotlin.math.abs

class Bullet (
 center : VEC2,
    facingLeft : Boolean = false
) : Entity(VEC2(32f,32f)){

    private  val vx: Float = if (facingLeft) - VELOCITY else VELOCITY
    private val startingX : Float
    var alive = true

    init{
        showTexture(Assets.image("player/slash.png"))
        flipH = facingLeft
        setTopLeft(center - VEC2(16f, 16f))
        startingX = rectangle.pos.x
    }

    fun update(){
        rectangle.pos.x += vx
        if(abs(rectangle.pos.x - startingX) > RANGE)
            alive = false
    }

    companion object{

        const val VELOCITY = 20f
        const val RANGE = 500f
    }

}