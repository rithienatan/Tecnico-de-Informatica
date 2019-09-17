#include<conio.h>
#include<iostream>
using namespace std;
main()
{float num;
 cout<<"informe o numero";
 cin>>num;
 if(num>0)
  {cout<<"positivo";
  }
  else
  {if(num<0)
     {cout<<"negativo";
     }
     else
     {cout<<"nulo";
     }  
  }
 getch();
}
