algoritmo "Peso ideal"
// Fun��o :
// Autor :
// Data : 27/05/2014
// Se��o de Declara��es 
var
H, pesoi:real
sexo: caracter
inicio
escreval("altura")
leia(H)
escreval("sexo")
leia(sexo)
se (sexo="F") entao
pesoi<-(62.1*H)-44.7
senao
pesoi<-(72.7*H)-58
escreval("peso ideal",pesoi)
fimse

// Se��o de Comandos
fimalgoritmo
