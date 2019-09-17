#include<iostream>
#include<conio.h>
#include<cmath>
using namespace std;
main()

{ float fA,RA,fB,RB;
  fA=20;  
    cout<<"informe o raio da primeira polia: ";
    cin>>RA;
    cout<<"informe o raio da segunda polia: ";
    cin>>RB;
    fB=fA*RA/RB;
    cout<<"rotacoes por minuto da segunda polia: "<<fB;
    getch();
}
