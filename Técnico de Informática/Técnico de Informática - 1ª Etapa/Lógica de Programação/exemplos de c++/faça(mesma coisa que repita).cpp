#include<iostream>
#include<conio.h>
using namespace std;
main()
{float NUM, SOMA=0;
 int I=1;
 do
 { cout<<"Informe o numero"<<endl;
   cin>>NUM;
   SOMA = SOMA + NUM;
   I = I + 1;
 }
 while (I<=5);
 cout<<"Resultado"<<SOMA<<endl;
getch();
}
