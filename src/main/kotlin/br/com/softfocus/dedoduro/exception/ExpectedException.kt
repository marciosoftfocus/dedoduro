package br.com.softfocus.dedoduro.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
class ExpectedException(mensagem : String) : Exception(mensagem) {

    var erros = mutableListOf<String>()

    constructor(mensagem: String, erros : MutableList<String>) : this(mensagem) {
        this.erros = erros
    }

}