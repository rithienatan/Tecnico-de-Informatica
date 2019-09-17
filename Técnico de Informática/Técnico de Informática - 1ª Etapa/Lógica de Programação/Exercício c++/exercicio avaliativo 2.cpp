#include<iostream>
#include<conio.h>
#include<cmath>
using namespace std;
main()

{float a,b,c,delta,xy,xz,xw;
     cout<<"informe o A: "<<endl;
     cin>>a;
     cout<<"informe o B: "<<endl;
     cin>>b;
     cout<<"informe o C: "<<endl;
     cin>>c;
     delta=(pow(b,2))-4*a*c;
     cout<<"valor do delta: "<<delta<<endl;
     if (delta>0)
     { xy=-(b+sqrt(delta))/2*a;     
       xz=-(b-sqrt(delta))/2*a;       
       cout<<" X 1 linha: "<<xy<<endl;
       cout<<" X 2 linha: "<<xz<<endl;
     }
         else if (delta==0)
         { xy=-(b+sqrt(delta))/2*a;           
           xz=-(b-sqrt(delta))/2*a;
           cout<<"raiz: "<<xy<<endl;
           cout<<"raiz: "<<xz<<endl;
         }     
     getch();
}
