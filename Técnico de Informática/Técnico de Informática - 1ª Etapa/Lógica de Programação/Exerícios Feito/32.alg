algoritmo "exercico de fixa��o 1"

var
A,V,cod:caracter
pro,pron:real
inicio
escreval("c�digo da categoria")
leia(cod)
escreval("pre�o do produto")
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
