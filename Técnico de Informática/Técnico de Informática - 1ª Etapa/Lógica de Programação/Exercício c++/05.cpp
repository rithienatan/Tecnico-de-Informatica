#include<iostream>
#include<conio.h>
#include<cmath>
using namespace std;
main()

{ float R,volume,area,comprimento;  
    cout<<"informe o raio da esfera: ";
    cin>>R;
    comprimento=2*3.14*pow(R,2);
    cout<<"comprimento da esfera: "<<comprimento<<endl;
    area=3.14*pow(R,2);
    cout<<"area da esfera: "<<area<<endl;
    volume=3.14*pow(R,3)*3/4;
    cout<<"volume da esfera: "<<volume<<endl;
    getch();
}
