package com.example.zombieknight.game


open class Entity(size: VEC2) {
    val rectangle = Rectangle(VEC2(0f, 0f), size)
    var texture: Texture? = null
    var flipH = false
    var currentSprite = 0f


    fun showTexture(texture: Texture){
        this.texture = texture
    }

    fun setTopLeft( pos: VEC2){
        rectangle.pos.x = pos.x
        rectangle.pos.y = pos.y
    }

    fun setBottomLeft(pos: VEC2){
        val newPos = pos - VEC2(0f, rectangle.pos.y)
        setTopLeft(newPos)
    }




}