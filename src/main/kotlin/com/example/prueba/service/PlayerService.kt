package com.example.prueba.service

import com.example.prueba.DTO.CanchaDto
import com.example.prueba.model.CanchaView
import com.example.prueba.model.TimeView
import com.example.prueba.model.PlayerModel
import com.example.prueba.repository.CanchaViewRepository
import com.example.prueba.repository.TimeViewRepository
import com.example.prueba.repository.PlayerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class PlayerService {
    @Autowired
    lateinit var playerRepository: PlayerRepository

    @Autowired
    lateinit var timeViewRepository: TimeViewRepository

    @Autowired
    lateinit var canchaViewRepository: CanchaViewRepository

    fun lisCanchaView ():List<CanchaView>{
        return canchaViewRepository.findAll()
    }

    fun listTimeView ():List<TimeView>{
        return timeViewRepository.findAll()
    }

    fun getPlayer():List<PlayerModel>{
        return playerRepository.findAll()
    }

    fun save(playerModel: PlayerModel):PlayerModel{
        try{
            playerModel.nombre?.takeIf { it.trim().isNotEmpty() }
                ?: throw Exception ("Deve ingresar el nombre del jugador")

            playerModel.cancha?.takeIf { it.trim().isNotEmpty() }
                ?: throw Exception ("Deve ingresar el nombre de la cancha")
        }
        catch (ex: Exception){
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message, ex
            )
        }
        return playerRepository.save(playerModel)
    }



}