algoritmo "venda"

var
preco,desconto,preco_final,parcela,valor_final:real
forma_pg:literal
inicio
escreva("pre�o do produto")
leia(preco)
escreva("forma de pagamento 1-� vista, 2-Cart�o de Cr�dito, 3-Parcelado em duas vezes, 4-Parcelado em tr�s vezes")
leia(forma_pg)
   escolha(forma_pg)
     caso "1"
      desconto<-preco*10/100
      preco_final<-preco-desconto
     caso "2"
        desconto<-preco*5/100
        preco_final<-preco-desconto
     caso "3"
       desconto<-preco*5/100
       preco_final<-preco+juros
       parcela<-valor_final/2
       escreva("duas parcelas de", parcela)
     caso "4"
      desconto<-preco*10/100
      preco_final<-preco+juros
      parcela<-valor_final/3
      escreva("tr�s parcelas de", parcela)
   fimescolha
escreva("valor inicial do produto",preco)
escreva("valor final do produto",valor_final)
fimalgoritmo
