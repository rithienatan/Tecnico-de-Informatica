algoritmo "exercício 2"

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
   escreval("região onde mora:")
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
     escreval("essa região não existe")
   fimescolha
escreval("deseja cadastrar outro entrevistado?")
leia(c)
ate (c="n")
escreval("quantidade de pessoas entrevistadas na região sul",s)
escreval("quantidade de pessoas entrevistadas na região norte",n)
escreval("quantidade de pessoas entrevistadas na região leste",l)
escreval("quantidade de pessoas entrevistadas na região oeste",o)
t<-s+n+l+o
escreval("total de pessoas enntrevistadas",t)
escreval("renda somada dos entrevistados registrados",rt)
b<-rt/t
escreval("renda média das pessoas que moram na cidade",b)
fimalgoritmo
