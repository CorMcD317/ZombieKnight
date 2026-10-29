package com.example.zombieknight.game

class Portal (
    pos: VEC2,
    color: String
): Entity(VEC2(72f, 72f)){

    init{
        currentSprite = 0F
        showTexture("")
        setBottomLeft(pos)
    }
    fun update(){
        
    }


}