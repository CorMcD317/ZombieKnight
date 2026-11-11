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

    fun draw(surface: Surface){
        val tex = texture ?: return
        surface.drawImage(tex, rectangle, flipH)
    }

    fun animate(frames : List<Texture>, speed: Float) : Boolean {
        var finished = false
        if (currentSprite < frames.size - 1){
            currentSprite += speed
        }else {
            currentSprite = 0f
            finished = true
        }
        showTexture(frames[currentSprite.toInt()])
        return finished

    }

    fun addSound(name: String) : Sound = Assets.sound(name)


    companion object{
        const val WINDOW_WIDTH = 1280f

        const val WINDOW_HEIGHT = 736f

        fun loadFrames(folder: String, base: String, count: Int) = Assets.frames(folder, base, count)

        fun loadTiles(folder: String, count: Int) = Assets.tiles(folder, count)
    }


}