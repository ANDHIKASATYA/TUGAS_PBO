#include <iostream>
using namespace std;
int main() {
    int x, y, baris, kolom, matriks1[20][20], matriks2[20][20], hasil[20][20];
    char pilih;
    do{
    cout<<"=======PROGRAM PERKALIAN MATRIKS=======\n"<<endl;
  	cout<<"Masukkan banyak baris matriks: ";cin>>baris;
  	cout<<"Masukkan banyak kolom matriks: ";cin>>kolom;
	cout<<"Masukkan elemen matrix 1: \n";
    for(x = 0; x < baris; x++){
    	for(y = 0; y < kolom; y++){
        	cin >> matriks1[x][y];
    	}
   }
    cout<<"Masukkan elemen matrix 2: \n";
    for(x = 0; x < baris; x++){
    	for(y = 0; y < kolom; y++){
     	    cin>>matriks2[x][y];
  		}
   }
    cout<<"hasil perkalian matrix: \n";
  	for(x = 0; x < baris; x++){
    	for(y = 0; y < kolom; y++){
      		hasil[x][y] = matriks1[x][y] * matriks2[x][y];
      		cout << hasil[x][y] << "\t";
    		}
    	cout<<endl;
  	}
  	cout<<"\n======================================="<<endl;
  	cout <<"\n\nApakah anda ingin Mengulang Program Y/N : ";
    cin >> pilih;
    cout <<"\n";
    if (pilih=='N'){
    	cout<<"Anda telah keluar dari program";
	}
    
}while (pilih =='Y');
    
   return 0;
}
