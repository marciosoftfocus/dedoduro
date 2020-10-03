package br.com.softfocus.dedoduro.exception

import org.springframework.http.HttpStatus

class ApiError(
    var status: HttpStatus = HttpStatus.INTERNAL_SERVER_ERROR,
    var message: String = "",
    var errors: MutableList<String> = mutableListOf()) {

    constructor(ex : ExpectedException) : this() {
        this.status = HttpStatus.UNPROCESSABLE_ENTITY
        this.message = ex.message?:""
        this.errors = ex.erros
    }

    constructor(ex : Exception) : this() {
        this.status = HttpStatus.INTERNAL_SERVER_ERROR
        this.message = ex.message?:""
        ex.stackTrace.forEach {
            this.errors.add(it.toString())
        }
    }
}