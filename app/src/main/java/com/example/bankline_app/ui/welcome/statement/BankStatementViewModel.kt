package com.example.bankline_app.ui.welcome.statement

import com.example.bankline_app.data.BanklineRepository

class BankStatementViewModel {
    fun findBankStatement(accountHolderId: Int) =
        BanklineRepository.findBankStatement(accountHolderId)
}