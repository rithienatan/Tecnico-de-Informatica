algoritmo "frigorifico"
var
x: inteiro
ID, ID_MaiorP: literal
peso, maior_peso: real
inicio
para x de 1 ate 3 passo 1 faca
escreval ("informe o peso do boi")
leia (peso)
escreval ("informe o numero de identificação do boi")
leia (ID)
se (x=1) entao
maior_peso<-peso
ID_MaiorP<-ID
fimse
se (peso>maior_peso) entao
maior_peso<-peso
ID_MaiorP<-ID
fimse
fimpara
escreval ("identificação do boi mais gordo", ID_MaiorP)
escreval ("peso do boi mais gordo", Maior_Peso)
fimalgoritmo
