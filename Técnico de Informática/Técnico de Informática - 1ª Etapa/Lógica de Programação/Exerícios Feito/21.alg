algoritmo "execicio 3"

var
SB, Q, P, SL, S, V, I:real
inicio
escreval("sal�rio fixo")
leia(S)
escreval("quantidade de produto")
leia(Q)
escreval("pre�o do produto")
leia(P)

  V<-Q*P
escreval("vendas do mes", V)

  SB<-S+V*5/100
escreval("sal�rio bruto", SB)

  I<-SB*7/100
escreval("imposto", I)

  SL<-SB-I
escreval("sal�rio liquido", SL)

// Se��o de Comandos 
fimalgoritmo
