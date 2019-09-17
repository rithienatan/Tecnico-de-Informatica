#include<iostream>
#include<conio.h>
#include<cmath>
using namespace std;
main()
{float QKM,ND,VKMR,VP,VDC;
 char T; 
  VKMR=1.5;
 cout<<"INFORME A QUANTIDADE DE KM RODADOS: ";
 cin>>QKM;
 cout<<"INFORME O NUMERO DE DIAS QUE O CARRO FICOU ALUGADO: ";
 cin>>ND;
  if(QKM>1000)
    {switch(T)
      { case '1' : { cout<<"CARRO: UNO";
                     VDC=30;
                     cout<<"VALOR DA DIARIA DO CARRO: "<<VDC;
                     VP=ND*VDC;
                   } break;
        case '2' : { cout<<"CARRO: GOL";
                     VDC=45;
                     cout<<"VALOR DA DIARIA DO CARRO: "<<VDC;
                     VP=ND*VDC;
                   } break;
        case '3' : { cout<<"CARRO: CORSA";
                     VDC=35;
                     cout<<"VALOR DA DIARIA DO CARRO: "<<VDC;
                     VP=ND*VDC;
                   } break; 
        case '4' : { cout<<"CARRO: PALIO";
                     VDC=50;
                     cout<<"VALOR DA DIARIA DO CARRO: "<<VDC;
                     VP=ND*VDC;
                   } break;
      }
    }
    else
    {if(QKM<=1000)  
       {VP=VKMR*QKM;
       }
  cout<<"TAXA COBRADA POR KM RODADO: "<<VKMR;
  cout<<"VALOR A PAGAR: "<<VP;
 getch();
 }
}                                   
