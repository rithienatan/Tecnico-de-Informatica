algoritmo "Serie B"

var
D:INTEIRO
S,N:REAL
inicio
N<-2
PARA D DE 3 ATE 24 PASSO 3 FACA
    ESCREVAL(N, "/" , D)
    S<- S+N/D
    N<- N*2
FIMPARA
ESCREVAL("RESULTADO", S)
fimalgoritmo

