algoritmo "exercicio 5"

var
b:real
x:inteiro
inicio
escreval("quantidade de pe�as")
leia(x)
   se (x<=100) entao
   b<-(x-100)*0.00
   senao se (x>100) e (x<=120) entao
   b<-(x-100)*1.00
   fimse
   se (x>120) e (x<=150) entao
   b<-(x-100)*1.10
   senao se (x>150) entao
   b<-(x-100)*1.20
   fimse
escreval("b�nus semanal",b)
fimalgoritmo
