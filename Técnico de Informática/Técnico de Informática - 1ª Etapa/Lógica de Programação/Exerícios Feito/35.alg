algoritmo "pesquisa"
var
sexo,resposta:literal
quant_fs,quant_f,X:inteiro
porc_fs:real
inicio
para X de 1 ate 5 passo 1 faca
 escreval("sexo da pessoa")
 leia(sexo)
 escreva("gostou do produto?")
 leia(resposta)
  se(sexo="f")entao
   quant_f<-quant_f+1
  se(resposta="s")entao
   quant_fs<-quant_fs+1
  fimse
  fimse
fimpara
 escreval("mulheres que responderam sim",quant_fs)
 porc_fs<-quant_fs*100/quant_f
 escreval("porcentagem de mulheres que respondeu sim",porc_fs)
fimalgoritmo
