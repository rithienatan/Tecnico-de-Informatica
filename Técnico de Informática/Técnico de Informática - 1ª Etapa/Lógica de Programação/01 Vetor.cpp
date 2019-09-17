#include<iostream>
#include<conio.h>
using namespace std;
main()
{ 
  int NUM[10],NEG=0; //NUM = numeros para digitar, NEG = números negativos
  float SOMAN=0,SOMAT=0; //SOMAN= soma dos números negativos, SOMAT= Soma total
  for(int X=0;X<10;X++)
  {cout<< "Digite um numero: "<<endl;
   cin>> NUM[X];
   if (NUM[X]<0)
   { NEG = NEG+1;
    SOMAN = SOMAN+NUM[X];
   }
  SOMAT = (SOMAT+NUM[X]);
  }
  cout<< "Numeros negativos:\n";
  for(int X=0;X<10;X++)
  { if (NUM[X]<0)
    {cout<<NUM[X]<<endl;
    }
  }
  cout<< "Soma dos numeros negativos: "<<SOMAN<<endl;
  cout<< "Soma total dos numeros: "<<SOMAT<<endl;
  getch();
}
