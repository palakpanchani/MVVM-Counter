package com.example.MVVMCompose.data

class CounterRepository {

    private var count = 0

    fun getCount(): Int = count

    fun increment(): Int {
        count++
        return count
    }

    fun decrement(): Int {
        count--
        return count
    }
}