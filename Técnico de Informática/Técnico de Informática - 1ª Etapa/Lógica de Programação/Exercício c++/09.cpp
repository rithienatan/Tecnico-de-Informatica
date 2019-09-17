#include<iostream>
#include<conio.h>
using namespace std;
main()
{   int A, B, C, MAIOR, MENOR, MEDIO;
    cout<<"Informe os Numeros\n";
    cin>>A>>B>>C;
    if ((A<B)and(A<C))
    { MENOR=A;
      if (B<C)
      { MEDIO=B;
        MAIOR=C;
      }
      else
      { MEDIO=C;
        MAIOR=B;
      }
    }
    else
    { if ((B<A)and(B<C))
      { MENOR=B;
        if (A<C)
        { MEDIO=A;
          MAIOR=C;
        }
        else
        { MEDIO=C;
          MAIOR=A;
        }
      }
      else
      { MENOR=C;
        if (A>B)
        { MEDIO=A;
          MAIOR=B;
        }
        else
        { MEDIO=B;
          MAIOR=A;
        }
      }
    }
cout<<"Numeros em ordem crescente \n";
cout<<MENOR<<" "<<MEDIO<<" "<<MAIOR<<" ";
getch();
}
