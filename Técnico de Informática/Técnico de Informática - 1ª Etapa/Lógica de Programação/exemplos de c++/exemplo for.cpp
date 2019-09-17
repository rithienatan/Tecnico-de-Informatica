#include<iostream>
#include<conio.h>
using namespace std;
main()
{ char SEXO, RESP;
  int FEM_SIM=0, TOTAL_FEM=0;
  float PORCENT;
  for
   (int I=1; I<=5; I++)
  { cout<<"Sexo da pessoa F/M";
    cin>>SEXO;
    cout<<"Gostou do produto? S/N";
    cin>>RESP;
    if (SEXO=='F')
    { TOTAL_FEM = TOTAL_FEM +1;
      if (RESP=='S')
      { FEM_SIM = FEM_SIM +1;
      }
    }
  }
  PORCENT = FEM_SIM*100/TOTAL_FEM;
  cout<<"Mulheres que gostaram"<<FEM_SIM<<endl;
  cout<<"Porcentagem de mulheres"<<PORCENT<<endl;
  getch();
}
