algoritmo "exercício 8"

var
p,h,imc:real
inicio
escreval("peso em kg")
leia(p)
escreval("altura em m")
leia(h)
    imc<-p/h^2
escreval("índice de massa corporal",imc)

      se(imc<18.5)entao
        escreval("abaixo do peso")
        senao
         se(imc>=18.5)e(imc<=25)entao
          escreval("peso normal")
          senao
           se(imc>25)e(imc<=30)entao
           escreval("acima do peso")
           senao
            se(imc>30)entao
            escreval("obeso")
            fimse
           fimse
          fimse
         fimse



fimalgoritmo
