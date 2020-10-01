package br.com.softfocus.dedoduro.model

import javax.persistence.*

@Entity
class Reclamacao() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var codigo: Int? = null

    @Column
    var titulo : String? = null

    @Column
    var categoria : String? = null

}