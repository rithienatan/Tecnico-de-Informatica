algoritmo "exemplo"

var
 cod,r:literal
 Q,T:real
inicio
repita
  escreval("código do produto")
  leia(cod)
  escreval("quantidade desejada")
  leia(q)

escolha (cod)
  caso "100"
    T<-T+Q*1.20
  caso "101"
    T<-T+Q*1.30
  caso "102"
    T<-T+Q*1.50
    escreval("gratis um refrigerante")
  caso "103"
    T<-T+Q*1.30
  outrocaso
    escreval("código invalido")
fimescolha
escreva("deseja mais alguma coisa, senhor(a)?")
leia(r)
ate (r="n")
escreval("total a pagar",t)
fimalgoritmo
