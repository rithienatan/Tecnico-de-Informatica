algoritmo "exercício 1"

var
x:inteiro
sb,i,g,sl:real
cat:literal
inicio
para x de 1 ate 20 passo 1 faca
   escreval("salário bruto:")
   leia(sb)
   escreval("catégoria:")
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
     escreval("essa catégoria não existe")
   fimescolha
escreval("gratificação",g)
escreval("imposto á pagar",i)
escreval("salário líquido",sl)
fimpara
fimalgoritmo
