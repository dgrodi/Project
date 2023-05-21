package com.example.lab3project.api

import com.example.lab3project.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)