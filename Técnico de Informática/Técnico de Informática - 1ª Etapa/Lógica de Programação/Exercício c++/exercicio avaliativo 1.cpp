#include<iostream>
#include<conio.h>
using namespace std;
main()

{float num1,num2,num3;
    cout<<"informe o primeiro lado"<<endl;
    cin>>num1;
    cout<<"informe o segundo lado"<<endl;
    cin>>num2;
    cout<<"informe o terceiro lado"<<endl;
    cin>>num3;
  if ((num1==num2) and (num1==num3) and (num2==num3))
  { cout<<"triangulo equilatero"<<endl;
  }
  else if ((num1==num2) or (num1==num3) or (num2==num3))
  { cout<<"triangulo isosceles"<<endl;
  }
  else if ((num1!=num2) and (num1!=num3) and (num2!=num3))
  { cout<<"triangulo escaleno"<<endl;
  }
  getch();
}
