algoritmo "venda"

var
preco,resultado,total,q:real
I:inteiro

inicio

para I de 1 ate 3 passo 1 faca
 escreval("preço do produto")
 leia(preco)
 escreval("quantidade do produto")
 leia(q)
 resultado <- q * preco
 escreval(q, "x" , preco, "=" , resultado)
 total <- total + resultado
fimpara
escreva ("total a pagar",total)

fimalgoritmo
