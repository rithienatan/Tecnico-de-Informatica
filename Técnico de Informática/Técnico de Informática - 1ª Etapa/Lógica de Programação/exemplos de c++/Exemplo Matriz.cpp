#include<iostream>
#include<conio.h>
using namespace std;
main()
{ int MAT[2][3];
  for (int L=0; L<2; L++)
  { for (int C=0; C<=2; C++)
    { cout<<"posicao "<<L<<C<<" ";
      cin>>MAT[L][C];
    }
}
cout<<"Exibicao da matriz "<<endl;
for (int L=0; L<2; L++)
{ for (int C=0; C<=2; C++)
 { cout<<MAT[L][C]<<"\t";
 }
 cout<<endl;
 }
 getch();
}
 
