algoritmo "pesquisa"

var
nome,sexo,ec,resp:literal
soma_I,quant_P,idade,homens_C,quant_H,quant_M:inteiro
media_I,porc_H,porc_M:real
inicio
  repita
   escreval("nome da pessoa")
   leia(nome)
   escreval("idade da pessoa")
   leia(idade)
   escreval("sexo da pessoa")
   leia(sexo)
   escreval("estado civil")
   leia(ec)
    se (sexo="m")e(ec="c")e(idade>25)e(idade<40)entao
     homens-c<-homens-c+1
    fimse
     soma_I<-soma_I+idade
     quant_P<-quant_P+1
    se(sexo="f")entao
     quant_M<-quant_M+1
     senao
     quant_H<-quant_H+1
    fimse
     escreval("deseja cadastrar mais clientes?")
     leia(resp)
    ate(resp="n")
     media_I<-soma_I/quant_P
     porc_H<-quant_H*100/quant_P
     porc_M<-quant_M*100/quant_P
      escreval("homens casados com idade entre 25 e 40 anos",homens_C)
      escreval("média de idade dos clientes",media_I)
      escreval("porcentagem de homens",porc_H)
      escreval("porcentagem de mulheres",porc_M)
fimalgoritmo
