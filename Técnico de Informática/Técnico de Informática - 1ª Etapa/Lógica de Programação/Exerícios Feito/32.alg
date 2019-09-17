algoritmo "exercico de fixação 1"

var
A,V,cod:caracter
pro,pron:real
inicio
escreval("código da categoria")
leia(cod)
escreval("preço do produto")
leia(pro)

      escolha(cod)
        caso"A"
         pron<-pro*8/100
         escreval("reajuste",pron)
        caso"V"
         pron<-pro*10/100
         escreval("reajuste",pron)
      fimescolha
fimalgoritmo
