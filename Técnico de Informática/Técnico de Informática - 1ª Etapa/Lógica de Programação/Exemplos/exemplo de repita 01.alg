algoritmo "exercício 1"
var
kg,h,imc,q:real
resposta:literal
X: inteiro
inicio
   repita
      escreval ("Boa tarde!! ")
      escreval ("altura")
      leia(h)
      escreval ("peso")
      leia(kg)
      imc<-kg/h^2
      escreval("inídice de massa corporal",imc)
       se (imc<18) entao
         escreval("abaixo do peso")
       fimse
       se (imc>=18) e (imc<=29) entao
         escreval("peso normal")
       fimse
       se (imc>=30) entao
         escreval("obeso")
         q<-q+1
         escreval("qunatidade de pessoas obesas",q)
       fimse
      escreval ("deseja cadastrar mais dados? s/n")
      leia(resposta)
   ate (resposta="n")
fimalgoritmo
