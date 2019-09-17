algoritmo "exercício 4"

var
s,t,abono: real
nome:caracter

inicio
escreval("funcionário")
leia(nome)
escreval("tempo de serviço")
leia(t)
escreval("informe o Salário")
leia(s)

se (t>=1)e(t<10) entao
abono<-s*1/10

senao se(t>=10) entao
abono<-s*25/100

fimse

escreval("salário com abono R$ ", abono)
// Seção de Comandos 
fimalgoritmo
