algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 30/05/2014
// Se��o de Declara��es 
var
poupanca,fundoderendafixa,valorp,correcaorf :real
codigo :Caracter
inicio
escreval("codigo")
leia(codigo)
escreval("quantidade de poupanca")
leia(poupanca)
escreval("fundoderendafixa")
leia(fundoderendafixa)
se (codigo="1") entao
valorp<- poupanca*1/100
escreval("resultado", valorp)
fimse
se (codigo="2") entao
correcaorf<- fundoderendafixa*2.5/100
escreval("resultado", correcaorf)
fimse

// Se��o de Comandos 
fimalgoritmo
