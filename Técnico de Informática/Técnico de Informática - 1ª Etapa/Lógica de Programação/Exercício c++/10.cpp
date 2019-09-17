#include<iostream>
#include<conio.h>
using namespace std;
main()
{
 float vi,p,fr;
 char cod;
   cout<<"VALOR DO INVESTIMENTO \n";
   cin>>vi;
   cout<<"CODIGO DO INVESTIMENTO \n";
   cin>>cod;
   switch(cod)
   {  case '1':{ p=1/100;
                 cout<<"Poupanca \n"<<p;
              }break;
      case '2':{ fr=2.5/100;
                 cout<<"Fundo de Poupanca Fixa \n"<<fr;
              }break;          
   }          
   getch();
}
