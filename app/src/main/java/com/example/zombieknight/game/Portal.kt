package com.example.zombieknight.game

class Portal (
    pos: VEC2,
    color: String
): Entity(VEC2(72f, 72f)){

    private val frames = loadTiles("portals/$color", 22)

    init{
        currentSprite = frames.indices.random().toFloat()
        showTexture("")
        setBottomLeft(pos)
    }
    fun update(){
        animate(frames, 0.2f)
    }


}