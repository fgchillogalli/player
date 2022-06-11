package com.example.prueba.repository

import com.example.prueba.DTO.CanchaDto
import com.example.prueba.model.PlayerModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface PlayerRepository: JpaRepository<PlayerModel, Long> {
    fun findByIdplayer(idplayer: Long): PlayerModel?
}