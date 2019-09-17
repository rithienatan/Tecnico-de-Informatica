/*Programa que recebe 5 números digitados pelo usuários e, calcula e mostra a soma dos números*/
#include<iostream>
#include<conio.h>
using namespace std;
main()
{float NUM, SOMA=0;
    for (int I=1; I<=5; I=I+1)
    { cout<<"Informe o numero"<<endl;
      cin>> NUM;
      SOMA = SOMA + NUM;
    }
    cout<<"Resultado"<<SOMA<<endl;
getch();
}

