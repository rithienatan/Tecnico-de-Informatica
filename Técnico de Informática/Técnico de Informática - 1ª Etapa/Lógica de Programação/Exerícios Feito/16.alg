algoritmo "Aluno Rithie"
var
N, F, P, A, C: real
ALUNO: literal
inicio
escreval("nome do aluno")
leia(ALUNO)
escreval("nota de portugu�s ")
leia(P)
escreval("nota de matem�tica ")
leia(A)
escreval("nota de f�sica ")
leia(C)
escreval("frequ�ncia")
leia(F)
   N<-P+A+F
       se(N>=0)e(F>0.75) entao
         escreval("Reprovado")
         senao
          se(N<40)e(F>=0)
          escreval("reprovado")
          senao
           se(N>=40)e(F>=0.75) entao
           escreval("recupera��o")
           senao
            se(N>=60)e(F>=0.75)
            escreval("aprovado")
           fimse
          fimse
         fimse
        fimse

fimalgoritmo
