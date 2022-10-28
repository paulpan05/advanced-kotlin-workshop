package dev.sebastiano.workshop

import dev.sebastiano.workshop.util.ValueProvider

class DelegateProperties1(private val valueProvider: ValueProvider<String>) {

    private lateinit var value: String
    val fruit: String
        get() {
            if (!::value.isInitialized) {
                value = valueProvider.provideValue()
            }
            return value
        }
}
