algoritmo "exerc�cio 3"

var
num0,num1,num2,num3,media:real
p,s,c:literal
inicio
   escreval("satisfa��o com os servi�os prestados")
   leia(p)
   escolha (p)
    caso "0"
      escreval("Insatisfeito")
      num0<-num0+0
    caso "1"
      escreval("Pouco Satisfeito")
      num1<-num1+1
    caso "2"
      escreval("Satisfeito")
      num2<-num2+2
    caso "3"
      escreval("Muito Satisfeito")
      num3<-num3+3
    outrocaso
     escreval("op��o inv�lida")
   fimescolha

   escreval("satisfa��o com os custos dos servi�os")
   leia(s)
   escolha (s)
    caso "0"
      escreval("Insatisfeito")
      num0<-num0+0
    caso "1"
      escreval("Pouco Satisfeito")
      num1<-num1+1
    caso "2"
      escreval("Satisfeito")
      num2<-num2+2
    caso "3"
      escreval("Muito Satisfeito")
      num3<-num3+3
    outrocaso
     escreval("op��o inv�lida")
   fimescolha

   escreval("satisfa��o com o relacionamento empresa/cliente")
   leia(c)
   escolha (c)
    caso "0"
      escreval("Insatisfeito")
      num0<-num0+0
    caso "1"
      escreval("Pouco Satisfeito")
      num1<-num1+1
    caso "2"
      escreval("Satisfeito")
      num2<-num2+2
    caso "3"
      escreval("Muito Satisfeito")
      num3<-num3+3
    outrocaso
     escreval("op��o inv�lida")
   fimescolha

media<-num0/3+num1/3+num2/3+num3/3
escreval("m�dia das notas",media)
fimalgoritmo
