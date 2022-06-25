# Spring-EBanking-REST
Spring based project of E-Banking REST app

API prefix : /api/v1

List of account endpoints :
+ [GET] /account/balance -> To check current account balance
+ [GET] /account/history -> To view list of transaction history
+ [POST] /account/deposit -> To increase current account balance by specified amount
+ [POST] /account/withdraw -> To decrease current account balance by specified amount
+ [POST] /account/transfer -> To transfer specified amount to other banks account and decrease account balance by transfered amount
