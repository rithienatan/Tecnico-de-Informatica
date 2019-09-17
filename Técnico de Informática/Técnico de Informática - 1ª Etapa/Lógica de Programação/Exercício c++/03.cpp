#include<iostream>
#include<conio.h>
#include<cmath>
using namespace std;
main()

{ float no1,no2,no3,no4,media;
    cout<<"informe o primeira nota: ";
    cin>>no1;
    cout<<"informe a segunda nota: ";
    cin>>no2;
    cout<<"informe a terceira nota: ";
    cin>>no3;
    cout<<"informe a quarta nota: ";
    cin>>no4;
    media=no1/4+no2/4+no3/4+no4/4;
    cout<<"media das notas: "<<media;
    getch();
}
