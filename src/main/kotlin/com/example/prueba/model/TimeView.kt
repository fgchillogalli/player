package com.example.prueba.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table (name = "time_view")
class TimeView {
    @Id
    @Column(updatable = false)
    var hora: String? = null
    var frequency: Long? = null
}