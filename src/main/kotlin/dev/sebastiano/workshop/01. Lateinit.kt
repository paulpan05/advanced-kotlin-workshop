package dev.sebastiano.workshop

internal class LateInit {

    private lateinit var _fruit: String

    var fruit: String?
        get() {
            return if (::_fruit.isInitialized) {
                _fruit
            } else {
                null
            }
        }
        set(value) {
            _fruit = value ?: throw IllegalArgumentException()
        }

    fun performSomeWork(): String = "Here's something for ya: $_fruit"
}
