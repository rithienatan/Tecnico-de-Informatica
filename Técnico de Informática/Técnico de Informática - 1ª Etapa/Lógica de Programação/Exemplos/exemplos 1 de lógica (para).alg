algoritmo "exemplos 1"

var
soma,n:real
d:inteiro
inicio
  n<-2
  para d de 3 ate 24 passo 3 faca
    escreval (n,"/",d)
    soma<-soma+n/d
    n<-n*2
  fimpara
escreval("resultado",soma)
fimalgoritmo
