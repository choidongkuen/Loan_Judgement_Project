package com.example.api.loan.request

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// 대출 심사 요청하는 클래스
@RestController
@RequestMapping("/loan/api/v1")
class LoanRequestController(
        private val loanRequestServiceImpl: LoanRequestServiceImpl
) {

    @PostMapping("/request")
    fun loanRequest(
            @RequestBody loanRequestInputDto: LoanRequestDto.LoanRequestInputDto
    ): ResponseEntity<LoanRequestDto.LoanRequestResponseDto> {
        return ResponseEntity.ok(
                loanRequestServiceImpl.loanRequestMain(loanRequestInputDto)
        )
    }
}