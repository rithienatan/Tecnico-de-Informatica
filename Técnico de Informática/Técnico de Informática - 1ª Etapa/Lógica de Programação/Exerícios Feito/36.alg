algoritmo "exerc�cio 1"

var
x:inteiro
sb,i,g,sl:real
cat:literal
inicio
para x de 1 ate 20 passo 1 faca
   escreval("sal�rio bruto:")
   leia(sb)
   escreval("cat�goria:")
   leia(cat)
   se (sb<1000) entao
    i<-5/100
   senao se (sb>=1000) entao
    i<-8/100
   fimse
   escolha (cat)
    caso "a"
     g<-sb*2/100
     sl<-sb+g-i
    caso "b"
     g<-sb*5/100
     sl<-sb+g-i
    caso "c"
     g<-sb*10/100
     sl<-sb+g-i
    outrocaso
     escreval("essa cat�goria n�o existe")
   fimescolha
escreval("gratifica��o",g)
escreval("imposto � pagar",i)
escreval("sal�rio l�quido",sl)
fimpara
fimalgoritmo
