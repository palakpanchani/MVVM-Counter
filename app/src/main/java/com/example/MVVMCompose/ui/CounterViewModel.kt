package com.example.MVVMCompose.ui

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import com.example.MVVMCompose.data.CounterRepository

class CounterViewModel : ViewModel() {

    private val repository = CounterRepository()

    private val _count = mutableStateOf(repository.getCount())
    val count: State<Int> = _count

    fun increment() {
        _count.value = repository.increment()
    }

    fun decrement() {
        _count.value = repository.decrement()
    }
}