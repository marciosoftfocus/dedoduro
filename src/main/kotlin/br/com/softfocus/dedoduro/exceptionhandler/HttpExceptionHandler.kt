package br.com.softfocus.dedoduro.exceptionhandler

import br.com.softfocus.dedoduro.exception.ApiError
import br.com.softfocus.dedoduro.exception.ExpectedException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class HttpExceptionHandler :  ResponseEntityExceptionHandler() {

    @ExceptionHandler(value = [ExpectedException::class, Exception::class])
    protected fun handleConflict(ex: Exception, request: WebRequest): ResponseEntity<Any> {
        if (ex is ExpectedException) {
            return ResponseEntity(ApiError(ex), HttpStatus.UNPROCESSABLE_ENTITY)
        }
        return ResponseEntity(ApiError(ex), HttpStatus.INTERNAL_SERVER_ERROR)
    }

}