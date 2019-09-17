#include<iostream>
#include<conio.h>
using namespace std;
main()
{ char SEXO[6];
  int IDADE[6], QUANT=0, QUANTM=0,SOMAI=0,SOMAIF=0,MEDIAIF=0;
  float IDADEM=0;
  for (int I=0; I<6; I++)
  { cout<<"Digite a idade ";
    cin>>IDADE[I];
    cout<<" Digite o sexo ";
    cin>>SEXO[I];
  if (SEXO[I]=='F')
 { QUANT=QUANT+1;
   SOMAIF=SOMAIF+IDADE[I];
 
}
 else 
 { QUANTM=QUANTM+1;
}
SOMAI=SOMAI+IDADE[I];
}
IDADEM=SOMAI/6;
MEDIAIF=SOMAIF/QUANT;
cout<<"Quantidade de mulheres "<<QUANT<<endl; 
cout<<"Quantidade de homens "<<QUANTM<<endl;
cout<<"Idade media "<<IDADEM<<endl;
cout<<"Idade media das mulheres "<<MEDIAIF<<endl;
getch();
}
