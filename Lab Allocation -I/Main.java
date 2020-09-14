#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if (a < b){
  	if(a < c){
    	cout<<"L1";
    }
    else{
    	cout<<"L3";
    }
  }
  else{
  	if(b < c){
    	cout<<"L2";
    }
    else{
    	cout<<"L3";
    }
  }
}