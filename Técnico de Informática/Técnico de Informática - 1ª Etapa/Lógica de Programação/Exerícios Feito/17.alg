algoritmo "PS4 =D"
var
P, Q, PT, D, VD: real
inicio
escreva("o pre�o do produto")
leia(P)
escreva("a quatidade de produto")
leia(Q)
escreva("pre�o total")
PT<-P*Q
se(PT>50) entao
   D<-PT*10/100
   escreva("valor do desconto",D)
   escreva("valor com desconto", VD)
    VD<- PT-D
fimse
// Se��o de Comandos
fimalgoritmo
