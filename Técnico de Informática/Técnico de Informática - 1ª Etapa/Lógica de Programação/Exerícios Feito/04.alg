algoritmo "exerc�cio 4"

var
s,t,abono: real
nome:caracter

inicio
escreval("funcion�rio")
leia(nome)
escreval("tempo de servi�o")
leia(t)
escreval("informe o Sal�rio")
leia(s)

se (t>=1)e(t<10) entao
abono<-s*1/10

senao se(t>=10) entao
abono<-s*25/100

fimse

escreval("sal�rio com abono R$ ", abono)
// Se��o de Comandos 
fimalgoritmo
