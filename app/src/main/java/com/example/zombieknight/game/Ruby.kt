package com.example.zombieknight.game


class Ruby (
    private val platforms: List<Tile>,
    private val portals: List<Portal>,
) : Entity (VEC2(64f, 64f)){

    private val frames = loadTiles("ruby", 7)
    private val portalSound = addSound("portal_sound")

    var pos = VEC2(WINDOW_WIDTH / 2, 100f)

    var velocity = listOf(HORIZONTAL_VELOCITY, HORIZONTAL_VELOCITY).random()









    companion object{
        val VERTICAL_ACCELERATION = VEC2(0f, 3f) // gravity
    }

    }