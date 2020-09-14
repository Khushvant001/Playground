#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  if(a > 100){
  	cout<<"Invalid Input";
  }
  if(a == 100){
  	cout<<"S";
  }
  if(a >= 90 and a <=99){
  	cout<<"A";
  }
  if(a >= 80 and a <=89){
  	cout<<"B";
  }
  if(a >= 70 and a <=79){
  	cout<<"C";
  }
  if(a >= 60 and a <=69){
  	cout<<"D";
  }
  if(a >= 50 and a <=59){
  	cout<<"E";
  }
  if(a < 50){
  	cout<<"F";
  }
}