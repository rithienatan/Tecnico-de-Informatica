algoritmo "exerc�cio 2"

var
rm,s,n,o,l,b,t,rt:real
x:inteiro
r,c:literal
inicio
rt<-0
repita
   escreval("renda mensal:")
   leia(rm)
   rt<-rt+rm
   escreval("regi�o onde mora:")
   leia(r)
   escolha (r)
    caso "sul"
      s<-s+1
    caso "norte"
      n<-n+1
    caso "leste"
      l<-l+1
    caso "oeste"
      o<-o+1
    outrocaso
     escreval("essa regi�o n�o existe")
   fimescolha
escreval("deseja cadastrar outro entrevistado?")
leia(c)
ate (c="n")
escreval("quantidade de pessoas entrevistadas na regi�o sul",s)
escreval("quantidade de pessoas entrevistadas na regi�o norte",n)
escreval("quantidade de pessoas entrevistadas na regi�o leste",l)
escreval("quantidade de pessoas entrevistadas na regi�o oeste",o)
t<-s+n+l+o
escreval("total de pessoas enntrevistadas",t)
escreval("renda somada dos entrevistados registrados",rt)
b<-rt/t
escreval("renda m�dia das pessoas que moram na cidade",b)
fimalgoritmo
