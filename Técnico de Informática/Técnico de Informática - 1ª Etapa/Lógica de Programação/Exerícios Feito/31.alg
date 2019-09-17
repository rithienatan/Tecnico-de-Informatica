algoritmo "Serie B"

var
D:INTEIRO
S,N:REAL
inicio
N<-1
PARA D DE 1 ATE 10 PASSO 1 FACA
    ESCREVAL(N, "/" , D)
    S<- S+N/D
    D<-D+1
    N<- D^2
FIMPARA
ESCREVAL("RESULTADO", S)
fimalgoritmo

