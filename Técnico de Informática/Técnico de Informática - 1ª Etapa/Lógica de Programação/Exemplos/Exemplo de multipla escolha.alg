algoritmo "venda"

var
preco,desconto,preco_final,parcela,valor_final:real
forma_pg:literal
inicio
escreva("preço do produto")
leia(preco)
escreva("forma de pagamento 1-À vista, 2-Cartão de Crédito, 3-Parcelado em duas vezes, 4-Parcelado em três vezes")
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
      escreva("três parcelas de", parcela)
   fimescolha
escreva("valor inicial do produto",preco)
escreva("valor final do produto",valor_final)
fimalgoritmo
