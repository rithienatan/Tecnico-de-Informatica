/*PROGRAMA QUE RECEBE 5 NÚMEROS DIGITADOS PELO USUSÁRIO, CALCULA A SOMA ENTRE ELES DOS NÚMEROS 
E MOSTRA PARA O USUÁRIO*/
#include<iostream>
#include<conio.h>
using namespace std;
main()
{ float NUM[5], SOMA=0;
 for (int I=0; I<5; I++)
  { cout<<"Digite o numero ";
    cin>>NUM[I];
    SOMA=SOMA+NUM[I];
  }
  cout<<"Exibicao do vetor "<<endl;
  for (int I=0; I<5; I++)
  { cout<<NUM[I]<<endl; 
  }   
    cout<<"Resultado "<<SOMA;
  
    getch();
 }
