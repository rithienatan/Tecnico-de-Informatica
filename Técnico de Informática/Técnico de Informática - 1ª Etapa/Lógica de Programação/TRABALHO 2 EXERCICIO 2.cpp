#include<iostream>
#include<conio.h>
using namespace std;
main()
{ int MATRIZ[5][2];
  float TOTAL=0;
  for (int PROD=0; PROD<5; PROD++)
  {for (int QUANT=0; QUANT<=1; QUANT++)
    {cout<<"PRODUTO "<<PROD<<QUANT<<" ";
     cin>>MATRIZ[PROD][QUANT];
     TOTAL=MATRIZ[PROD][2]*MATRIZ[5][QUANT];
    }
  }
  cout<<"QUANTIDADE"<<"\t"<<"PRECO"<<endl;
  for (int PROD=0; PROD<5; PROD++)
  {for (int QUANT=0; QUANT<=1; QUANT++)
    {cout<<MATRIZ[PROD][QUANT]<<"\t";
    }
    cout<<endl;
    } 
    cout<<"Valor total: "<<TOTAL;
    getch();
}

    
