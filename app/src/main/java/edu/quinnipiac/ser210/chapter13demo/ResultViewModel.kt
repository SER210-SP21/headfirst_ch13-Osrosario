package edu.quinnipiac.ser210.chapter13demo

import androidx.lifecycle.ViewModel

class ResultViewModel(finalResult: String) : ViewModel()
{
    val result = finalResult
}