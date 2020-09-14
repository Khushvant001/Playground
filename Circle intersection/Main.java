#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,b,c,p,e,f;
  cin>>a>>b>>c>>p>>e>>f;
  int r = c + f;
  int x = (a-p)*(a-p);
  int y = (b-e)*(b-e);
  int d= sqrt(x+y);
  if(d < r){
  	cout<<"Overlap";
  }
  else if(d == r){
  	cout<<"Tangential";
  }
  else{
    cout<<"Do not Overlap";
  }
}