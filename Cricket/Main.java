#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  float x = a/6;
  float y = d/6 + (d%6)*0.1;
  float z = c / y;
  float w = b / x;
  cout<<fixed<<setprecision(0)<<x<<endl<<setprecision(1)<<y<<endl<<z<<endl<<w<<endl;
  if( z > w){
  	cout<<"Eligible to Win";
  }
  else{
  	cout<<"Not Eligible to Win";
  }
  
}