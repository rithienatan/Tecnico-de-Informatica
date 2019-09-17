algoritmo "Carga horaria de trabalho"
// Função :
// Autor :
// Data : 20/05/2014
// Seção de Declarações 
var
H, S, HT, SB, I, SL :REAL
inicio
escreva("digite a quantidade de horas")
leia(H)
escreva("Valor do salario minimo")
leia(S)
HT<-S*1/10
escreva("valor da hora trabalhada")
SB<-HT*H
escreva("valor do salario bruto")
I<-SB*3/100
escreva("valor do imposto")
SL<-SB-I
escreva("valor do salario liquido")
// Seção de Comandos 
fimalgoritmo
