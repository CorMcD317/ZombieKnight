package com.example.zombieknight.game

enum class Action{
    MOVE_LEFT, MOVE_RIGHT, JUMP, FIRE, ACCEPT
}

class Input {

    private val held = mutableSetOf<Action>()

    private val pressed = mutableSetOf<Action>()

    private val isPressed = mutableSetOf<Action>()

    private val justPressed = mutableSetOf<Action>()

    private val pressAction = mutableSetOf<Action>()

    private val releaseAction = mutableSetOf<Action>()

    private val releaseAll = mutableSetOf<Action>()

    private val endTick = mutableSetOf<Action>()
}