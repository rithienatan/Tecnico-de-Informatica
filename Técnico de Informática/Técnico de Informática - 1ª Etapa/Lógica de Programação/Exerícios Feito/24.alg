algoritmo "exercício 4"

var
s,abono,t: real
nome:caracter
inicio
escreval("funcionário")
leia(nome)
escreval("tempo de serviço")
leia(t)
escreval("informe o Salário")
leia(S)

   se (t>=1)e(t<=10) entao
     abono<-S*1/10
     senao
      se(t>10) entao
      abono<-S*25/100
     fimse
    fimse
escreval("salário com abono R$ ", abono)
// Seção de Comandos 
fimalgoritmo
