algoritmo "exercicio 4"

var
q,s,md,st,mt:real
y,x:inteiro
inicio
para y de 1 ate 100 passo 1 faca
  escreval("insira um n�mero")
  leia(x)
   se (x>0) entao
   q<-q+1
   s<-s+x
   md<-s/q
   fimse
    st<-st+x
    mt<-st/100
fimpara
escreval("quantidade de n�meros positivos digitados",q)
escreval("n�meros positivos somados",s)
escreval("m�dia dos n�meros positivo digitados",md)
escreval("todos os n�meros somados",st)
escreval("m�dia de todos os n�meros",mt)
fimalgoritmo
