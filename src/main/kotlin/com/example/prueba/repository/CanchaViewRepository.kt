package com.example.prueba.repository

import com.example.prueba.model.CanchaView
import org.springframework.data.jpa.repository.JpaRepository

interface CanchaViewRepository:JpaRepository<CanchaView, String> {
}