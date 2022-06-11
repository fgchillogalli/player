package com.example.prueba.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "player")
class PlayerModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)

    var idplayer: Long? = null
    var nombre:String? = null
    var hora: String? = null
    var cancha: String? = null
}