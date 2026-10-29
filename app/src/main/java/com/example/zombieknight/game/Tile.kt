package com.example.zombieknight.game.Type.*

import com.example.zombieknight.game.Entity
import com.example.zombieknight.game.VEC2

enum class Type {
    EMPTY,
    DIRT,
    GROUND,
    LEFT_PLATFORM,
    CENTER_PLATFORM,
    RIGHT,PLATFORM
}


class Tile(pos: VEC2, val type: Type) : Entity(VEC2(32f, 32f)){

    val isPlatform get() = type != Type.DIRT && type != Type.EMPTY

    init{
        showTexture("")
        setTopLeft(pos)
    }


}