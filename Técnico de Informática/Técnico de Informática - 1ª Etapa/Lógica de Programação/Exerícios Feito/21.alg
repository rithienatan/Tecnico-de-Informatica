algoritmo "execicio 3"

var
SB, Q, P, SL, S, V, I:real
inicio
escreval("salário fixo")
leia(S)
escreval("quantidade de produto")
leia(Q)
escreval("preço do produto")
leia(P)

  V<-Q*P
escreval("vendas do mes", V)

  SB<-S+V*5/100
escreval("salário bruto", SB)

  I<-SB*7/100
escreval("imposto", I)

  SL<-SB-I
escreval("salário liquido", SL)

// Seção de Comandos 
fimalgoritmo
