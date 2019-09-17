algoritmo "pesquisa"

var
quant,woman,men,medh,h:real
X:literal

inicio
escreval("quantidade de pessoas")
leia(quant)
escreval("sexo")
leia(X)
 escolha (X)
  caso "f"
   se (quant<=50)  entao
    woman<- 50-quant
    escreval("a quantidade de mulheres",woman)
   fimse
  caso "m"
   se (quant<=50) entao
    men<- 50-quant
     escreval("a quantidade de homens",men)
   fimse

 fimescolha
escreval("altura")
leia(h)

fimalgoritmo

