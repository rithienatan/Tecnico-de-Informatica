#include<iostream>
#include<conio.h>
using namespace std;
main()

{float sb,ts,i,g,sl;
 char c[10];
       cout<<"Codigo do Funcionario: "<<endl;
       cin>>c;
       cout<<"Salario Base: "<<endl;
       cin>>sb;
       cout<<"Tempo de Trabalho: "<<endl;
       cin>>ts;
       if (sb<545)
       { cout<<"Insento de Imposto"<<endl;
       }
            else if ((sb>=545)and(sb<2700))
            { i=sb*6/100;
            }
                else if (sb>=2700)
                { i=sb*12/100;
                }
       cout<<"Imposto: "<<i<<endl;
       if (ts<36)
       { g=150;
       }
          else if ((ts>36)and(ts<60))
          { g=200;
          }
            else if (ts>60)
            { g=300;
            }
       cout<<"Gratificacao: "<<g<<endl;
       sl=sb-i+g;
       cout<<"Salario Liquido: "<<sl<<endl;
 getch();
}
