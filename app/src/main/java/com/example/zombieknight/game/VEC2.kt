package com.example.zombieknight.game

class VEC2(var x: Float, var y: Float){
    operator fun plus(other: VEC2) = VEC2 (x + other.x, y + other.y)
    operator fun minus(other: VEC2) = VEC2(x - other.x, y - other.y)
    operator fun unaryMinus() = VEC2(-x, -y)
    operator fun times(k: Float) = VEC2(x * k, y * k)
    override fun toString() = "($x, $y)"
    }

operator fun Float.times(v: VEC2) = VEC2(v.x * this, v.y * this)

    fun main() {
        var x = VEC2(3.0f,4.0f)
        var y = VEC2(5.0f, 8.0f)
        var sum = x + y
        var product = x * 2.0f
        var otherProduct = 3.0f * x
        println(x)

}

