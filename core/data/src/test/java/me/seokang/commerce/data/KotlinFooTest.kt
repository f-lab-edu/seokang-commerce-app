package me.seokang.commerce.data

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class KotlinFooTest {
    private val kotlinFoo = KotlinFoo()

    @Test
    fun `partially covered hello method test`() {
        val actual = kotlinFoo.hello("펭")
        assertEquals(actual, "하")
    }
}