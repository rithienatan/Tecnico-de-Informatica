#include <iostream>
#include <conio.h>
using namespace std;
main()
{ float quant[10],preco[10],subt=0,total=0;
  for (int k=0; k<10; k++)
    { cout<<"Informe a quantidade: "<<endl;
      cin>>quant[k];
      cout<<"Informe o preco: R$ "<<endl;
      cin>>preco[k];
      subt=quant[k]*preco[k];
      cout<<"Subtotal do estoque: R$"<<subt<<endl;
      total=subt+total;
    }
cout<<"Quantidade"<<"\t"<<"Preco"<<endl;  
for (int k=0; k<10; k++)
 { cout<< quant[k]<<"\t"<<preco[k]<<endl;
  } 
cout<<"Valor do estoque: R$"<<total<<endl;
getch();
}

   
