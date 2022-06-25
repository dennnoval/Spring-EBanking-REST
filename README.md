# Spring-EBanking-REST
Spring based project of E-Banking REST app


![E-Banking-Project-Diagram-Use-Case](https://user-images.githubusercontent.com/19941953/175778059-2d750416-6b4f-4c96-a0f9-6d31f96164fa.png)

![E-Banking-Project-Diagram-ERD](https://user-images.githubusercontent.com/19941953/175778065-c79fe121-0a1d-4464-b0dd-5f2ce923e4fc.png)




API prefix : /api/v1

List of account endpoints :
+ [GET] /account/balance -> To check current account balance
+ [GET] /account/history -> To view list of transaction history
+ [POST] /account/deposit -> To increase current account balance by specified amount
+ [POST] /account/withdraw -> To decrease current account balance by specified amount
+ [POST] /account/transfer -> To transfer specified amount to other banks account and decrease account balance by transfered amount
