/*PROGRAMA QUE RECEBE 5 N�MEROS DIGITADOS PELO USUS�RIO, CALCULA A SOMA ENTRE ELES DOS N�MEROS 
E MOSTRA PARA O USU�RIO*/
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
