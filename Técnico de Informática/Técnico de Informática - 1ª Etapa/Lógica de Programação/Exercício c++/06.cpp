#include<iostream>
#include<conio.h>
using namespace std;
main()

{ char mat[8];  
  float sal_m, horast, valorh, sal_b, imposto, sal_l;
    cout<<"matricula do funcionario: ";
    gets(mat);
    cout<<"horas trabalhadas: ";
    cin>>horast;
    cout<<"salario minimo: ";
    cin>>sal_m;
    valorh = sal_m/10;
    sal_b = horast * valorh;
    imposto = sal_b * 3/100;
    sal_l = sal_b - imposto;
  cout<<"matricula do funcionario: "<<mat<<endl;
  cout<<"horas trabalhadas: "<<horast<<endl;
  cout<<"salario minimo: "<<sal_m<<endl;
  cout<<"valor de hora trabalhada: "<<valorh<<endl;
  cout<<"salario bruto: "<<sal_b<<endl;
  cout<<"imposto: "<<imposto<<endl;
  cout<<"salario liquido: "<<sal_l<<endl;
    getch();
    
}
