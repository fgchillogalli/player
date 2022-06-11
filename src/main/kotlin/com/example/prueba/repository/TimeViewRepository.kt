package com.example.prueba.repository

import com.example.prueba.model.TimeView
import org.springframework.data.jpa.repository.JpaRepository

interface TimeViewRepository:JpaRepository<TimeView,String> {
}