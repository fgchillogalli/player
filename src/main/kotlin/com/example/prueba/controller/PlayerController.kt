package com.example.prueba.controller

import com.example.prueba.model.CanchaView
import com.example.prueba.model.TimeView
import com.example.prueba.model.PlayerModel
import com.example.prueba.service.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/player")
class PlayerController {
    @Autowired
    lateinit var playerService: PlayerService

    @PostMapping
    fun save(@RequestBody playerModel: PlayerModel):PlayerModel{
        return playerService.save(playerModel)
    }

    @GetMapping
    fun getPlayer():List<PlayerModel>{
        return playerService.getPlayer()
    }

    @GetMapping("/frequency/time")
    fun listTimeView (): List<TimeView>?{
        return playerService.listTimeView()
    }

    @GetMapping("frequency/cancha")
    fun listCanchaView (): List<CanchaView>?{
        return playerService.lisCanchaView()
    }

}