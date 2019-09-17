algoritmo "exercicio 4"

var
q,s,md,st,mt:real
y,x:inteiro
inicio
para y de 1 ate 100 passo 1 faca
  escreval("insira um número")
  leia(x)
   se (x>0) entao
   q<-q+1
   s<-s+x
   md<-s/q
   fimse
    st<-st+x
    mt<-st/100
fimpara
escreval("quantidade de números positivos digitados",q)
escreval("números positivos somados",s)
escreval("média dos números positivo digitados",md)
escreval("todos os números somados",st)
escreval("média de todos os números",mt)
fimalgoritmo
