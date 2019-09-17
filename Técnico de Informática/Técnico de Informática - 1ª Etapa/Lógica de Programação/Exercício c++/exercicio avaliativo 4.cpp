#include<iostream>
#include<conio.h>
using namespace std;
main()

{float d,t,v;
 char c[10];
     cout<<"Codigo do Veiculo"<<endl;
     cin>>c;
     cout<<"Distancia percorrida em metros: "<<endl;
     cin>>d;
     cout<<"Tempo gasto pelo veiculo em segundos"<<endl;
     cin>>t;
     v=(d/t)*3.6;
     cout<<"velocidade media do veiculo em km/h: "<<v<<endl;
     if (v<80)
     { cout<<"Desclassificado"<<endl;
     }
        else if ((v>=80)and(v<100))
        { cout<<"Classificado"<<endl;
        }
           else if (v>=100)
           { cout<<"Desclassificado"<<endl;
           }
     getch();
}
