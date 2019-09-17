algoritmo "Aluno Rithie"
var
N, F, P, A, C: real
ALUNO: literal
inicio
escreval("nome do aluno")
leia(ALUNO)
escreval("nota de português ")
leia(P)
escreval("nota de matemática ")
leia(A)
escreval("nota de física ")
leia(C)
escreval("frequência")
leia(F)
   N<-P+A+F
       se(N>=0)e(F>0.75) entao
         escreval("Reprovado")
         senao
          se(N<40)e(F>=0)
          escreval("reprovado")
          senao
           se(N>=40)e(F>=0.75) entao
           escreval("recuperação")
           senao
            se(N>=60)e(F>=0.75)
            escreval("aprovado")
           fimse
          fimse
         fimse
        fimse

fimalgoritmo
